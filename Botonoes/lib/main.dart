import 'package:flutter/material.dart';

void main() => runApp(MyApp());

class MyApp extends StatelessWidget {
  // This widget is the root of your application.
  @override
  Widget build(BuildContext context) {
    return MaterialApp(
      // Application name
      title: 'Flutter Buttons Example',
      // Application theme data, you can set the colors for the application as
      // you want
      theme: ThemeData(
        brightness: Brightness.dark,
        primaryColor: Colors.deepPurple,
        accentColor: Colors.cyan[600],

      ),
      // A widget which will be started on application startup
      home: MyHomePage(title: 'Flutter Demo Home Page'),
    );
  }
}

class MyHomePage extends StatelessWidget {
  final String title;

  const MyHomePage({@required this.title});

  @override
  Widget build(BuildContext context) {
    return Scaffold(
      appBar: AppBar(
        // The title text which will be shown on the action bar
        title: Text(title),
      ),
      body: Center(
        child: Column(
            mainAxisAlignment: MainAxisAlignment.center,
            children: <Widget>[
              Container(
                margin: EdgeInsets.only(top: 8),
                child: OutlineButton(
                  shape: RoundedRectangleBorder(
                    borderRadius: BorderRadius.circular(15),
                  ),
                  child: Text("OutlineButton"),
                  onPressed:()=>{ },
                ),//OutlineButton
              ),
              Container(
                margin: EdgeInsets.only(top: 8),
                child: FlatButton(
                  child: Text("Flat Button Example"),
                  color: Colors.blue,
                  //Evento
                  onPressed:()=>{ },
                ),//FlatButton
              ),//Container
              Container(
                margin: EdgeInsets.only(top: 8),
                child: RaisedButton(
                  shape: RoundedRectangleBorder(
                    borderRadius: BorderRadius.circular(15),
                  ),
                  child: Text("RaisedButton"),
                  color: Colors.red,
                  onPressed: ()=>{ },
                ),//RaisedButton
              ),//Container//Container
              Container(
                margin: EdgeInsets.only(top: 8),
                child: MaterialButton(
                  shape: RoundedRectangleBorder(
                    borderRadius: BorderRadius.circular(0),
                  ),
                  child: Text("MaterialButton"),
                  color: Colors.deepPurple,
                  onPressed: ()=>{ },
                ),//FloatingActionButton
              ),
              Container(
                margin: EdgeInsets.only(top: 8),
                child: FloatingActionButton(
                  shape: RoundedRectangleBorder(
                    borderRadius: BorderRadius.circular(0),
                  ),
                  child: Text("FloatingActionButton"),
                  backgroundColor: Colors.green,
                  onPressed: ()=>{ },
                ),//FloatingActionButton
              ),//Container
            ]
        ),//Column
      ),
    );
  }
}