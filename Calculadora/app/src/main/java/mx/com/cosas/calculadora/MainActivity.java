package mx.com.cosas.calculadora;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.*;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.Toast;
import android.content.Intent;

public class MainActivity extends AppCompatActivity {

    private Button btnC, btnO, btnS;
    private EditText txtA, txtP;
    private ImageView img;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //Relacionara elementos graficos
        btnC = (Button)findViewById(R.id.btnCalcular);
        btnO = (Button)findViewById(R.id.btnOtro);
        btnS = (Button)findViewById(R.id.btnSalir);

        txtA = (EditText)findViewById(R.id.txtEs);
        txtP = (EditText)findViewById(R.id.txtPes);

        //img = (ImageView) findViewById(R.id.image);
    }

    public void calcularIMC(View vista){
        String cat;
        //leer la propiedad text de cada campo de cada EditText
        String cad = txtA.getText().toString();
        float altura = Float.parseFloat(cad);
        cad = txtP.getText().toString();
        float peso = Float.parseFloat(cad);

        float imc = (float) (peso/Math.pow(altura, 2));


        //Identificar categorias
        if (imc < 16){
            cat = "Tienes infrapeso, delgadez severa";
            this.muestraResultado(imc, cat);
        }
        else if(imc >= 16 && imc <= 16.99 ){cat = "Tienes imfrapeso, delgadez moderada";
            this.muestraResultado(imc, cat);
        } else if (imc >= 18.5 && imc < 24.9) {
            cat = "Peso normal";
            this.muestraResultado(imc, cat);
        } else if (imc > 25 && imc <= 29.9) {
            cat = "Tienes sobre peso";
            this.muestraResultado(imc, cat);
        } else if (imc > 30 && imc <= 34.5) {
            cat = "Tienes Obecidad tipo 1";
            this.muestraResultado(imc, cat);
        } else if (imc > 35 && imc < 40) {
            cat = "Tienes Obecidad tipo 2";
            this.muestraResultado(imc, cat);
        } else if (imc > 35) {
            cat = " Obecidad Extrema Cuidado";
            this.muestraResultado(imc, cat);
        }
        img.setVisibility(View.VISIBLE);
    }
    /**
     * Metodo para imprimir resultado de calculo
     */
    private void muestraResultado(float vimc, String msg){
        //Mensaje en notificacion de Toast
        // Toast.makeText(this, vimc+ msg, Toast.LENGTH_SHORT).show();

        //Mensaje con alert
        AlertDialog.Builder vent = new AlertDialog.Builder(this);
        //Modificar las propiedades del de vent
        vent.setTitle("Resultado");
        String cad = String.valueOf(vimc);
        vent.setMessage("IMC: " + vimc+"\n"+msg);
        //Crear boton de modal
        vent.setPositiveButton("Aceptar", null);
        //Crear modal
        vent.create();
        //Mostarr en la poantalla
        vent.show();
        txtA.setText(null);
        txtP.setText(null);
    }
    public void otroCalculo(View v){
        txtA.setText(null);
        txtP.setText(null);
    }

    public void salirdelaApp(View v){
        System.exit(0);
    }
    public void iraA2(View v) {
        Intent i = new Intent(this, MainActivity.class);

        startActivity(i);
    }

}