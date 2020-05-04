package net.skhu.examprac;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;

import android.content.DialogInterface;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ListView;
import android.widget.TextView;
import android.widget.Toast;

public class Exam2Activity extends AppCompatActivity {
    TextView textView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_exam2);

        textView = (TextView)findViewById(R.id.textView);

        Button btnOpenAlertDialog = (Button)findViewById(R.id.btnOpenAlertDialog);
        btnOpenAlertDialog.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                AlertDialog.Builder builder = new AlertDialog.Builder(Exam2Activity.this);//AlertDialog.Builder 를 만들어주었습니다.
                builder.setTitle("confirm");//title 설정
                builder.setMessage("Do you want to delete");

                builder.setPositiveButton("Yes", new DialogInterface.OnClickListener() {//PositiveButton 설정입니다//DialogInterface.OnClickListener 를 anonymous inner class로 구현해주었습니다.
                    @Override
                    public void onClick(DialogInterface dialog, int index) {
                        Toast.makeText(Exam2Activity.this, "삭제성공", Toast.LENGTH_SHORT).show();
                        textView.setText("삭제성공");
                    }
                });
                builder.setNegativeButton("No", new DialogInterface.OnClickListener() {//PositiveButton 설정입니다//DialogInterface.OnClickListener 를 anonymous inner class로 구현해주었습니다.
                    @Override
                    public void onClick(DialogInterface dialog, int index) {
                        Toast.makeText(Exam2Activity.this, "삭제실패", Toast.LENGTH_SHORT).show();
                        textView.setText("삭제실패");
                    }
                });//NegativeButton 설정//취소버튼 누르면 아무것도 안 하도록 해주었습니다.
                AlertDialog dialog = builder.create();//다이얼로그를 만들어주었습니다. AlertDialog 를 만들어주었습니다.
                dialog.show();//AlertDialog 를 보여주었습니다.
            }
        });
    }
}
