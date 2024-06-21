package com.app.web.entidad;

import jakarta.persistence.*;

@Entity
@Table(name = "estudiantes")
public class Estudiante {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    @Column(name = "nombre", nullable = false, length = 30)
    private  String nombre;

    @Column(name = "apellido", nullable = false, length = 30)
    private String apellido;

    /*
    * unique = true ; ya que un email no se puede repetir
    * */
    @Column(name = "email", nullable = false, length = 30,unique = true)
    private String email;

    /*
    * Craemos un constructor vacio, por la nomenclatura de los java-beans
    * */
    public Estudiante() {

    }

    public Estudiante(long id, String nombre, String apellido, String email) {
        this.id = id;
        this.nombre = nombre;
        this.apellido = apellido;
        this.email = email;
    }

    public Estudiante( String nombre, String apellido, String email) {
        super();
        this.nombre = nombre;
        this.apellido = apellido;
        this.email = email;
    }


    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    @Override
    public String toString() {
        return "Estudiante{" +
                "id=" + id +
                ", nombre='" + nombre + '\'' +
                ", apellido='" + apellido + '\'' +
                ", email='" + email + '\'' +
                '}';
    }
}
