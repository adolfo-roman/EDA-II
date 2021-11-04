class Utilerias
{
    static void printArray(int[] arr)
    {
        for (int j : arr)
        {
            System.out.print(j + " ");
        }
        System.out.println(" ");
    }

    static void swap(int[] arr, int i, int j)
    {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }

    static void subArray(int[] arr, int low, int high)
    {
        for( int i = low; i < high; i++)
        {
            System.out.print(arr[i] + " ");
        }
        System.out.println(" ");
    }
}
