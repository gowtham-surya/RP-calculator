package com.example.rpcalculator;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import com.google.android.material.textfield.TextInputLayout;

public class MainActivity extends AppCompatActivity {

    TextInputLayout redemption_ratio, subject, lab;
    Button button;
    TextView result;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        redemption_ratio = findViewById(R.id.redemption_ratio);
        subject = findViewById(R.id.subject);
        lab = findViewById(R.id.lab);
        button = findViewById(R.id.button);
        result = findViewById(R.id.result);

        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int ratio = Integer.parseInt(redemption_ratio.getEditText().getText().toString()) ;
                int subjects = Integer.parseInt(subject.getEditText().getText().toString()) ;
                int labs = Integer.parseInt(lab.getEditText().getText().toString()) ;

                int subjectValue = 8 * ratio + (4 * 2 * ratio) + (2 * 4 * ratio) + (6 * ratio);
                int AllSubjects = subjectValue * subjects;

                int labValue = 10 * ratio + (4 * 2 * ratio) + (4 * 4 * ratio) + (2 * 6 * ratio);
                int AllLabs = labValue * labs;

                int totalRP = AllSubjects + AllLabs;



                result.setText("Redemption Ratio:"+ ratio+"\n RP for each Subject: "+ subjectValue+"\n RP for "+subjects+" Subjects: "+ AllSubjects+
                        "\n RP for each Lab: "+ labValue+"\n RP for "+labs+" Labs: "+ AllLabs+"\n\n Total Redemption: "+ totalRP);


            }
        });

    }
}