package utn.estudiantes.servicio;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import utn.estudiantes.modelo.Estudiantes2022;
import utn.estudiantes.repositorio.EstudianteRepositorio;

import java.util.List;

@Service
public class EstudianteServicio implements IEstudianteServicio{
    @Autowired
    private EstudianteRepositorio estudianteRepositorio;

    @Override
    public List<Estudiantes2022> listarEstudiantes() {
        List<Estudiantes2022> estudiantes = estudianteRepositorio.findAll(); //Con esto nos regresa todos los elementos de la lista
        return estudiantes;
    }

    @Override
    public Estudiantes2022 buscarEstudiantePorId(Integer idEstudiante) {
        Estudiantes2022 estudiante = estudianteRepositorio.findById(idEstudiante).orElse(null); // orElseThrow para atrapar cualquier tipo de excepción
        return estudiante;
    }

    @Override
    public void guardarEstudiante(Estudiantes2022 estudiante) {
        estudianteRepositorio.save(estudiante);
    }

    @Override
    public void eliminarEstudiante(Estudiantes2022 estudiante) {
        estudianteRepositorio.delete(estudiante);

    }
}
