package principal;

import java.util.Arrays;
import java.util.Objects;

/**
 *
 * @author ESFOT
 */
public class Estudiantes {
    private String nombre;
    private int edad;
    private Materias[] materia;
    
    public Estudiantes(String nombre, int edad, Materias[] materia){
        this.nombre = nombre;
        this.edad = edad;
        this.materia = materia;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public Materias[] getMateria() {
        return materia;
    }

    public void setMateria(Materias[] materia) {
        this.materia = materia;
    }

    @Override
    public int hashCode() {
        int hash = 7;
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Estudiantes other = (Estudiantes) obj;
        if (this.edad != other.edad) {
            return false;
        }
        if (!Objects.equals(this.nombre, other.nombre)) {
            return false;
        }
        if (!Arrays.deepEquals(this.materia, other.materia)) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        String estudiante = "\nNombre: " + nombre + ", Edad: " + edad + ", Materias: \n";
        
        for(int i = 0; i < materia.length; i++){
            estudiante += materia[i]+"\n";
        }
        
        return estudiante; 
    }
    
}
