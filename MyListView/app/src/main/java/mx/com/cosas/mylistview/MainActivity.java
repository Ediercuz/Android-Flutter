package mx.com.cosas.mylistview;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.Toast;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    private ListView listMun;

    //Declaramos un arrayAdapter de tipos municipio
    ArrayList<Municipios> mpio = new ArrayList<>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // Relacionar el ListView
        listMun = (ListView)findViewById(R.id.listMunicipios);

        // Crear objetos de la clase municipio
        Municipios arm = new Municipios(1,"Armeria","13,000", "65,000");
        mpio.add(arm);
        Municipios col = new Municipios(2,"Colima","14,000", "65,000");
        mpio.add(col);
        Municipios com = new Municipios(3,"Comala","15,000", "65,000");
        mpio.add(com);
        Municipios coq = new Municipios(4,"Coquimatlán","16,000", "65,000");
        mpio.add(coq);
        Municipios cua = new Municipios(5,"Cuauhtémoc","17,000", "65,000");
        mpio.add(cua);
        Municipios ixt = new Municipios(6,"Ixtlahuacán","18,000", "65,000");
        mpio.add(ixt);
        Municipios man = new Municipios(7,"Manzanillo","19,000", "65,000");
        mpio.add(man);
        Municipios min = new Municipios(8,"Minatitlán","20,000", "65,000");
        mpio.add(min);
        Municipios tec = new Municipios(9,"Tecoman","21,000", "65,000");
        mpio.add(tec);
        Municipios via = new Municipios(10,"Villa de Álvarez","13,000", "65,000");
        mpio.add(via);

        // Creamos un arrayAdapter para enlazar el archivo de recursos con los items
        ArrayAdapter<CharSequence> adaptador = ArrayAdapter.createFromResource(this, R.array.arraymunicipios, android.R.layout.simple_list_item_1);
        // Asignamos el adaptador al listview
        listMun.setAdapter(adaptador);
        // Agregamos interactividad a los items del ListyView
        listMun.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                /*Toast.makeText(MainActivity.this,
                                "Seleccionaste_ " + parent.getItemAtPosition(position).toString(),
                                Toast.LENGTH_SHORT).show();*/

                printMunicipio(mpio.get(position));
            }
        });
    }

    //Metodo para publicar los atributos de cada objeto

    private void printMunicipio(Municipios m){
        AlertDialog.Builder vent = new AlertDialog.Builder(this);
        vent.setTitle(" -Datos del municipio- ");
        vent.setMessage("Número:              " + m.getNumMun() + "\n"
                        + "Nombre:              " + m.getNombre() + "\n"
                        + "Extencion:           " + m.getExtencion() + "\n"
                        + "Poblacion:           " + m.getPoblacion());
        vent.setPositiveButton("Aceptar", null);
        vent.create();
        vent.show();
    }
}