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
    EditText textUser;
    TextView list;
    ArrayList data = new ArrayList();
    String dataToString;

    public static Intent createStartIntetn_1(Context context) {
        Intent intent = new Intent(context, Activity1.class);
        return intent;
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_1);
        buttonAdd = findViewById(R.id.buttonAdd);
        buttonShow = findViewById(R.id.buttonShow);
        textUser = findViewById(R.id.editText);
        list = findViewById(R.id.textView2);
        buttonAdd.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                data.add(textUser.getText().toString());
                list.setText("Add information complete");
                textUser.setText("");
            }
        });
        buttonShow.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                dataToString = "";
                for (int x = 0; x < data.size(); x++) {
                    dataToString = dataToString + " " + data.get(x).toString();
                }
                list.setText(dataToString);
            }
        });

    }
}