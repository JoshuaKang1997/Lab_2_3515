package edu.temple.signupform;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class FormActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //button object declaration
        Button button = (Button) findViewById(R.id.button);
        //EditText Object declaration
        final EditText nameText = (EditText) findViewById(R.id.nameText);
        final EditText emailText = (EditText) findViewById(R.id.emailText);
        final EditText pText = (EditText) findViewById(R.id.pText);
        final EditText pcText = (EditText) findViewById(R.id.pcText);

        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (nameText.getText().toString().matches("") ||
                        emailText.getText().toString().matches("") ||
                        pText.getText().toString().matches("") ||
                        pcText.getText().toString().matches("")) {

                    Toast.makeText(getApplicationContext(), "You have left a field empty!"
                            , Toast.LENGTH_LONG).show();
                } else {
                    if (!pText.getText().toString().matches(pcText.getText().toString())) {
                        Toast.makeText(getApplicationContext(), "Your passwords don't match!"
                                , Toast.LENGTH_LONG).show();
                    } else {
                        Toast.makeText(getApplicationContext(), "Welcome, " + nameText.getText().toString()
                                        + ", to the SignUpForm App!"
                                , Toast.LENGTH_LONG).show();
                    }
                }
            }
        });
    }
}
