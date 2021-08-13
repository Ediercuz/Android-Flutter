import 'dart:math';

import 'package:flutter/material.dart';

void main() {
  runApp(imcApp());
}

// Crear clase para generar los widgets de la App

class imcApp extends StatelessWidget {

  // Creamos los controladors (id) para los campos de texto
  var txtEst = TextEditingController();
  var txtPeso = TextEditingController();
  var txtRes = TextEditingController();

  /**
   * Método para calcular el imc
   */
  void calcularIMC(double valorEst, double valorPeso){

    // Calculamos indice de masa corporal
    double imc = valorPeso/pow(valorEst, 2);
    BuildContext context;

    // Identificamos categorias del IMC
    if (imc < 16.0){
      // Desplegar mensaje
      String cad = "IMC:"+ imc.toString()+","+"Bajo peso con delgadez severa";
      txtRes.text = cad;
    }
    else if (imc >=16.0  && imc < 16.99){
      // Desplegar mensaje
      String cad = "IMC:"+ imc.toString()+","+"Bajo peso con delgadez moderada";
      txtRes.text = cad;
    }

    else if (imc >=17.0  && imc < 18.49){
      // Desplegar mensaje
      String cad = "IMC:"+ imc.toString()+","+"Bajo peso con delgadez delgadez aceptable";
      txtRes.text = cad;
    }

    else if (imc >=18.50  && imc < 24.99){
      // Desplegar mensaje
      String cad = "IMC:"+ imc.toString()+","+"tienes peso normal";
      txtRes.text = cad;
    }

    else if (imc >=25.00  && imc < 29.99){
      // Desplegar mensaje
      String cad = "IMC:"+ imc.toString()+","+"tienes sobrepeso";
      txtRes.text = cad;
    }

    else if (imc >=30.00  && imc < 34.99){
      // Desplegar mensaje
      String cad = "IMC:"+ imc.toString()+","+"tienes obesidad tipo 1";
      txtRes.text = cad;
    }

    else if (imc >=35.00  && imc < 40.00){
      // Desplegar mensaje
      String cad = "IMC:"+ imc.toString()+","+"tienes obesidad tipo II";
      txtRes.text = cad;
    }

    else if (imc > 40.00 ){
      // Desplegar mensaje
      String cad = "IMC:"+ imc.toString()+","+"tienes obesidad tipo III";
      txtRes.text = cad;
    }
  }

  // Método para desplegar un minimodal en la pantalla
  void showMessageIMC(BuildContext context, String msg){
    showDialog(context: context,
      child: AlertDialog(
        title:Text("IMC"),
        content: Text(msg),
      ),
    );
  }




  @override
  Widget build(BuildContext context) {
    return MaterialApp(
      //construimos home de la app
      home: Scaffold(
        backgroundColor: Colors.grey[50],
        appBar: AppBar(
          title: Text("Calculadora IMC"),
        ),
        body: Column(
          children: [

            // Campo de texto para ingresar estatura
            Container (
              padding: EdgeInsets.all(15),
              child: TextField(
                decoration:InputDecoration(
                  hintText: "Estatura en mts.",
                  hintStyle: TextStyle(
                    fontFamily: "RobotoMon",),
                ),
                textAlign: TextAlign.center,
                // Creamos id para el campo texto, mediante un controller
                controller: txtEst,
              ),
            ),

            // Campo de texto para el peso
            Container(
              padding: EdgeInsets.all(15),
              child: TextField(
                decoration: InputDecoration(
                  hintText: "Peso en kilogramos",
                  hintStyle: TextStyle(
                    fontFamily: "RobotoMon",),
                ),
                textAlign: TextAlign.center,
                // Creamos id para el campo texto, mediante un controller
                controller: txtPeso,
              ),
            ),

            // Campo de texto para imprimir el resultado del IMC
            Container(
              padding: EdgeInsets.all(20),
              child: TextField(
                decoration: InputDecoration(
                  fillColor: Color.alphaBlend(Colors.black, Colors.blue),
                  border: OutlineInputBorder(),
                  hintText: "0.0",
                  hintStyle: TextStyle(
                    fontFamily: "RobotoMon",),
                ),
                textAlign: TextAlign.center,
                // Creamos id para el campo texto, mediante un controller
                controller: txtRes,
              ),),


            // Creamos boton para invocar el cálculo
            Container(
              padding: EdgeInsets.all(20),
              child: RaisedButton(
                child: Text("Calcular IMC"),
                onPressed: (){
                  // Leer el contenido de los campo de la estatura
                  String cad = txtEst.text;
                  // Convertirlo a número
                  double est = double.parse(cad);
                  // Leer el contenido del campo peso
                  cad = txtPeso.text;
                  // Convertimos a número
                  double peso = double.parse(cad);
                  // Invocar una función
                  calcularIMC(est, peso);

                },
              ),

            ),

            Container(
              padding: EdgeInsets.all(30),
              child: Image.asset("img/sobrepeso.png", width: 100,),

            ),

          ],
        ),
      ),

    );
  }

}
