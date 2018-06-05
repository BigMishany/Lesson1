package xyz.bgw.mikhail.lesson1;

import android.content.Context;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import java.util.TreeSet;

public class Activity2 extends AppCompatActivity {
    Button buttonAdd2;
    Button buttonShow2;
    EditText textUser2;
    TextView list2;
    TreeSet data2 = new TreeSet<String>();
    String dataToString2;


    public static Intent createStartIntetn_2(Context context) {
        Intent intent = new Intent(context, Activity2.class);
        return intent;
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_2);
        buttonAdd2 = findViewById(R.id.buttonAdd_2);
        buttonShow2 = findViewById(R.id.buttonShow_2);
        textUser2 = findViewById(R.id.editText_2);
        list2 = findViewById(R.id.textView_2);
        buttonAdd2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                data2.add(textUser2.getText().toString());
                list2.setText("Add information complete");
                textUser2.setText("");
            }
        });
        buttonShow2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                dataToString2 = "";
                list2.setText(data2.toString());
            }
        });

    }
}
