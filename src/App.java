import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {





        double promedio;
        String condicionFinal;
        String condicionFinalEN;

        Scanner teclado = new Scanner(System.in);

        System.out.println("Ingrese el promedio general del alumno:");
        System.out.println("Insert the school grade (0 to 10) of a student: ");
        promedio = teclado.nextDouble();
        
        condicionFinal = promedio >= 6 ? "Aprobado" : "Desaprobado";
        condicionFinalEN = promedio >= 6 ? "Approved" : "Disapproved";
        System.out.println("La condición final del alumno es: " + condicionFinal);
        System.out.println("The student's final condition is: " + condicionFinalEN);



    }
}
