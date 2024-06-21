package com.app.web.servicio;

import com.app.web.entidad.Estudiante;
import java.util.List;

public interface EstudianteServicio {

    //Creamos los metodos , para las funciones del CRUD

    List<Estudiante> listarTodosLosEstudiantes();

    Estudiante guardarEstudiante(Estudiante estudiante);

    Estudiante obtenerEstudiantePorId(Long id);

    Estudiante actualizarEstudiante(Estudiante estudiante);


    void eliminarEstudiante(Long id);
}
