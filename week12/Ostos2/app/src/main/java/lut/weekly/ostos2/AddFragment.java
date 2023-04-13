package lut.weekly.ostos2;

import android.app.DatePickerDialog;
import android.content.Context;
import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.TextView;
import android.widget.Toast;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.Locale;

/**
 * A simple {@link Fragment} subclass.
 * Use the {@link AddFragment#newInstance} factory method to
 * create an instance of this fragment.
 */
public class AddFragment extends Fragment {

    // TODO: Rename parameter arguments, choose names that match
    // the fragment initialization parameters, e.g. ARG_ITEM_NUMBER
    private static final String ARG_PARAM1 = "param1";
    private static final String ARG_PARAM2 = "param2";

    static final String TAG = "ZZ AddFragment";
    final String DATE_FORMAT = "yyyy-MM-dd.hh:mm";
    EditText nameText, infoText;
    TextView dateText;
    Button addButton;
    RadioButton radioButton;

    Date date = new Date();

    // TODO: Rename and change types of parameters
    private String mParam1;
    private String mParam2;

    public AddFragment() {
        // Required empty public constructor
    }

    /**
     * Use this factory method to create a new instance of
     * this fragment using the provided parameters.
     *
     * @param param1 Parameter 1.
     * @param param2 Parameter 2.
     * @return A new instance of fragment AddFragment.
     */
    // TODO: Rename and change types and number of parameters
    public static AddFragment newInstance(String param1, String param2) {
        AddFragment fragment = new AddFragment();
        Bundle args = new Bundle();
        args.putString(ARG_PARAM1, param1);
        args.putString(ARG_PARAM2, param2);
        fragment.setArguments(args);
        return fragment;
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        if (getArguments() != null) {
            mParam1 = getArguments().getString(ARG_PARAM1);
            mParam2 = getArguments().getString(ARG_PARAM2);
        }
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        date = new Date();
        View view = inflater.inflate(R.layout.fragment_add, container, false);

        nameText = view.findViewById(R.id.etItemName);
        infoText = view.findViewById(R.id.etItemInfo);
        dateText = view.findViewById(R.id.textViewDate);
        addButton = view.findViewById(R.id.btnCreate);
        radioButton = view.findViewById(R.id.rbItem);

        TextView textViewInBottom = (TextView) getActivity().findViewById(R.id.tvImportantThingsInBottom);

        dateText.setOnClickListener(v-> getDatePicker(view.getContext()));

        addButton.setOnClickListener(v-> {
            addItem(view.getContext());
            resetUI();
            textViewInBottom.setText(getImportantItems());
        });

        return view;
    }

    public String getImportantItems() {
        StringBuilder sb = new StringBuilder();
        for (Item item : ItemStorage.getInstance().getItems()) {
            if (item.isImportant) {
                sb.append(String.format("%s %s\n", item.getName(), item.getInfo() == null ? "" : item.getInfo() ));
            }
        }
        return sb.toString().isEmpty() ? getString(R.string.important_things) : sb.toString();
    }

    public void addItem(Context context) {
        String name = nameText.getText().toString();
        String info = infoText.getText().toString();

        if (name.isEmpty()) {
            Log.d(TAG, "Required field name is empty");
            Toast.makeText(context, "Item is required to fill", Toast.LENGTH_LONG).show();
            return;
        }

        Item item = new Item(name);
        if (radioButton.isChecked()) {
            item.setImportant(true);
        }

        if (!info.isEmpty())
            item.setInfo(info);

        item.setDate(getDateTime(date));
        ItemStorage.getInstance().addItem(item);
    }

    public void resetUI() {
        radioButton.setChecked(false);
        nameText.getText().clear();
        infoText.getText().clear();
        date = new Date();
        dateText.setText(R.string.date_input_text);
    }

    public String getDateTime(Date date) {
        SimpleDateFormat dateFormat = new SimpleDateFormat(DATE_FORMAT, Locale.getDefault());
        return dateFormat.format(date);
    }

    public void getDatePicker(Context context) {
        Calendar calendar = Calendar.getInstance();
        DatePickerDialog.OnDateSetListener dateSetListener = (view, year, month, day) -> {
            calendar.set(Calendar.YEAR, year);
            calendar.set(Calendar.MONTH, month);
            calendar.set(Calendar.DAY_OF_MONTH, day);
            date = calendar.getTime();
            dateText.setText(getDateTime(calendar.getTime()));
        };
        new DatePickerDialog(context, dateSetListener,
                calendar.get(Calendar.YEAR), calendar.get(Calendar.MONTH), calendar.get(Calendar.DAY_OF_MONTH)).show();
        Log.d(TAG, getDateTime(date));
    }
}