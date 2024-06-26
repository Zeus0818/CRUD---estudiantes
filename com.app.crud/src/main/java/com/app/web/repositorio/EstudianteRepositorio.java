package com.app.web.repositorio;

import com.app.web.entidad.Estudiante;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

/**
 * JPARepository : contiene todos los repositorios que vamos a usar
 */
@Repository
public interface EstudianteRepositorio extends JpaRepository<Estudiante,Long> {
}
