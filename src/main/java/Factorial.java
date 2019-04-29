import java.util.InputMismatchException;
import java.util.Scanner;

/**
 * Created by oscargutierrez on 4/29/19.
 */
public class Factorial {

    public static void main (String ... args){

        int entero = leerEntrada();

        long factorial = factorial(entero);

        int suma =  sumarDigitos(factorial);

        System.out.println("La suma de los dífitos del factorial de " + entero + " es: " + suma);

    }

    private static int sumarDigitos(long numero) {
        String[] numArr = String.valueOf(numero).split("");
        int resul = 0;
        for(int i = 0 ; i < numArr.length ; i++){
            resul += Integer.parseInt(numArr[i]);
        }
        return resul;
    }

    private static int factorial(long entero) {
        int factorial = 1;
        for(long i = entero ; i > 0 ; i--){
            factorial *= i;
        }
        return factorial;
    }

    private static int leerEntrada() {
        while(true) {
            Scanner reader = new Scanner(System.in);  // Reading from System.in
            System.out.println("Ingrese un número entero: ");
            try {
                int n = reader.nextInt();
                return n;
            } catch(InputMismatchException e){
                System.out.println("Entrada no válida");
            }
        }
    }



}
