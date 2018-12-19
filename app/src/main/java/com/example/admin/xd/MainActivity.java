package com.example.admin.xd;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    Button btn;
    TextView text;
    EditText et;
    Button next;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        btn = findViewById(R.id.Button);
        text = findViewById(R.id.Text);
        et = findViewById(R.id.wpisz);
        next = findViewById(R.id.next);


        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String tekst = et.getText().toString();
                text.setText(String.valueOf(tekst));
            }
        });

        next.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openActivity();
            }
        });
    }

        public void openActivity(){
            Intent intent = new Intent(this, SecondActivity.class);
            startActivity(intent);
        }

}
