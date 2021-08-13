class Estado {

  // Lista de atributos
  final String nombre;
  final String capital;
  final String superficie;
  final String poblacion;

  // Constructor
  const Estado({
    this.nombre,
    this.capital,
    this.superficie,
    this.poblacion
  });

}


// Creamos objetos de la clase Estado
// Agregar la info de los atributos de cada municipio

final atributos = [
  new Estado(nombre: "Armeria", capital: "Armeria", superficie: "408.38 km²",poblacion: "27,626"),
  new Estado(nombre: "Colima", capital: "Colima", superficie: "1668.2 km² ",poblacion: "157,048"),
  new Estado(nombre: "Comala", capital: "Comala", superficie: "254 km²",poblacion: "21,661"),
  new Estado(nombre: "Coquimatlán", capital: "Coquimatlán", superficie: "320.2 km²",poblacion: "20,837"),
  new Estado(nombre: "Cuauhtémoc", capital: "Cuauhtémoc", superficie: "373.2 km²",poblacion: "31,267"),
  new Estado(nombre: "Ixtlahuacán", capital: "Ixtlahuacán", superficie: "376,078 km²",poblacion: "5,623"),
  new Estado(nombre: "Manzanillo", capital: "Manzanillo", superficie: "19 km²",poblacion: "191,031"),
  new Estado(nombre: "Minatitlán", capital: "Minatitlán", superficie: "215 km²",poblacion: "10,231"),
  new Estado(nombre: "Tecomán", capital: "Tecomán", superficie: "834.8 km²",poblacion: "116,305"),
  new Estado(nombre: "Villa de Álvarez", capital: "Villa de Álvarez", superficie: "428.4 km²",poblacion: "149,762"),
];


