import 'package:flutter/material.dart';

void main() {
  runApp(MiClase());
}

class MiClase extends StatelessWidget {
  //Declaramos la variable para el controlador del campo de texto, funge como nobre del widget
  var txtNum1 = TextEditingController();
  //Variable para el contador
  int contador = 0;

  @override
  Widget build(BuildContext context) {
    return MaterialApp(
      home: Scaffold(
        appBar: AppBar(title: Text("Contador"),),
        body: Column(
          children: [
            //Lista de widgets
            new Padding(
              padding: EdgeInsets.symmetric(horizontal: 10),
              //Agregamos el textField
              child: new TextField(
                decoration: new InputDecoration.collapsed(
                    hintText: "0",
                    hintStyle: TextStyle(fontSize: 200, fontFamily: "RobotoMono",)),
                textAlign: TextAlign.center,
                style: TextStyle(fontSize: 200, fontFamily: "RobotoMono",),
                //Controller
                controller: txtNum1,
                //inhabilitamos la edición en el campo de texto
                textInputAction: TextInputAction.none,
              ),
            ),

            //Agregamos un boton
            RaisedButton(//Incrementar
              child: Text("Incrementar "),
              //manejador del evento
              onPressed: () {
                //Incrementamos en uno la variable de contador
                contador++;
                //Convertir contador a cadena para escribirlo en la propoedad TExt del TextField
                String cad = contador.toString();
                //Modificamos la propiedad text del TextField
                txtNum1.text = cad;
              },
            ),

            RaisedButton(//Reset
              child: Text("Reset "),
              //manejador del evento
              onPressed: () {
                //Incrementamos en uno la variable de contador
                contador = 0;
                //Convertir contador a cadena para escribirlo en la propoedad TExt del TextField
                String cad = contador.toString();
                //Modificamos la propiedad text del TextField
                txtNum1.text = cad;
              },
            ),

            RaisedButton(//Decrementar
              child: Text("Decrementar "),
              //manejador del evento
              onPressed: () {
                //Incrementamos en uno la variable de contador
                contador --;
                //Convertir contador a cadena para escribirlo en la propoedad TExt del TextField
                String cad = contador.toString();
                //Modificamos la propiedad text del TextField
                txtNum1.text = cad;
              },
            ),



          ],
        ),
      ),
    );
  }
}