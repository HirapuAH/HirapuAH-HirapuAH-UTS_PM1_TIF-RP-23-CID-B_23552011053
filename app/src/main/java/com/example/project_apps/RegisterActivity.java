package com.example.project_apps;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;
import androidx.appcompat.app.AppCompatActivity;

public class RegisterActivity extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_register);

        EditText edtName = findViewById(R.id.edtName);
        Button btnRegister = findViewById(R.id.btnRegister);

        btnRegister.setOnClickListener(v -> {
            String name = edtName.getText().toString();
            Log.d("RegisterActivity", "User Registered: " + name);
            Toast.makeText(this, "Registered: " + name, Toast.LENGTH_SHORT).show();
            startActivity(new Intent(this, ListChatActivity.class));
        });
    }
}
