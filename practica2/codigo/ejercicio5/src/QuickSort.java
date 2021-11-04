public class QuickSort
{
    static int partition (int[] arr, int low, int high)
    {
        int pivot = arr[high];
        System.out.println("Pivote: " + pivot);
        int i = (low - 1);

        for (int j = low; j < high; j++)
        {
            if (arr[j] <= pivot)
            {
                i++;
                Utilerias.swap(arr,i,j);
                System.out.print("Swap: " + arr[j] + " y " + pivot + " | ");
                Utilerias.subArray(arr,low,high);
            }
        }

        int temp = arr[i+1];
        arr[i+1] = arr[high];
        arr[high] = temp;

        System.out.print("Arreglo: ");
        Utilerias.printArray(arr);

        return i + 1;
    }

    static void quickSort(int[] arr, int low, int high)
    {
        if (low < high)
        {
            int pi = partition(arr, low, high);
            quickSort(arr, low, pi - 1);
            quickSort(arr, pi + 1, high);
        }
    }
}
