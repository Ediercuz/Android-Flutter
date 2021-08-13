package mx.com.cosas.mymaps;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void despliegaInfo(View vista){
        String info = null;

        //Identificar por id
        switch (vista.getId()){
            case R.id.id_Aguascalientes:
                info="Aguascalientes, Capital: Aguascalientes"+"\n"+
                        "Número de habitantes: 934,424"+"\n"+
                        "Superficie en kilómetros cuadrados: 385 km²";
                this.muestraMensaje(info);
                break;
            case R.id.id_BajaCalifornia:
                info="Bajacalifornia, Capital: Mexicali"+"\n"+
                        "Número de habitantes: 3.769 millones"+"\n"+
                        "Superficie en kilómetros cuadrados: 71,450 km²";
                this.muestraMensaje(info);
                break;
            case R.id.id_BajaCaliforniaSur:
                info="Capital: La Paz"+"\n"+
                        "Número de habitantes: 798,447"+"\n"+
                        "Superficie en kilómetros cuadrados: 75,675 km²";
                this.muestraMensaje(info);
                break;
            case R.id.id_Campeche:
                info="Capital: San Francisco de Campeche"+"\n"+
                        "Número de habitantes: 928,363"+"\n"+
                        "Superficie en kilómetros cuadrados: 57,924 km²";
                this.muestraMensaje(info);
                break;
            case R.id.id_Chiapas:
                info="Capital: Tuxtla Gutiérrez\n" +
                        "Número de habitantes:  5.544 millones\n" +
                        "Superficie en kilómetros cuadrados: 73,311 km²\n";
                this.muestraMensaje(info);
                break;
            case R.id.id_Chihuahua:
                info="Capital: Chihuahua "+"\n"+
                        "Número de habitantes: 878,062"+"\n"+
                        "Superficie en kilómetros cuadrados: 247,455 km²";
                this.muestraMensaje(info);
                break;
            case R.id.id_CiudadDeMexico:
                info="Capital: Toluca de Lerdo"+"\n"+
                        "Número de habitantes: 16.99 millones"+"\n"+
                        "Superficie en kilómetros cuadrados: 22,500 km²";
                this.muestraMensaje(info);
                break;
            case R.id.id_Coahuila:
                info="Capital: Saltillo"+"\n"+
                        "Número de habitantes: 3.147 millones"+"\n"+
                        "Superficie en kilómetros cuadrados: 151,571 km²";
                this.muestraMensaje(info);
                break;
            case R.id.id_Durango:
                info="Capital: Durango"+"\n"+
                        "Número de habitantes: 654,876"+"\n"+
                        "Superficie en kilómetros cuadrados: 10,041 km²";
                this.muestraMensaje(info);
                break;
            case R.id.id_EstadoDeMexico:
                info="Capital: Ciudad de México"+"\n"+
                        "Número de habitantes: 8.855 millones"+"\n"+
                        "Superficie en kilómetros cuadrados: 1,485 km²";
                this.muestraMensaje(info);
                break;
            case R.id.id_Gerrero:
                info="Capital: Chilpancingo de los Bravo"+"\n"+
                        "Número de habitantes: 3.541 millones"+"\n"+
                        "Superficie en kilómetros cuadrados: 64,281 km²";
                this.muestraMensaje(info);
                break;
            case R.id.id_Guanajuato:
                info="Capital: Guanajuato"+"\n"+
                        "Número de habitantes: 194,500"+"\n"+
                        "Superficie en kilómetros cuadrados: 996.7 km²";
                this.muestraMensaje(info);
                break;
            case R.id.id_Hidalgo:
                info="Capital: Pachuca de Soto, Lordsburg"+"\n"+
                        "Número de habitantes: 3.083 millones"+"\n"+
                        "Superficie en kilómetros cuadrados: 8,925 km²";
                this.muestraMensaje(info);
                break;
            case R.id.id_jalisco:
                info="Capital: Guadalajara "+"\n"+
                        "Capital: Guadalajara "+"\n"+
                        "Superficie en kilómetros cuadrados: 78,588 km²";
                this.muestraMensaje(info);
                break;
            case R.id.id_Michoacan:
                info="Capital: Morelia\n" +
                        "Número de habitantes: 4.749 millones\n" +
                        "Superficie en kilómetros cuadrados: 58,599 km²\n";
                this.muestraMensaje(info);
                break;
            case R.id.id_Morelos:
                info="Capital: Cuernavaca\n" +
                        "Número de habitantes: 1.972 millones\n" +
                        "Superficie en kilómetros cuadrados: 4,950 km²\n";
                this.muestraMensaje(info);
                break;
            case R.id.id_Nayarit:
                info="Capital: Tepic\n" +
                        "Número de habitantes: 1.235 millones\n" +
                        "Superficie en kilómetros cuadrados: 27,857 km²\n";
                this.muestraMensaje(info);
                break;
            case R.id.id_NuevoLeon:
                info="Capital: Monterrey\n" +
                        "Número de habitantes: 5.784 millones\n" +
                        "Superficie en kilómetros cuadrados: 64,924 km²\n";
                this.muestraMensaje(info);
                break;
            case R.id.id_Oaxaca:
                info="Capital: Oaxaca\n" +
                        "Número de habitantes: 300,050\n" +
                        "Superficie en kilómetros cuadrados: 85.48 km²\n";
                this.muestraMensaje(info);
                break;
            case R.id.id_Puebla:
                info="Capital: ciudad de Puebla de Zaragoza\n" +
                        "Número de habitantes: 6.583 millones\n" +
                        "Superficie en kilómetros cuadrados: 534.3 km²\n";
                this.muestraMensaje(info);
                break;
            case R.id.id_Queretaro:
                info="Capital: Santiago de Querétaro\n" +
                        "Número de habitantes: 1.05 millones\n" +
                        "Superficie en kilómetros cuadrados: 363 km²\n";
                this.muestraMensaje(info);
                break;
            case R.id.id_QuintanaRoo:
                info="Capital: Chetumal\n" +
                        "Número de habitantes: 1.858 millones\n" +
                        "Superficie en kilómetros cuadrados: 50,212 km²\n";
                this.muestraMensaje(info);
                break;
            case R.id.id_SanLuisPotosi:
                info="Capital: San Luis Potosí\n" +
                        "Número de habitantes: 824,229\n" +
                        "Superficie en kilómetros cuadrados: 385 km²\n";
                this.muestraMensaje(info);
                break;
            case R.id.id_Sinaloa:
                info="Capital: Culiacán\n" +
                        "Número de habitantes: 3.027 millones\n" +
                        "Superficie en kilómetros cuadrados: 58,200 km²\n";
                this.muestraMensaje(info);
                break;
            case R.id.id_Sonora:
                info="Capital: Hermosillo\n" +
                        "Número de habitantes: 2.945 millones\n" +
                        "Superficie en kilómetros cuadrados: 179,355 km²\n";
                this.muestraMensaje(info);
                break;
            case R.id.id_Tabasco:
                info="Capital: Villahermosa\n" +
                        "Número de habitantes: 2.403 millones\n" +
                        "Superficie en kilómetros cuadrados: 25,267 km²\n";
                this.muestraMensaje(info);
                break;
            case R.id.id_Tamaulipas:
                info="Capital: Ciudad Victoria\n" +
                        "Número de habitantes: 3.528 millones\n" +
                        "Superficie en kilómetros cuadrados: 75,384 km²\n";
                this.muestraMensaje(info);
                break;
            case R.id.id_Tlaxcala:
                info="Capital: Tlaxcala de Xicohténcatl\n" +
                        "Número de habitantes: 1.343 millones\n" +
                        "Superficie en kilómetros cuadrados: 3,997 km²\n";
                this.muestraMensaje(info);
                break;
            case R.id.id_Veracruz:
                info="Capital: Veracruz\n" +
                        "Número de habitantes: 702,394\n" +
                        "Superficie en kilómetros cuadrados: 71,820 km²\n";
                this.muestraMensaje(info);
                break;
            case R.id.id_Yucatan:
                info="Capital: Mérida\n" +
                        "Número de habitantes: 2.321 millones\n" +
                        "Superficie en kilómetros cuadrados: 43,379 km²\n";
                this.muestraMensaje(info);
                break;
            case R.id.id_Zacatecas:
                info="Capital: Zacatecas\n" +
                        "Número de habitantes: 1.622 millones\n" +
                        "Superficie en kilómetros cuadrados: 77,684 km²\n";
                this.muestraMensaje(info);
                break;

            case R.id.id_Colima:
                info="Colima, Capital: Colima"+"\n"+
                        "Habitantes: 731,391"+"\n"+
                        "Superficie: 5,625 km²";
                this.muestraMensaje(info);
                break;


        }
    }

        public void muestraMensaje(String cad){
            AlertDialog.Builder w = new AlertDialog.Builder(this);
            w.setTitle("-- Información --");
            w.setMessage(cad);
            w.setPositiveButton("Aceptar", null);
            w.create();
            w.show();
        }


    }