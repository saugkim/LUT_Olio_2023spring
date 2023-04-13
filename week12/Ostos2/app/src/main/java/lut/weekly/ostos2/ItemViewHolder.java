package lut.weekly.ostos2;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

public class ItemViewHolder extends RecyclerView.ViewHolder {
    Item currentItem;
    TextView textView;
    ImageView imageView;


    public ItemViewHolder(@NonNull View itemView) {
        super(itemView);

        textView = itemView.findViewById(R.id.itemTextView);
        imageView = itemView.findViewById(R.id.isImportant);
    }

    public void bind(Item item) {
        currentItem = item;
        textView.setText(item.toString());
        imageView.setImageResource(item.isImportant ?
                android.R.drawable.btn_star_big_on :
                android.R.drawable.btn_star_big_off);
    }

    static ItemViewHolder create(ViewGroup parent) {
        View view = LayoutInflater.from(parent.getContext())
                .inflate(R.layout.item_layout, parent, false);

        return new ItemViewHolder(view);
    }
}
