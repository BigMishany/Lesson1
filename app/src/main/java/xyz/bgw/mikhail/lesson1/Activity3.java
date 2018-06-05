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

import java.util.HashMap;
import java.util.Map;

public class Activity3 extends AppCompatActivity {

    Button buttonShow3;
    EditText textUser3;
    TextView list3;
    Map<Integer, Student> data3 = new HashMap<Integer, Student>();

    public static Intent createStartIntetn_3(Context context) {
        Intent intent = new Intent(context, Activity3.class);
        return intent;
    }


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_3);
        buttonShow3 = findViewById(R.id.buttonShow_3);
        textUser3 = findViewById(R.id.editText_3);
        list3 = findViewById(R.id.textView_3);
        textUser3.setOnKeyListener(new View.OnKeyListener() {
            public boolean onKey(View v, int keyCode, KeyEvent event) {
                if ((event.getAction() == KeyEvent.ACTION_DOWN) && (keyCode == KeyEvent.KEYCODE_ENTER)) {
                    Student currentStudent = new Student();
                    currentStudent.setId(System.currentTimeMillis());
                    String[] parts = textUser3.getText().toString().split(" ");
                    currentStudent.setName(parts[0]);
                    currentStudent.setSurname(parts[1]);
                    currentStudent.setGarde(parts[2]);
                    currentStudent.setBithdayYear(parts[3]);
                    data3.put(data3.size(), currentStudent);
                    list3.setText("Done!");
                    return true;
                }
                return false;
            }
        });
        buttonShow3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Student currentStudent;
                list3.setText("");
                for (int i = 0; i < data3.size(); i++) {
                    currentStudent = data3.get(i);
                    list3.setText(list3.getText() + "Id:" + currentStudent.getId() + " \nИмя: " + currentStudent.getName() + " \n Фамилия:" + currentStudent.getSurname() + " \n Класс:" + currentStudent.getGarde() + "\n Дата рождения:" + currentStudent.getBithdayYear() + "\n");
                }
            }
        });

    }
}