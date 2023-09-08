package utn.estudiantes.servicio;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import utn.estudiantes.modelo.Estudiante;
import utn.estudiantes.repositorio.EstudianteRepositorio;

import java.util.List;

@Service
public class EstudianteServicio implements IEstudianteServicio{
    @Autowired
    private EstudianteRepositorio estudianteRepositorio;

    @Override
    public List<Estudiante> listarEstudiantes() {
        List<Estudiante> estudiantes = estudianteRepositorio.findAll(); //Con esto nos regresa todos los elementos de la lista
        return estudiantes;
    }

    @Override
    public Estudiante buscarEstudiantePorId(Integer idEstudiante) {
        Estudiante estudiante = estudianteRepositorio.findById(idEstudiante).orElse(null); // orElseThrow para atrapar cualquier tipo de excepción
        return estudiante;
    }

    @Override
    public void guardarEstudiante(Estudiante estudiante) {
        estudianteRepositorio.save(estudiante);
    }

    @Override
    public void eliminarEstudiante(Estudiante estudiante) {
        estudianteRepositorio.delete(estudiante);

    }
}
