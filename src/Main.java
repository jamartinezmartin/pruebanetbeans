import java.util.Scanner;

/**
 * En esta clase se definen operaciones aritméticas, concretamente la suma y la resta
 * @author JAM
 * @version 1.0
 */

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Seleccione la operación:");
        System.out.println("1. Suma");
        System.out.println("2. Resta");
        System.out.println("3. Media");
        System.out.println("4. Mediana");

        int aux = scanner.nextInt();
 
        switch (aux) {
            case 1:
                System.out.println("Ingrese dos números para sumar:");
                double num1 = scanner.nextDouble();
                double num2 = scanner.nextDouble();
                System.out.println("El resultado de la suma es: " + OperacionesAritmeticas.op1(num1, num2));
                break;
            case 2:
                System.out.println("Ingrese dos números para restar:");
                double num3 = scanner.nextDouble();
                double num4 = scanner.nextDouble();
                System.out.println("El resultado de la resta es: " + OperacionesAritmeticas.op2(num3, num4));
                break;
            case 3:
                System.out.println("Ingrese los números para calcular la media (separados por espacios):");
                double[] numeros = new double[5];
                for (int i = 0; i < 5; i++) {
                    numeros[i] = scanner.nextDouble();
                }
                System.out.println("La media de los números ingresados es: " + OperacionesEstadisticas.op3(numeros));
                break;
            case 4:
                System.out.println("Ingrese los números para calcular la mediana (separados por espacios):");
                double[] nums = new double[5];
                for (int i = 0; i < 5; i++) {
                    nums[i] = scanner.nextDouble();
                }
                System.out.println("La mediana de los números ingresados es: " + OperacionesEstadisticas.op4(nums));
                break;
            default:
                System.out.println("Opción no válida");
        }

        scanner.close();
    }
}
