import java.util.Scanner;

public class App {

    public static void main(String[] args) throws Exception {
        
        int [] arr = new int[5];
        
        Scanner leer = new Scanner(System.in);
        for (int i = 0; i < arr.length; i++) {
            System.out.println("Ingrese el valor del Numero " +(i+1));
            arr[i] = leer.nextInt();
        }

        System.out.println("Arreglo original");
        for (int num : arr) {
            System.out.println(num + " ");
        }

        System.out.println();

        System.out.println("===========================");
        insertionsSort(arr);

        System.out.println("Arreglo ordenado: ");
        for (int num : arr) {
            System.out.println(num + " ");
        }

        leer.close();
        
    }

    public static void insertionsSort(int[] arr) {

        int n = arr.length;
        
        for (int i = 1; i < n; i++) {
            int key = arr[i];
            int j = i - 1;

            while (j >= 0 && arr[j] > key) {
                arr [j + 1] = arr[j];
                j--;
            }
            arr[j+1] = key;
        }
    }

}
