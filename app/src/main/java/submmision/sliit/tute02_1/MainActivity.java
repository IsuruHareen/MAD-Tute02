package submmision.sliit.tute02_1;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.Gravity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    Button ok_butn;
    EditText num1,num2;
    String number1,number2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ok_butn = findViewById(R.id.ok_btn);
        num1 = findViewById(R.id.num1);
        num2 = findViewById(R.id.num2);

        //Creating the LayoutInflater instance
        LayoutInflater li = getLayoutInflater();
        //Getting the View object as defined in the customtoast.xml file
        View layout = li.inflate(R.layout.custom_toast, (ViewGroup)
                findViewById(R.id.custom_toast_layout));

        //Creating the Toast object
        Toast toast1 = new Toast(getApplicationContext());
        toast1.setDuration(Toast.LENGTH_SHORT);
        toast1.setGravity(Gravity.CENTER_VERTICAL, 0, 0);
        toast1.setView(layout);//setting the view of custom toast layout
        toast1.show();

        ok_butn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Context context = getApplicationContext();
                CharSequence message = "You just clicked the ok button";
                int duration = Toast.LENGTH_SHORT;
                Toast toast = Toast.makeText(context,message,duration);
                toast.show();

                Intent intent = new Intent(MainActivity.this,Second.class);
                number1 = num1.getText().toString();
                number2 = num2.getText().toString();
                intent.putExtra("Val01",number1);
                intent.putExtra("Val02",number2);
                startActivity(intent);
            }
        });
    }
}
