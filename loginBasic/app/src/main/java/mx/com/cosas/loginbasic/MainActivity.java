package mx.com.cosas.loginbasic;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    private EditText eName;
    private EditText ePassword;
    private Button eLogin;
    private TextView eAttemptsInfo;

    private String Username = "Luis98";
    private String Password = "123456";

    boolean isValid = false;
    private int counter = 5;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        eName = findViewById(R.id.etName);
        ePassword = findViewById(R.id.etPassword);
        eLogin = findViewById(R.id.btnLogin);
        eAttemptsInfo = findViewById(R.id.tvAttemptsInfo);

        eLogin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                String inputName = eName.getText().toString();
                String inputPassword = ePassword.getText().toString();

                if (inputName.isEmpty() || inputPassword.isEmpty()){
                    Toast.makeText(MainActivity.this, "porfavor inserte todos los datos correctamente!", Toast.LENGTH_SHORT).show();
                }else {

                    isValid = validate(inputName, inputPassword);
                    if (!isValid){

                        counter--;

                        Toast.makeText(MainActivity.this, "usuario o contraseña incorrectas!", Toast.LENGTH_SHORT).show();

                        eAttemptsInfo.setText("Numero de intentos restantes: " + counter);

                        if (counter == 0){
                            eLogin.setEnabled(false);
                        }
                    } else {
                        Toast.makeText(MainActivity.this, "Acceso correcto!", Toast.LENGTH_SHORT).show();

                        //Agregamos el codigo que direccionara a la nueva actividad
                        Intent intent = new Intent(MainActivity.this, HomeActivity.class);
                        startActivity(intent);
                    }
                }
            }
        });
    }

    private boolean validate(String name, String password){
        if (name.equals(Username) && password.equals(Password)){
            return true;
        }
        return false;
    }
}