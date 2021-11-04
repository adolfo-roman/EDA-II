void menu(int* option)
{
    int n;

    do
    {
        printf("1. Counting Sort\n");
        printf("2. Radix Sort\n");
        printf("3. Exit\n");

        scanf("%d", &n);
        getchar();
    }
    while(n < 1 || n > 3);

    *option = n;

    return ;
}


void optionOne()
{
    int size = 20;

    char arr[size];
    char sorted[size];

    charGet(arr, size);

    printCharArr(arr, size);
    countingSort(arr, size, sorted);
    printCharArr(sorted, size);

    return;
}

void optionTwo()
{
    int size;

    printf("Ingresa un tamano (minimo 15) para el arreglo: \n");

    do
    {
        scanf("%d", &size);
        getchar();
    }
    while(size < 15);

    int arr[size];

    printf("Ingresa elementos a ordenar: \n");
    printf("\n");

    for(int i = 0; i < size; i++)
    {
        scanf("%d", &arr[i]);
        getchar();
    }
    printf("\n");

    printIntArr(arr, size);

    radixSort(arr, size);

    return;
}