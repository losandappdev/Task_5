package com.n.task_5;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.CompoundButton;
import android.widget.ProgressBar;
import android.widget.RadioButton;
import android.widget.RadioGroup;

public class Task6_2 extends AppCompatActivity {

    private RadioButton radioButtonS;
    private RadioButton radioButtonW;
    private ProgressBar progressBar;

    private RadioGroup radioGroup;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_task6_2);

        radioButtonS = findViewById(R.id.radio_button_s_activity_task6_2);
        radioButtonW = findViewById(R.id.radio_button_w_activity_task6_2);

        progressBar = findViewById(R.id.progress_bar_task6_2);

        radioButtonS.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                if (isChecked) {

                    progressBar.setVisibility(View.INVISIBLE);
                }
            }
        });

        radioButtonW.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                if (isChecked) {
                    progressBar.setVisibility(View.VISIBLE);
                }
            }
        });
    }
}
