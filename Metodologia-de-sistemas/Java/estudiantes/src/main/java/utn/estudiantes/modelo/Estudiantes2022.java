package utn.estudiantes.modelo;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

@Entity
//boilerplate - es código repetitivo
@Data // Crea los métodos get y set
@NoArgsConstructor // Agrega el constructor vacío(Sin argumentos)
@AllArgsConstructor //Agrega constructor con todos los argumentos
@ToString // Agrega método to string
public class Estudiantes2022 {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer idestudiantes2022;
    private String nombre;
    private String apellido;
    private String telefono;
    private String email;
}