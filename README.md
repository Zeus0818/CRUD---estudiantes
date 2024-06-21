# CRUD---estudiantes
Proyecto con SpringBoot  uasando MySql y Bootstrap + JavaDoc


PASOS -CRUD Spring

1- Creamos bd : 'db_crud'
2- En tu app, configuras tus propiedades
3-Clase estudiante - datos de la tabla
4-En la misma clase agregamos el constructor, el getters  and setters y el toString.

5-Creamos la interface 'estudianteServicio'.
6-Creamos la clase 'EstudianteServicioImpl'

7-Creamos el paquete controlador , y añadimos la clase EstudianteControlador
8-En la clase creamos el mismo constructor , pero sin ID
9-En application.properties  'spring.jpa.hibernate.ddl-auto = create' por  'spring.jpa.hibernate.ddl-auto = none'
10- Creamos la clase estudiantes.html en la carpeta templates.
11-Hacemos el listado del alumnado 
12-Utilizamos bootstrap para el navbar y las tablas

13-Creamos la funcion guardarEstudiante , en la clase 'EstudianteControlador' , ademas añadimos el   @PostMapping 
14-Añadimos la funcion 'actualizarEstudiante' , donde llamaremos los campos del formulario
