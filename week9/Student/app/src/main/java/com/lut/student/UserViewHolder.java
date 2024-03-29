package com.lut.student;

import android.app.AlertDialog;
import android.graphics.Typeface;
import android.net.Uri;
import android.text.SpannableString;
import android.text.SpannableStringBuilder;
import android.text.style.StyleSpan;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

public class UserViewHolder extends RecyclerView.ViewHolder {

    public final static String TAG = "ZZ UserViewHolder";
    TextView textView;
    ImageView imageView;
    UserStorage storage = UserStorage.getInstance();
    User currentUser;

    public UserViewHolder(@NonNull View itemView) {
        super(itemView);

        textView = itemView.findViewById(R.id.itemText);
        imageView = itemView.findViewById(R.id.itemImage);

        itemView.setOnLongClickListener(v -> {
            AlertDialog.Builder builder = new AlertDialog.Builder(itemView.getContext());
            builder.setTitle("Warning!");
            builder.setMessage("Removing " + currentUser.getFirstName() + " " + currentUser.getLastName() + " permanently.\n\nARE YOU SURE?");
            builder.setPositiveButton("CONFIRM", (dialog, which) -> {
                storage.removeUser(currentUser);
                storage.saveUsersToFile(itemView.getContext()); //??
                Log.d(TAG, "selected user was removed from memory and data file");
                dialog.dismiss();
            });
            builder.setNegativeButton("CANCEL", (dialog, which) -> {
                Log.d(TAG, "Remove user action canceled");
                dialog.dismiss();
            });
            AlertDialog alertDialog = builder.create();
            alertDialog.show();

           // but UI not updating accordingly recyclerview (how to wake up?)
           return true;
        });

        itemView.setOnClickListener(v -> {
            int userIndex = storage.getUsers().indexOf(currentUser);
            updateUser(currentUser);
        });
    }

    public void bind(User user) {
        currentUser = user;

        SpannableStringBuilder ssb = new SpannableStringBuilder(user.toString());
        if (user.getDegrees().size() != 0) {
            String italicText = "\n\n*** Completed degrees ***";
            StyleSpan italicStyle = new StyleSpan(Typeface.ITALIC);
            SpannableString iss = new SpannableString(italicText);
            iss.setSpan(italicStyle, 0, italicText.length(), 0);
            ssb.append(iss);

            for (String s: user.getDegrees()) {
                ssb.append("\n- ");
                ssb.append(s);
            }
        }
        textView.setText(ssb, TextView.BufferType.SPANNABLE);

        if (user.getImageName() != null) {
            Log.d(TAG, "image uri: " + user.getImageName());
            imageView.setImageURI(Uri.parse(user.getImageName()));
        }
    }

    static UserViewHolder create(ViewGroup parent) {
        View view = LayoutInflater.from(parent.getContext())
                .inflate(R.layout.item_view, parent, false);

        return new UserViewHolder(view);
    }

    public void updateUser(User user) {
        //do nothing yet;
    }
}
