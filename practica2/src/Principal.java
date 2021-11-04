import java.util.Scanner;

public class Principal
{
    public static void main(String[] args)
    {
        Scanner scan = new Scanner(System.in);

        int[] arr = new int[20];

        System.out.println("Ingrese 20 elementos para nuevo arreglo: ");

        for (int i = 0; i < 20; i++) {
            arr[i] = scan.nextInt();
        }

        System.out.print("Arreglo original: ");
        Utilerias.printArray(arr);
        System.out.println();

        QuickSort.quickSort(arr,0,19);

        System.out.print("\nArreglo despues de QuickSort: ");
        Utilerias.printArray(arr);
    }
}
