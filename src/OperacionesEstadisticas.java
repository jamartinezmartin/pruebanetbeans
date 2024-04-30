import java.util.Arrays;

public class OperacionesEstadisticas {
    public static double op3(double[] numeros) {
        double suma = 0;
        for (double num : numeros) {
            suma += num;
        }
        return suma / numeros.length;
    }

    public static double op4(double[] numeros) {
        Arrays.sort(numeros);
        int n = numeros.length;
        if (n % 2 == 0) {
            return (numeros[n / 2 - 1] + numeros[n / 2]) / 2;
        } else {
            return numeros[n / 2];
        }
    }
}
