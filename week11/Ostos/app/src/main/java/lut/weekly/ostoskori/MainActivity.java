package lut.weekly.ostoskori;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.widget.Button;
import android.widget.ImageView;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    final static String TAG = "ZZ MainActivity";
    RecyclerView recyclerView;
    Button addButton;
    ImageView sortByDate, sortByName;
    ItemRepository repository;
    ArrayList<Item> items;
    ItemAdapter adapter;

    Comparator<Item> nameComparator;
    Comparator<Item> dateComparator;
    boolean sortedByDate, sortedByNameAscending;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        repository = ItemRepository.getInstance();
        items = repository.getItems();

        if (items.size() == 0)
            addSomeItemsForTest();

        addButton = findViewById(R.id.addButton);
        recyclerView = findViewById(R.id.recyclerView);

        sortByDate = findViewById(R.id.sortByDate);
        sortByName = findViewById(R.id.sortByName);

        nameComparator = Comparator.comparing(Item::getName);
        dateComparator = Comparator.comparing(Item::getDate);

        addButton.setOnClickListener(v-> {
            startActivity(new Intent(this, ManageActivity.class));
        });

        sortByName.setOnClickListener(v-> {
            if (sortedByNameAscending) {
                showSortedResult(nameComparator.reversed());
                sortedByNameAscending = false;
            }
            else {
                showSortedResult(nameComparator);
                sortedByNameAscending = true;
            }
        });

        sortByDate.setOnClickListener(v-> showSortedResult(dateComparator));
//        adapter = new ItemAdapter(repository.getItems(), this);
//        recyclerView.setAdapter(adapter);
//        recyclerView.setLayoutManager(new LinearLayoutManager(this));
    }

    @Override
    protected void onStart() {
        super.onStart();
        submitList(repository.getItems());
    }
    public void submitList(ArrayList<Item> itemList) {
        adapter = new ItemAdapter(itemList, this);
        recyclerView.setAdapter(adapter);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));
    }
    public void showSortedResult(Comparator<Item> comparator) {
        ArrayList<Item> sorted = repository.getItems();
        sorted.sort(comparator);
        submitList(sorted);
    }
    public void addSomeItemsForTest() {
        Item i1 = new Item("Omena");
        Item i2 = new Item("Peruna", "Kotimaan");
        Item i3 = new Item("Kanamuna", "Omega-6");
        Item i4 = new Item("Juusto");
        i1.setDate("2000-06-01.08:20");
        i2.setDate("1990-01-01.08:20");
        i3.setDate("2022-12-03.10:20");
        i4.setDate("2011-09-09.03:20");

        repository.addItem(i1);
        repository.addItem(i2);
        repository.addItem(i3);
        repository.addItem(i4);
    }
}