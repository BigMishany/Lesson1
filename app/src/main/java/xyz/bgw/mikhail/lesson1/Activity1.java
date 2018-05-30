package xyz.bgw.mikhail.lesson1;

import android.content.Context;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import java.util.ArrayList;

public class Activity1 extends AppCompatActivity {
    Button buttonAdd;
    Button buttonShow;
    EditText Text_user;
    TextView List;
    ArrayList Data = new ArrayList();
    String Data_to_string;
    public static Intent createStartIntetn(Context context) {
        Intent intent = new Intent(context, Activity1.class);
        return intent;
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_1);
        buttonAdd = findViewById(R.id.buttonAdd);
        buttonShow = findViewById(R.id.buttonShow);
        Text_user = findViewById(R.id.editText);
        List = findViewById(R.id.textView2);
        buttonAdd.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Data.add(Text_user.getText().toString());
                List.setText("Add information complete");
            }
        });
        buttonShow.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Data_to_string="";
                for (int x = 0; x < Data.size(); x++)
                {
                    Data_to_string = Data_to_string + " " + Data.get(x).toString();
                }
                List.setText(Data_to_string);
            }
        });

    }
}