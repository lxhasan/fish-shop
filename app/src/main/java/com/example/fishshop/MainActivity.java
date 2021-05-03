package com.example.fishshop;

import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.Task;
import com.google.firebase.auth.AuthResult;
import com.google.firebase.auth.FirebaseAuth;

public class MainActivity extends AppCompatActivity {

    private EditText userEditText,passwordEdittext;
    private Button singINbutton;
    private FirebaseAuth auth;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        userEditText = findViewById(R.id.usernameID);
        passwordEdittext = findViewById(R.id.passwordID);
        singINbutton = findViewById(R.id.SignInID);

        auth = FirebaseAuth.getInstance();

        singINbutton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                String username = userEditText.getText().toString();
                String password = passwordEdittext.getText().toString();

                if (TextUtils.isEmpty(username) || TextUtils.isEmpty(password))
                {

                   // Intent intent = new Intent(MainActivity.this,Dashboard.class);
                    //startActivity(intent);

                    Toast.makeText(MainActivity.this, "Emtry Crudianto", Toast.LENGTH_SHORT).show();

                }else if (password.length() < 6) {
                    Toast.makeText(getApplicationContext(),"The password is to sort", Toast.LENGTH_SHORT).show();
                }
                else {
                    singINbutton(username , password);
                }
            }
        });
    }

    private void singINbutton(String username1, String password1) {

        auth.createUserWithEmailAndPassword(username1 , password1).addOnCompleteListener(MainActivity.this, new OnCompleteListener<AuthResult>() {
            @Override
            public void onComplete(@NonNull Task<AuthResult> task) {

                if (task.isSuccessful())
                {
                    Toast.makeText(MainActivity.this, "Login is succfully", Toast.LENGTH_SHORT).show();
                }
                else
                    Toast.makeText(MainActivity.this, "Login is filed", Toast.LENGTH_SHORT).show();

            }
        });

    }
}