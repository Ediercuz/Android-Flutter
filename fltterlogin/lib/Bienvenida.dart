import 'package:flutter/cupertino.dart';
import 'package:flutter/material.dart';

// Crear una clase con estado

class Bienvenida extends StatefulWidget {
  // Recibir los argumentos de la clase main
  String usuario;
  String claveAcesso;

  /**
   * Método constructor de la clase
   */
  Bienvenida(this.usuario, this.claveAcesso);

  @override
  _BienvenidaState createState() => _BienvenidaState();
}


class _BienvenidaState extends State<Bienvenida> {
  @override
  Widget build(BuildContext context) {
    return Container(
      // Imagen de fondo de la app
      decoration: BoxDecoration(
        image: DecorationImage(
          image: AssetImage("img/OIP.jpg"),

          //fit: BoxFit.cover, podemos usar una imagen pequeña y replicarla en toda la pantalla
          repeat: ImageRepeat.repeat,
        ),
      ),

      child: Scaffold(
        // Para ver la imagen lo hacemos transparente
        backgroundColor: Colors.transparent,
        appBar: AppBar(
          title: Text("Bienvenido") ,
        ),
    drawer: Drawer(
      child: ListView(
        padding: EdgeInsets.all(0),
        children: [
          UserAccountsDrawerHeader(
            decoration: BoxDecoration(
                color: Colors.deepPurple,
            ),
            accountName: Text("Diciembre 2020"),
            accountEmail: Text("navidad@hotmail.com"),
            currentAccountPicture: Image.asset("img/ham.jpg"),
          ),
          ListTile(
            title: Text("enjoying"),
            leading: Icon(Icons.add_alert_rounded),
            onTap: (){

            },
          )
        ],
      ),
    ),


        body: ListView (
          children: [      // Un componente en que podemos regresar varios widgets
            Container(
              padding: EdgeInsets.all(24),
              child: Text(
                "Bienvenido "+ widget.usuario+":"+ "con clave: "+widget.claveAcesso+" Tienes Acceso Autorizado, ",
                style: TextStyle(
                  fontSize: 22,
                  fontFamily: "rbold",
                ),
              ),

            ),
          ],
        ),
      ),
    );
  } // Build
} // fin de la clase
