package com.lut.student;

import androidx.activity.result.ActivityResultLauncher;
import androidx.activity.result.contract.ActivityResultContracts;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.content.ContextCompat;

import android.content.ContentResolver;
import android.content.ContentValues;
import android.graphics.Bitmap;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.os.Environment;
import android.provider.MediaStore;
import android.util.Log;
import android.view.View;
import android.view.inputmethod.InputMethodManager;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.Toast;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;

public class AddActivity extends AppCompatActivity {

    final static String TAG = "ZZ AddActivity";
    final static String USER_INPUT_ERROR = "PLEASE FILL ALL FIELDS, ADD-USER FAILED";

    UserStorage storage;
    EditText firstname, lastname, email;
    RadioButton[] radioButtons;
    RadioGroup radioGroup;
    Button addUserButton;
    Button galleryButton;
    ImageView imageView;
    Uri image_uri;

    final static String REL_LOCATION = Environment.DIRECTORY_DCIM;
    final static String IMAGE_TYPE = "image/png";

    final static String[] DEGREE_PROGRMAS = new String[] {
            "Tietotekniikka",
            "Tuotantotalous",
            "Laskennallinen tekniikka",
            "Sähkötekniikka"
    };

    ActivityResultLauncher<String> mGetContent;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_add);

        storage = UserStorage.getInstance();

        addUserButton = findViewById(R.id.addButton);
        galleryButton = findViewById(R.id.galleryButton);
        imageView = findViewById(R.id.userImage);

        firstname = findViewById(R.id.firstnameText);
        lastname = findViewById(R.id.lastnameText);
        email = findViewById(R.id.emailText);

        radioGroup = findViewById(R.id.radioGroup);
        RadioButton rb0 = findViewById(R.id.rb0);
        RadioButton rb1 = findViewById(R.id.rb1);
        RadioButton rb2 = findViewById(R.id.rb2);
        RadioButton rb3 = findViewById(R.id.rb3);
        radioButtons = new RadioButton[] { rb0, rb1, rb2, rb3 };
        for (int i =0; i< radioButtons.length; i++) {
            radioButtons[i].setText(DEGREE_PROGRMAS[i]);
        }

        resetUI();

        addUserButton.setOnClickListener(view -> addUser());

        galleryButton.setOnClickListener(v-> {
            hideKeyboard();
            getImageFromDevice();
        });

        mGetContent = registerForActivityResult(new ActivityResultContracts.GetContent(),
                uri -> {
                    try {
                        Bitmap bitmap = MediaStore.Images.Media.getBitmap(this.getContentResolver(), uri);
                        imageView.setImageBitmap(bitmap);
                        storeImage(bitmap);
                    } catch (IOException e) {
                        e.printStackTrace();
                    }
                });
    }

    public void getImageFromDevice() {
        mGetContent.launch("image/*");
    }

    public String getDegreeProgram() {
        for (int i = 0 ; i < radioButtons.length ; i++) {
            if (radioButtons[i].isChecked()) {
                Log.i(TAG, "getDegreeProgram(): selected program is " + DEGREE_PROGRMAS[i]);
                return DEGREE_PROGRMAS[i];
            }
        }
        Log.i(TAG, "getDegreeProgram(): degree program not selected by user");
        return null;
    }

    public void addUser()  {
        String mFirstname = firstname.getText().toString();
        String mLastname = lastname.getText().toString();
        String mEmail = email.getText().toString();
        String mDegreeProgram = getDegreeProgram();

        if (mDegreeProgram == null || mFirstname.isEmpty() || mLastname.isEmpty() || mEmail.isEmpty()) {
            Toast.makeText(this, USER_INPUT_ERROR, Toast.LENGTH_LONG).show();
            resetUI();
            return;
        }

        User newUser = new User(mFirstname, mLastname, mEmail, mDegreeProgram);
        if (image_uri != null) {
            Log.d(TAG, "addUser() user selected image and image_uri is " + image_uri);
            newUser.setImageName(image_uri.toString());
        }

        storage.addUser(newUser);
        storage.saveUsersToFile(this);
        Log.i(TAG, "new user added successfully!");
        resetUI();
    }

    public void resetUI() {
        firstname.getText().clear();
        lastname.getText().clear();
        email.getText().clear();
        radioGroup.clearCheck();
        imageView.setImageDrawable(ContextCompat.getDrawable(this, android.R.drawable.ic_menu_gallery));
        image_uri = null;
        hideKeyboard();
    }

    public void hideKeyboard() {
        View view = getWindow().getDecorView().getRootView();
        InputMethodManager inputMethodManager =(InputMethodManager) getSystemService(INPUT_METHOD_SERVICE);
        inputMethodManager.hideSoftInputFromWindow(view.getWindowToken(), 0);
    }


    /**
     * This is for save image_uri to load in list
     * @param bitmap
     * @throws IOException
     */
    public void storeImage(Bitmap bitmap) throws IOException {
        String filename = String.format("%s.png", new SimpleDateFormat("dd-MM-yyyy_HHmmss", Locale.getDefault()).format(new Date()));
        if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.Q)
        {
            ContentResolver resolver = this.getContentResolver();
            ContentValues contentValues = new ContentValues();
            contentValues.put(MediaStore.MediaColumns.DISPLAY_NAME, filename);
            contentValues.put(MediaStore.MediaColumns.MIME_TYPE, IMAGE_TYPE);
            contentValues.put(MediaStore.MediaColumns.RELATIVE_PATH, REL_LOCATION);

            image_uri = resolver.insert(MediaStore.Images.Media.EXTERNAL_CONTENT_URI, contentValues);
            OutputStream fos = resolver.openOutputStream(image_uri);
            bitmap.compress(Bitmap.CompressFormat.PNG, 25, fos);
            fos.flush();
            fos.close();
            Log.d(TAG, "image uri: " + image_uri.toString());
        } else {
            Log.d(TAG, "version is low");
            File mediaStorageLocation = new File(Environment.getExternalStorageDirectory().toString()
                    + "/Images");
            if (! mediaStorageLocation.exists()) {
                if (! mediaStorageLocation.mkdirs()) return;
            }
            File mediaFile = new File(mediaStorageLocation.getPath() + File.separator + filename);
            try {
                FileOutputStream fileOutputStream = new FileOutputStream(mediaFile);
                bitmap.compress(Bitmap.CompressFormat.PNG, 50, fileOutputStream);
                Log.d(TAG, "File saved: " + mediaFile.getName());
                fileOutputStream.close();
                Log.d(TAG, "Abs path: " + mediaFile.getAbsolutePath());
                image_uri = Uri.fromFile(mediaFile);
                Log.d(TAG, "saved file uri: " + image_uri.toString());
            } catch (FileNotFoundException e) {
                Log.d(TAG, "File not found: " + e.getMessage());
            } catch (IOException e) {
                Log.d(TAG, "Error accessing file: " + e.getMessage());
            }
        }
    }
}