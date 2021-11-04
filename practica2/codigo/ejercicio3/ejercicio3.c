#include <stdio.h>
#include <time.h>
#include <stdlib.h>

#include "ordenamientos.h"
#include "ordenamientos.c"
#include "utilidades.h"
#include "utilidades.c"

int main()
{
    srand(time(NULL));
    int n;
    int* arr = (int*) malloc(sizeof(int) * 1);
    int option;

    do
    {
        do
        {
            printf("1) Elaborar arreglo\n");
            printf("2) Imprimir arreglo\n");
            printf("3) SelectionSort\n");
            printf("4) InsertionSort\n");
            printf("5) HeapSort\n");
            printf("6) QuickSort\n");
            printf("7) BubbleSort\n");
            printf("8) MergeSort\n");
            printf("9) Salir\n");

            scanf("%d", &option);

            printf("\n");
        }
        while(option < 1 || option > 10 );

        switch(option)
        {
            case 1:
                printf("No. elementos: ");
                scanf("%d", &n);

                arr = realloc(arr, sizeof(int) * n);

                for(int i = 0; i < n; i++)
                {
                    arr[i] = rand() % 100;
                }
                break;
            case 2:
                for(int i = 0; i < n; i++)
                {
                    printf("%d ", arr[i]);
                }
                printf("\n");
                break;
            case 3:
                selectionSort(arr,n);
                break;
            case 4:
                insertionSort(arr,n);
                break;
            case 5:
                HeapSort(arr,n);
                break;
            case 6:
                printf("Arreglo sin ordenar: ");
                printArray(arr, n);
                printf("\n");
                quickSort(arr, 0, n - 1);
                printf("\n");
                printf("Arreglo ordenado: ");
                printArray(arr, n);
                printf("\n");
                break;
            case 7:
                printf("Arreglo sin ordenar: ");
                printArray(arr, n);
                printf("\n");
                bubbleSort(arr,n);
                printf("\n");
                printf("Arreglo ordenado: ");
                printArray(arr, n);
                printf("\n");
                break;
            case 8:
                printf("Arreglo sin ordenar: ");
                printArray(arr, n);
                printf("\n");
                mergeSort(arr,0, n - 1, 1, "Nivel Inicial");
                printf("\n");
                printf("Arreglo ordenado: ");
                printArray(arr, n);
                printf("\n");
                break;
        }
        printf("\n");
    }
    while(option != 9);

    return 0;
}

