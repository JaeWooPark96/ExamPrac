package net.skhu.examprac;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button btnExam1 = (Button)findViewById(R.id.btnExam1);
        btnExam1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity.this, Exam1Activity.class);
                startActivity(intent);

            }
        });

        Button btnExam2 = (Button)findViewById(R.id.btnExam2);
        btnExam2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity.this, Exam2Activity.class);
                startActivity(intent);
            }
        });
    }
}
