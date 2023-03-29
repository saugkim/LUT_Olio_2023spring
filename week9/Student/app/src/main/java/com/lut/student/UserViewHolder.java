package com.lut.student;

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
           storage.removeUser(currentUser);
           return true;
        });

        itemView.setOnClickListener(v -> {
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
