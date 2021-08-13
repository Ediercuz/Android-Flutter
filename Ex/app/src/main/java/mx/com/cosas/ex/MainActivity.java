package mx.com.cosas.ex;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ScrollView;
import android.widget.SeekBar;

public class MainActivity extends AppCompatActivity {
    Button id_salir;
    Button id_referencias;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        id_salir = findViewById(R.id.id_salir);
        id_referencias = findViewById(R.id.id_referencias);
    }

    public void despliegaInfo(View vista){
        String info = null;

        //Identificar por id
        switch (vista.getId()){
            case R.id.id_alaka:
                info="No. 065"+"\n"+
                        "Alakazam es un Pokémon de tipo psíquico introducido en la primera generación. Es la evolución de Kadabra."+"\n"+
                        "Tipo: PSIQUICO";
                this.muestraMensaje(info);
                break;
            case R.id.id_charmander:
                info="No. 006"+"\n"+
                        "Charizard es un Pokémon de tipo fuego/volador, introducido en la primera generación. Es la evolución de Charmeleon."+"\n"+
                        "Tipo: FUEGO VOLADOR";
                this.muestraMensaje(info);
                break;
            case R.id.id_gallarde:
                info="No. 475"+"\n"+
                        "Gallade es un Pokémon de tipo psíquico/lucha introducido en la cuarta generación. Es una de las posibles evoluciones de Kirlia."+"\n"+
                        "Tipo: PSIQUICO LUCHA";
                this.muestraMensaje(info);
                break;
            case R.id.id_garch:
                info="No. 445"+"\n"+
                        "Garchomp es un Pokémon de tipo dragón/tierra introducido en la cuarta generación. Es la evolución de Gabite."+"\n"+
                        "Tipo: DRAGON TIERRA";
                this.muestraMensaje(info);
                break;
            case R.id.id_gengar:
                info="No. 094"+"\n"+
                        "Gengar es un Pokémon de tipo fantasma/veneno introducido en la primera generación. Es la evolución de Haunter."+"\n"+
                        "Tipo: FANTASMA VENENO";
                this.muestraMensaje(info);
                break;
            case R.id.id_lucario:
                info="No. 448"+"\n"+
                        "Lucario es un Pokémon de tipo lucha/acero introducido en la cuarta generación. Es la evolución de Riolu."+"\n"+
                        "Tipo: LUCHA ACERO";
                this.muestraMensaje(info);
                break;
            case R.id.id_magnezone:
                info="No. 462"+"\n"+
                        "Magnezone es un Pokémon artificial de tipo eléctrico/acero introducido en la cuarta generación. Es la evolución de Magneton."+"\n"+
                        "Tipo: ELECTRICO ACERO";
                this.muestraMensaje(info);
                break;
            case R.id.id_pikachu:
                info="No. 025"+"\n"+
                        "Pikachu es un Pokémon de tipo eléctrico introducido en la primera generación. Es el Pokémon más conocido de la historia, mayormente por ser el acompañante del protagonista del anime."+"\n"+
                        "Tipo: ELECTRICO";
                this.muestraMensaje(info);
                break;
            case R.id.id_togekiss:
                info="No. 468"+"\n"+
                        "Togekiss es un Pokémon de tipo hada/volador introducido en la cuarta generación. Es la evolución de Togetic."+"\n"+
                        "Tipo: HADA VOLADOR";
                this.muestraMensaje(info);
                break;
            case R.id.id_umbreon:
                info="No. 197"+"\n"+
                        "Umbreon es un Pokémon de tipo siniestro introducido en la segunda generación. Es una de las ocho posibles evoluciones de Eevee."+"\n"+
                        "Tipo: SINIESTRO";
                this.muestraMensaje(info);
                break;
            case R.id.id_salir:
                id_salir.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        finish();
                    }
                });
                break;
            case R.id.id_referencias:
                info="trabajo de Luis David y Edy Fernando"+"\n"+
                        "Este contenido proviene de wikidex.net, y debe darse atribución a sus autores, tal como especifica la licencia."+"\n"+
                        "https://www.wikidex.net/wiki/WikiDex";
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
