package mx.com.cosas.contador;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.Button;
import android.widget.TextView;
import android.view.View;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    private Button btnI, btnD, btnR;
    private TextView txtC;



    private int contador = 0;
    String mns1 = "Valor maximo alcanzado";
    String mns2 = "Valor minimo alcanzado";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // --- Relacionar los componentes de la vista ---
        btnI = (Button)findViewById(R.id.btnInc);
        btnR = (Button)findViewById(R.id.btnReset);
        btnD = (Button)findViewById(R.id.btnDec);

        txtC = (TextView)findViewById(R.id.lblcon);
    }

    //Aquí van los metodos uwu
    public void incrementarContador(View v){
        //Se incrementa el contador
        if (contador >= +99){
            Toast message = Toast.makeText(getApplicationContext(),mns1, Toast.LENGTH_SHORT);
            message.show();
        }else{
            contador++;
        }
        // invocamos al metodo muestraContador
        this.muestraContador();


    }

    public void decrementarContador(View v){
        //Se incrementa el contador
        this.contador--;
        if (contador >= -10){
            Toast message = Toast.makeText(getApplicationContext(),mns2, Toast.LENGTH_SHORT);
            message.show();
        }else{
            contador++;
        }
        // invocamos al metodo muestraContador
        this.muestraContador();
    }

    public void resetContador(View v){
        this.contador = 0;
        this.muestraContador();
        
    }

    private void muestraContador(){
        txtC.setText(Integer.toString(this.contador));
    }
}