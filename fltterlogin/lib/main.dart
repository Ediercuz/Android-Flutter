import 'package:flutter/material.dart';
import "Bienvenida.dart";

void main() {
  runApp(MiClase());
}

class MiClase extends StatelessWidget {
  @override
  Widget build(BuildContext context) {
    return MaterialApp(
      title: "Login&Password",
      theme: ThemeData(primarySwatch: Colors.lightBlue),
      home:  Pantalla(),
    ); // MaterialApp
  }
}

// Clase para crear los widgets de la App

class Pantalla extends StatefulWidget {
  @override
  _PantallaState createState() => _PantallaState();
}

class _PantallaState extends State<Pantalla> {

  // Declarar dos variables para identificar a los campos de texto
  var txtLogin = TextEditingController();
  var txtPass  = TextEditingController();



  // Construir widgets de la app
  @override
  Widget build(BuildContext context) {
    return Scaffold(
      backgroundColor: Colors.grey[200],
      appBar: AppBar(
        title: Text("Login&Password") ,
      ),
      body: ListView (
        children: [      // Un componente en que podemos regresar varios widgets
          Container(    //Contenedor invisible, contener un widget para la imagen
            padding:EdgeInsets.symmetric(vertical: 50, horizontal: 10),
            alignment: Alignment.center,
            child: Image.asset("img/logimg.jpeg"),
          ),

          // Container para el campo de texto login
          Container(
            padding: EdgeInsets.all(20),
            child: TextField(
              decoration: InputDecoration(
                  hintText: "Usuario"
              ),
              controller: txtLogin,
            ),
          ),

          // Container para el campo de texto password
          Container(
            padding: EdgeInsets.all(20),
            child: TextField(
              obscureText: true,
              decoration: InputDecoration(
                  hintText: "Clave de acceso"
              ),
              controller: txtPass,
            ),
          ),

          // Contenedor para el boton
          Container(
            padding: EdgeInsets.all(25),
            alignment: Alignment.center,
            child: RaisedButton(
              color: Colors.amber,
              child: Text(
                "Ingresar",
                style: TextStyle(
                  fontSize: 18,
                  fontFamily: "rbold",
                ),
              ),

              // manejador del evento
              onPressed: () {

                // almacenamos en variables el contenidos de los campos de texto
                String usu = txtLogin.text;
                String  clave = txtPass.text;

                // comparamos para validar login y password
                if (txtLogin.text == "prueba" && txtPass.text=="123") {

                  // Invocariamos a la pantalla Bienvenida.dart
                  /* Navigator.of(context).push(MaterialPageRoute<Null>(
                      builder: (BuildContext context){
                        // Invocamos una clase que genera los widgets del formulario 2
                        return new Bienvenida(usu, clave);
                      }
                    ),); */

                  // Invocariamos a la pantalla Bienvenida.dart elimando la opción del return
                  /*
                      Navigator.of(context).pushAndRemoveUntil(MaterialPageRoute<Null>(
                        builder: (BuildContext context){
                          // Invocamos una clase que genera los widgets del formulario 2
                          return new Bienvenida(usu, clave);
                        }
                    ), (Route<dynamic> route) => false    );
                   */

                  // Invocariamos a la pantalla Bienvenida.dart podemos cerrar la vista en el ícono de la barra
                  Navigator.of(context).push(MaterialPageRoute<Null>(
                      builder: (BuildContext context){
                        // Invocamos una clase que genera los widgets del formulario 2
                        return new Bienvenida(usu, clave);
                      }, fullscreenDialog: true
                  ),);

                }
                else {
                  // Imprimimos ventana de dialogo para imprimir error en log o pass
                  showDialog(
                      context: context,
                      barrierDismissible: false,
                      builder:(BuildContext context) {
                        // Regresa como widget una ventana de dialogo
                        return AlertDialog(

                          title: Text("Atención"),

                          content: SingleChildScrollView(
                            child: ListBody(
                              children: [
                                Text("Verifica tus datos ..."),

                              ],
                            ),
                          ),
                          // Acciones que vamos a ejecutar
                          actions: [
                            FlatButton(
                              child: Text("Aceptar"),
                              onPressed: (){
                                Navigator.of(context).pop();
                              },
                            ),

                            FlatButton(
                              child: Text("Cancelar"),
                              onPressed: (){
                                Navigator.of(context).pop();
                                txtLogin.text = null;
                                txtPass.text = null;
                              },
                            ),
                          ],

                        );

                      }

                  );


                }


              },
            ),

          ),


        ],

      ),
    );
  }
}
