package submmision.sliit.tute02_1;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class Second extends AppCompatActivity {
    Button add_btn,min_btn,multiply_btn,divide_btn;
    TextView answer;
    EditText no3,no4;
    String num3,num4;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);

        answer = findViewById(R.id.textView5);
        add_btn = findViewById(R.id.add_btn);
        min_btn = findViewById(R.id.minus_btn);
        multiply_btn = findViewById(R.id.multi_btn);
        divide_btn = findViewById(R.id.divide_btn);
        no3 = findViewById(R.id.num3);
        no4 = findViewById(R.id.num4);

        num3 = getIntent().getExtras().getString("Val01");
        num4 = getIntent().getExtras().getString("Val02");

        no3.setText(num3);
        no4.setText(num4);

        add_btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (no3.getText().toString().equals("") || no4.getText().toString().equals("")) {
                    Toast.makeText(Second.this, "Please Enter Numbers", Toast.LENGTH_SHORT).show();
                } else {
                    no3.getText().toString();
                    no4.getText().toString();
                    int a1 = Integer.valueOf(no3.getText().toString());
                    int a2 = Integer.valueOf(no4.getText().toString());
                    int a3;
                    a3 = a1 + a2;
                    answer.setText(String.valueOf(a3));
                }
            }
        });

        min_btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (no3.getText().toString().equals("") || no4.getText().toString().equals("")) {
                    Toast.makeText(Second.this, "Please Enter Numbers", Toast.LENGTH_SHORT).show();
                } else {
                    no3.getText().toString();
                    no4.getText().toString();
                    int a1 = Integer.valueOf(no3.getText().toString());
                    int a2 = Integer.valueOf(no4.getText().toString());
                    int a3;
                    a3 = a1 - a2;
                    answer.setText(String.valueOf(a3));
                }
            }
        });

        multiply_btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (no3.getText().toString().equals("") || no4.getText().toString().equals("")) {
                    Toast.makeText(Second.this, "Please Enter Numbers", Toast.LENGTH_SHORT).show();
                } else {
                    no3.getText().toString();
                    no4.getText().toString();
                    int a1 = Integer.valueOf(no3.getText().toString());
                    int a2 = Integer.valueOf(no4.getText().toString());
                    int a3;
                    a3 = a1 * a2;
                    answer.setText(String.valueOf(a3));
                }
            }
        });

        divide_btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (no3.getText().toString().equals("") || no4.getText().toString().equals("")) {
                    Toast.makeText(Second.this, "Please Enter Numbers", Toast.LENGTH_SHORT).show();
                } else {
                    no3.getText().toString();
                    no4.getText().toString();
                    int a1 = Integer.valueOf(no3.getText().toString());
                    int a2 = Integer.valueOf(no4.getText().toString());
                    int a3;
                    a3 = a1 / a2;
                    answer.setText(String.valueOf(a3));
                }
            }
        });
    }
}
