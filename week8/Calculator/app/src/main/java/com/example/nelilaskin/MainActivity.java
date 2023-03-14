package com.example.nelilaskin;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.view.inputmethod.InputMethodManager;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;
import java.util.Locale;

public class MainActivity extends AppCompatActivity {
    final static String NEED_TWO_INPUTS = "NEED TWO INPUTS";
    final static String ERROR_ZERO_DIVISION = "ZERO DIVISION ERROR";
    final static int BUTTON_DEFAULT_PURPLE = 0xFF6200EE;
    final static int BUTTON_HIGHLIGHT = 0xFF03DAC5;
    EditText inputFirst, inputSecond;
    Button buttonPlus, buttonMinus, buttonMultiple, buttonDivision, buttonReset;
    TextView output;
    Button[] buttons = null;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        inputFirst = findViewById(R.id.inputFirst);
        inputSecond = findViewById(R.id.inputSecond);
        buttonPlus = findViewById(R.id.btnPlus);
        buttonMinus = findViewById(R.id.btnMinus);
        buttonMultiple = findViewById(R.id.btnMultiple);
        buttonDivision = findViewById(R.id.btnDivision);
        buttonReset = findViewById(R.id.btnReset);
        output = findViewById(R.id.output);

        buttons = new Button[] {
            buttonPlus, buttonMinus, buttonMultiple, buttonDivision
        };
    }

    public boolean isParsable(String input) {
        try {
            Integer.parseInt(input);
            return true;
        } catch (final NumberFormatException e) {
            return false;
        }
    }
    public void doPlus(View view){
        resetButtons();
        hideInput(view);

        if (isParsable(inputFirst.getText().toString()) && isParsable(inputSecond.getText().toString())){
            buttonPlus.setBackgroundColor(BUTTON_HIGHLIGHT);
            int ret = Integer.parseInt(inputFirst.getText().toString()) + Integer.parseInt(inputSecond.getText().toString());
            output.setText(String.format(Locale.getDefault(),"%d",ret));
            return;
        }
        output.setText(NEED_TWO_INPUTS);
    }
    public void doMinus(View view){
        resetButtons();
        hideInput(view);
        if (isParsable(inputFirst.getText().toString()) && isParsable(inputSecond.getText().toString())) {
            buttonMinus.setBackgroundColor(BUTTON_HIGHLIGHT);
            int ret = Integer.parseInt(inputFirst.getText().toString()) - Integer.parseInt(inputSecond.getText().toString());
            output.setText(String.format(Locale.getDefault(), "%d", ret));
            return;
        }
        output.setText(NEED_TWO_INPUTS);
    }
    public void doMultiple(View view){
        resetButtons();
        hideInput(view);
        if (isParsable(inputFirst.getText().toString()) && isParsable(inputSecond.getText().toString())) {
            buttonMultiple.setBackgroundColor(BUTTON_HIGHLIGHT);
            int ret = Integer.parseInt(inputFirst.getText().toString()) * Integer.parseInt(inputSecond.getText().toString());
            output.setText(String.format(Locale.getDefault(), "%d", ret));
            return;
        }
        output.setText(NEED_TWO_INPUTS);
    }
    public void doDivision(View view){
        resetButtons();
        hideInput(view);

        if (!isParsable(inputFirst.getText().toString()) || !isParsable(inputSecond.getText().toString())) {
            output.setText(NEED_TWO_INPUTS);
            return;
        }

        buttonDivision.setBackgroundColor(BUTTON_HIGHLIGHT);
        int first = Integer.parseInt(inputFirst.getText().toString());
        int second = Integer.parseInt(inputSecond.getText().toString());
        if (second == 0) {
            output.setText(ERROR_ZERO_DIVISION);
            Toast.makeText(getApplicationContext(), ERROR_ZERO_DIVISION, Toast.LENGTH_LONG).show();
            return;
        }
        output.setText(String.format(Locale.getDefault(),"%.2f", (double)first/second));
    }

    public void resetButtons(){
        for (Button button : buttons) {
            button.setBackgroundColor(BUTTON_DEFAULT_PURPLE);
        }
    }

    public void resetTextFields(){
        inputFirst.getText().clear();
        inputSecond.getText().clear();
        output.setText(getResources().getText(R.string.result_here));
    }
    public void clear(View view) {
        resetTextFields();
        resetButtons();
    }
    public void hideInput(View view) {
        InputMethodManager inputMethodManager =(InputMethodManager) getSystemService(INPUT_METHOD_SERVICE);
        inputMethodManager.hideSoftInputFromWindow(view.getWindowToken(), 0);
    }
}