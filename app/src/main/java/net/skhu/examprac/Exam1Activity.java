package net.skhu.examprac;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class Exam1Activity extends AppCompatActivity {

    EditText editText;
    int num;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_exam1);

        num = 0;
        editText = (EditText)findViewById(R.id.editText);
        editText.setText(String.format("%d", num));

        Button btnIncrease = (Button)findViewById(R.id.btnIncrease);
        btnIncrease.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                num++;
                editText.setText(String.format("%d", num));
            }
        });

        Button btnDecrease = (Button)findViewById(R.id.btnDecrease);
        btnDecrease.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                num--;
                editText.setText(String.format("%d", num));
            }
        });
    }
}
