import 'package:flutter/material.dart';
import 'Estado.dart';

void main() {
  runApp(MyApp());
}

class MyApp extends StatelessWidget {
  @override
  Widget build(BuildContext context) {
    return new MaterialApp(
        title: "Lista de Estados de México",
        theme: new ThemeData(
          primarySwatch: Colors.blue,
        ),

        home: Scaffold(
            appBar: AppBar(
                title: Text("Municipios del Estado de Colima")
            ),
            body: new ListView(
              children: atributos.map(_formatItemList).toList(),
            )
        )
    );
  }


  /**
   * método para formatear cada elemento de la lista
   */
  Widget _formatItemList(Estado estado) {
    return new ListTile(
      title: new Text(estado.nombre),
      subtitle: new Text(estado.capital),
      leading: new Icon(Icons.map),
      // Hacemos interactivos los items del listview
      onTap: (){
        print("Nombre: " + estado.nombre);
        print("Capital: " + estado.capital);
        print("Superficie: " + estado.superficie);
        print("Población: " + estado.poblacion);
      },
    );
  }
}