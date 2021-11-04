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
            printf("3) Selection\n");
            printf("4) Insertion\n");
            printf("5) Heap\n");
            printf("6) Salir\n");

            scanf("%d", &option);

            printf("\n");
        }
        while(option < 1 || option > 7 );

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
        }
        printf("\n");
    }
    while(option != 6);

    return 0;
}

