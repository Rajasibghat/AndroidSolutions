package com.example.androidsolutions;

import androidx.appcompat.app.AppCompatActivity;

import android.app.DatePickerDialog;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.DatePicker;
import android.widget.Toast;

import com.example.androidsolutions.databinding.ActivityMainBinding;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.List;
public class MainActivity extends AppCompatActivity {
    private ActivityMainBinding binding;
    private Calendar date=Calendar.getInstance();
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding=ActivityMainBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());
        DatePickerDialog.OnDateSetListener dateSetListener=new DatePickerDialog.OnDateSetListener() {
            @Override
            public void onDateSet(DatePicker view, int year, int month, int dayOfMonth) {
                date.set(Calendar.YEAR,year);
                date.set(Calendar.MONTH,month);
                date.set(Calendar.DAY_OF_MONTH,dayOfMonth);
                //16/12/2022   16-12-2022
                updateInputField();
            }
        };

        binding.inputDate.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                new DatePickerDialog(MainActivity.this,dateSetListener,date.get(Calendar.YEAR)
                        ,date.get(Calendar.MONTH),date.get(Calendar.DAY_OF_MONTH))
                        .show();

                /*
                You can also create object with name and then call show on it like this
                DatePickerDialog dialog=new DatePickerDialog();
                dialog.show();
                 */
            }
        });


    }

    private void updateInputField() {
        String format="dd-MM-YYYY";
        if (android.os.Build.VERSION.SDK_INT >= android.os.Build.VERSION_CODES.N) {
            SimpleDateFormat dateFormat=new SimpleDateFormat(format);
            binding.inputDate.setText(dateFormat.format(date.getTime()));
        }

    }

}