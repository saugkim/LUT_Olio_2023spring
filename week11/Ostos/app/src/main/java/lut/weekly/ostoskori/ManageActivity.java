package lut.weekly.ostoskori;

import androidx.appcompat.app.AppCompatActivity;

import android.app.DatePickerDialog;
import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.Locale;

public class ManageActivity extends AppCompatActivity {

    static String TAG = "ZZ ManageActivity";
    static String BUNDLE_KEY_ITEM_ID = "lut.weekly.ostoskori.item_index_key";
    final String DATE_FORMAT = "yyyy-MM-dd.hh:mm";
    EditText nameText, infoText;
    TextView dateText;
    Button addButton, cancelButton;
    boolean gotArgument = false;

    int item_id = -2;
    Date date = new Date();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_manage);

        Bundle bundle = getIntent().getExtras();
        if (bundle != null) {
            gotArgument = true;
            item_id = bundle.getInt(BUNDLE_KEY_ITEM_ID);
        }

        addButton = findViewById(R.id.button2);
        cancelButton = findViewById(R.id.cancelButton);
        nameText = findViewById(R.id.editTextName);
        infoText = findViewById(R.id.editTextInfo);
        dateText = findViewById(R.id.textViewDate);

        if (gotArgument) {
            loadItem();
            addButton.setText(R.string.update_item);
            cancelButton.setText(R.string.delete_item);
            addButton.setOnClickListener(v-> updateItem());
            cancelButton.setOnClickListener(v-> removeItem());
        } else {
            addButton.setText(R.string.add_new_item);
            cancelButton.setText(R.string.cancel);
            addButton.setOnClickListener(v-> addItem());
            cancelButton.setOnClickListener(v-> moveToMain());
        }

        dateText.setOnClickListener(v -> getDatePicker());
    }

    public void moveToMain() {
        item_id = -2;
        startActivity(new Intent(this, MainActivity.class));
    }
    public void removeItem() {
        ItemRepository.getInstance().removeItemById(item_id);
        Toast.makeText(this, "This item was removed", Toast.LENGTH_LONG).show();
        moveToMain();
    }

    public void updateItem() {
        Item item = ItemRepository.getInstance().getItems().get(item_id);

        String name = nameText.getText().toString();
        String info = infoText.getText().toString();

        item.setName(name);
        if (!info.isEmpty()) {
            item.setInfo(info);
        }

        item.setDate(getDateTime(date));
        ItemRepository.getInstance().updateItem(item_id, item);

        moveToMain();
    }

    public void loadItem() {
        Item item = ItemRepository.getInstance().getItems().get(item_id);
        nameText.setText(item.getName());
        if (item.getInfo() != null) {
            infoText.setText(item.getInfo());
        }
        dateText.setText(item.getDate());

        SimpleDateFormat formatter = new SimpleDateFormat(DATE_FORMAT, Locale.getDefault());
        try {
            date = formatter.parse(item.getDate());
        } catch (ParseException e) {
            throw new RuntimeException(e);
        }
    }
    public void addItem() {
        String name = nameText.getText().toString();
        String info = infoText.getText().toString();

        if (name.isEmpty()) {
            Log.d(TAG, "Required field name is empty");
            Toast.makeText(this, "Item is required to fill", Toast.LENGTH_LONG).show();
            return;
        }

        Item item = new Item(name);
        if (!info.isEmpty())
            item.setInfo(info);

        item.setDate(getDateTime(date));
        ItemRepository.getInstance().addItem(item);

        moveToMain();
    }

    public String getDateTime(Date date) {
        SimpleDateFormat dateFormat = new SimpleDateFormat(DATE_FORMAT, Locale.getDefault());
        return dateFormat.format(date);
    }

    public void getDatePicker() {
        Calendar calendar = Calendar.getInstance();
        DatePickerDialog.OnDateSetListener dateSetListener = (view, year, month, day) -> {
            calendar.set(Calendar.YEAR, year);
            calendar.set(Calendar.MONTH, month);
            calendar.set(Calendar.DAY_OF_MONTH, day);
            date = calendar.getTime();
            dateText.setText(getDateTime(calendar.getTime()));
        };
        new DatePickerDialog(this, dateSetListener,
                calendar.get(Calendar.YEAR), calendar.get(Calendar.MONTH), calendar.get(Calendar.DAY_OF_MONTH)).show();

        Log.d(TAG, getDateTime(date));
    }
}