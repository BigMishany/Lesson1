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
import java.util.Iterator;
import java.util.SortedSet;
import java.util.TreeSet;

public class Activity2 extends AppCompatActivity {
    Button buttonAdd_2;
    Button buttonShow_2;
    EditText Text_user_2;
    TextView List_2;
    TreeSet Data_2 = new TreeSet<String>();
    String Data_to_string_2;



    public static Intent createStartIntetn_2(Context context)
    {
        Intent intent = new Intent(context , Activity2.class);
        return intent;
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_2);
        buttonAdd_2 = findViewById(R.id.buttonAdd_2);
        buttonShow_2 = findViewById(R.id.buttonShow_2);
        Text_user_2 = findViewById(R.id.editText_2);
        List_2 = findViewById(R.id.textView_2);
        buttonAdd_2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Data_2.add(Text_user_2.getText().toString());
                List_2.setText("Add information complete");
                Text_user_2.setText("");
            }
        });
        buttonShow_2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Data_to_string_2="";
                List_2.setText(Data_2.toString());
                //List_2.setText(Data_to_string_2);
            }
        });

    }
}
