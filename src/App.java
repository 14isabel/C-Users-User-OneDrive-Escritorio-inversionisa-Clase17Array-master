import java.util.Scanner;

public class App {

    public static int tamv = 0;
    public static Scanner leer = new Scanner(System.in);

    public static void main(String[] args) throws Exception {

        boolean condicionSalida = true;

        do {

            try {

                System.out.println("Ingrese el tamaño del arreglo que no supere los 16 y sea mayor a 1, nada de negativos ");
                tamv = leer.nextInt();
                condicionSalida = (tamv >= 1 && tamv <= 16) ? false : true;

            } catch (Exception e) {
                System.out.println("Error: Debes ingresar un número entero válido.");
                leer.nextLine();
            }

        } while (condicionSalida);

        // Recibimos el array del método
        int array[] = llenado();

        System.out.println("Mostrar Datos Ingesados");

        Mostrar(array);

        // Invertir el array
        int arrayInvertido[] = invertirArray(array);

        System.out.println("Datos Array invertido");

        Mostrar(arrayInvertido);

    }

    public static int[] llenado() {
        int[] arreglo = new int[tamv];

        for (int i = 0; i < arreglo.length; i++) {
            boolean condicionSalida = true;

            do {
                try {
                    System.out.println("Ingrese el valor [" + i + "]");
                    arreglo[i] = leer.nextInt();
                    condicionSalida = false;
                } catch (Exception e) {
                    System.out.println("Error: Debes ingresar un número entero válido.");
                    leer.nextLine();
                }
            } while (condicionSalida);
        }

        return arreglo;
    }

    public static void Mostrar(int[] a) {
        for (int i : a) {
            System.out.println(i);
        }
    }

    public static int[] invertirArray(int[] array) {
        int[] arrayInvertido = new int[array.length];
        for (int i = 0; i < array.length; i++) {
            arrayInvertido[i] = array[array.length - 1 - i];
        }
        return arrayInvertido;
    }
}
