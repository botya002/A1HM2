package com.example.a1hm2;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.AppCompatButton;
import androidx.core.content.ContextCompat;

import android.content.Context;
import android.os.Bundle;
import android.text.Editable;
import android.text.TextWatcher;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import com.google.android.material.button.MaterialButton;


public class MainActivity extends AppCompatActivity {
    private EditText email, password;
    private AppCompatButton button;
    private String Login = "admin@gmail.com";
    private String Password = "admin";
    private TextView view, vhod, syda, leftt;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        button = findViewById(R.id.voiti);
        email = findViewById(R.id.vve);
        password = findViewById(R.id.vvv);
        view = findViewById(R.id.vip);
        vhod = findViewById(R.id.vhod);
        leftt = findViewById(R.id.leftt);
        syda = findViewById(R.id.syda);
        button.setOnClickListener(v -> {
            if (email.getText().toString().equals(Login) && password.getText().toString().equals(Password)){
                    button.setVisibility(View.GONE);
                vhod.setVisibility(View.GONE);
                email.setVisibility(View.GONE);
                password.setVisibility(View.GONE);
                view.setVisibility(View.GONE);
                leftt.setVisibility(View.GONE);
                syda.setVisibility(View.GONE);
                Toast.makeText(this, "Вы успешно вошли в систему", Toast.LENGTH_SHORT).show();
            }else if (email.getText().toString().isEmpty() && password.getText().toString().isEmpty()){
                Toast.makeText(this, "Поля пусты, введите данные", Toast.LENGTH_SHORT).show();
            }
            else {
                Toast.makeText(this, "Неправильный логин или пароль", Toast.LENGTH_SHORT).show();
            }
        });
        email.addTextChangedListener(new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence s, int start, int count, int after) {

            }

            @Override
            public void onTextChanged(CharSequence s, int start, int before, int count) {

            }

            @Override
            public void afterTextChanged(Editable s) {

            if (email.getText().toString().isEmpty() && password.getText().toString().isEmpty()){
                button.setBackground(ContextCompat.getDrawable(MainActivity.this,R.drawable.btn));
            }
            else {
                button.setBackground(ContextCompat.getDrawable(MainActivity.this,R.drawable.btnorange));
            }
            }
        });
        password.addTextChangedListener(new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence s, int start, int count, int after) {

            }

            @Override
            public void onTextChanged(CharSequence s, int start, int before, int count) {

            }

            @Override
            public void afterTextChanged(Editable s) {

                if (email.getText().toString().isEmpty() && password.getText().toString().isEmpty()){
                    button.setBackground(ContextCompat.getDrawable(MainActivity.this,R.drawable.btn));
                }
                else {
                    button.setBackground(ContextCompat.getDrawable(MainActivity.this,R.drawable.btnorange));
                }
            }
        });
    }
}