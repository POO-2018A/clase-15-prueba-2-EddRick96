package principal;
import java.util.Scanner;
/**
 *
 * @author ESFOT
 */
public class Principal {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        Estudiantes[] estudiante = new Estudiantes[5];
        
        System.out.println("\t\tBIENVENIDO A LA EPN");
        
        for(int i = 0; i < estudiante.length; i++){
            scan.nextLine();
            System.out.println("Estudiante "+(i+1)+": ");
            
            System.out.println("Ingrese el nombre: ");
            String nombre = scan.nextLine();
            
            System.out.println("Ingrese la edad: ");
            int edad = scan.nextInt();
            
            Materias[] materia = new Materias[2];
            
            for(int j = 0; j < materia.length; j++){
                scan.nextLine();
                System.out.println("Ingrese la materia "+(j+1)+": ");
                String nomMateria = scan.nextLine();
                System.out.println("Ingrese el nivel: ");
                int nivel = scan.nextInt();
                materia[j] = new Materias(nomMateria, nivel);
            }
            
            estudiante[i] = new Estudiantes(nombre, edad, materia);
            System.out.println("Se ha ingresado el setudiante con los siguientes datos: ");
            System.out.println(estudiante[i]);
        }
    }
    
}
