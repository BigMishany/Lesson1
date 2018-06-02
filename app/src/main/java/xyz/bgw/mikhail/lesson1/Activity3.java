package xyz.bgw.mikhail.lesson1;

import android.content.Context;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.KeyEvent;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.TreeSet;

public class Activity3 extends AppCompatActivity {

    Button buttonShow_3;
    EditText Text_user_3;
    TextView List_3;
    Map<Integer,Student> Data_3 = new HashMap<Integer,Student>();
    String Data_to_string_3;

    public static Intent createStartIntetn_3(Context context)
    {
        Intent intent = new Intent(context , Activity3.class);
        return intent;
    }



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_3);
        buttonShow_3 = findViewById(R.id.buttonShow_3);
        Text_user_3 = findViewById(R.id.editText_3);
        List_3 = findViewById(R.id.textView_3);
        Text_user_3.setOnKeyListener(new View.OnKeyListener()
        { public boolean onKey(View v, int keyCode, KeyEvent event) {
            if ((event.getAction() == KeyEvent.ACTION_DOWN) && (keyCode == KeyEvent.KEYCODE_ENTER))
            {   Student currentStudent = new Student();
                currentStudent.setId(System.currentTimeMillis());
                String[] parts = Text_user_3.getText().toString().split(" ");
                currentStudent.setName(parts[0]);
                currentStudent.setSurname(parts[1]);
                currentStudent.setGarde(parts[2]);
                currentStudent.setBithdayYear(parts[3]);
                Data_3.put(Data_3.size(),currentStudent);
                List_3.setText("Done!");
                return true; }
            return false; } });
        buttonShow_3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Student currentStudent;
                List_3.setText("");
                for(int i=0; i<Data_3.size(); i++)
                {
                    currentStudent = Data_3.get(i);
                    List_3.setText(List_3.getText()+"Id:"+currentStudent.getId()+" \nИмя: "+currentStudent.getName()+" \n Фамилия:"+currentStudent.getSurname()+" \n Класс:"+currentStudent.getGarde()+"\n Дата рождения:"+currentStudent.getBithdayYear()+"\n");
                }
            }
        });

    }}