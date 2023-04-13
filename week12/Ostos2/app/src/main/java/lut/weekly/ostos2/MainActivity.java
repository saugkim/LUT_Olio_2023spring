package lut.weekly.ostos2;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;
import androidx.viewpager2.widget.ViewPager2;

import android.os.Bundle;
import android.widget.TextView;

import com.google.android.material.tabs.TabLayout;
import com.google.android.material.tabs.TabLayoutMediator;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    TabLayout tabLayout;
    ViewPager2 viewPager;
    ViewPagerAdapter adapter;
    static final String[] TITLES = new String[] {"HOME", "LIST", "ADD"};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        tabLayout = findViewById(R.id.tab);
        viewPager = findViewById(R.id.view_pager);

        addSomeItemsForTest();
        setViewPagerAdapter();
        new TabLayoutMediator(tabLayout, viewPager,
                (tab, position) -> tab.setText(TITLES[position])).attach();

    }

    public void setViewPagerAdapter() {
        adapter = new ViewPagerAdapter(this);
        ArrayList<Fragment> fragmentList = new ArrayList<>();

        fragmentList.add(new HomeFragment());
        fragmentList.add(new ListFragment());
        fragmentList.add(new AddFragment());

        adapter.setList(fragmentList);
        viewPager.setAdapter(adapter);
    }
    public void addSomeItemsForTest() {
        Item i1 = new Item("Omena");
        Item i2 = new Item("Peruna", "Kotimaan");
        Item i3 = new Item("Kanamuna", "Omega-6");
     //   Item i4 = new Item("Juusto");
        i1.setDate("2000-06-01.08:20");
        i2.setDate("1990-01-01.08:20");
        i3.setDate("2022-12-03.10:20");
    //    i4.setDate("2011-09-09.03:20");
        i1.setImportant(false);
        i2.setImportant(false);
        i3.setImportant(false);
    //    i4.setImportant(false);

        ItemStorage.getInstance().addItem(i1);
        ItemStorage.getInstance().addItem(i2);
        ItemStorage.getInstance().addItem(i3);
      //  ItemStorage.getInstance().addItem(i4);
    }
}
