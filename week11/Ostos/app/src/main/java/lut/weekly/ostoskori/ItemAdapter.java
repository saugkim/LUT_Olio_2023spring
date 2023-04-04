package lut.weekly.ostoskori;

import android.content.Context;
import android.content.Intent;
import android.util.Log;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class ItemAdapter extends RecyclerView.Adapter<ItemViewHolder> {
    ArrayList<Item> items;
    static final String ITEM_INDEX_KEY = "lut.weekly.ostoskori.item_index_key";

    public ItemAdapter(ArrayList<Item> items, Context context) {
        this.items = items;
    }

    @NonNull
    @Override
    public ItemViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        return ItemViewHolder.create(parent);
    }

    @Override
    public void onBindViewHolder(@NonNull ItemViewHolder holder, int position) {

        Item item = items.get(position);
        holder.bind(item);
        int index = holder.getAdapterPosition();

        holder.removeButton.setOnClickListener(v -> {
            ItemRepository.getInstance().removeItem(item);
            notifyItemRemoved(position);
        });

        holder.editButton.setOnClickListener(v-> {
            Log.d("ZZ adapter", "position = " + position);
            Log.d("ZZ adapter", "getAdapterPosition " + holder.getAdapterPosition());
            int itemIndex = holder.getAdapterPosition();

            Intent intent = new Intent(v.getContext(),ManageActivity.class);
            intent.putExtra(ITEM_INDEX_KEY, itemIndex);
            v.getContext().startActivity(intent);
        });
    }

    @Override
    public int getItemCount() {
        return items.size();
    }

}