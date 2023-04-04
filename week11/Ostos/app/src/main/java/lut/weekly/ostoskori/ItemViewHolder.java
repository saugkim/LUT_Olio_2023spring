package lut.weekly.ostoskori;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

public class ItemViewHolder extends RecyclerView.ViewHolder {

    Item currentItem;
    TextView textView;
    ImageView removeButton, editButton;

    public ItemViewHolder(@NonNull View itemView) {
        super(itemView);

        textView = itemView.findViewById(R.id.itemTextView);
        removeButton = itemView.findViewById(R.id.removeItem);
        editButton = itemView.findViewById(R.id.editItem);
    }


    public void bind(Item item) {
        currentItem = item;
        textView.setText(item.toString());
    }

    static ItemViewHolder create(ViewGroup parent) {
        View view = LayoutInflater.from(parent.getContext())
                .inflate(R.layout.item_layout, parent, false);

        return new ItemViewHolder(view);
    }
}
