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
    //int n;
    int* arr = (int*) malloc(sizeof(int) * 1);
    //int option;
    int sizes[5] = {10, 100, 500, 1000, 2000};

    for(int k = 0; k < 3; k++)
    {
        for(int a = 0; a < 5; a++)
        {
            arr = realloc(arr, sizeof(int) * sizes[a]);
            int n = sizes[a];
            int arrays = 1;

            for(int j = 0; j < 6; j++)
            {
                int option;

                if((j + 1) % 2 != 0)
                {
                    option = arrays;
                    arrays++;
                }
                else
                {
                    option = k + 4;
                }

                int count = 0;
                int* ptrcount = &count;

                switch(option)
                {
                    case 1:
                        printf("Tipo: Ascedente, Elementos: %d", n);

                        for(int i = 0; i < n; i++)
                        {
                            arr[i] = i + 1;
                        }
                        break;
                    case 2:
                        printf("Tipo: Descedente, Elementos: %d", n);

                        int z = n;

                        for(int i = 0; i < n; i++)
                        {
                            arr[i] = z;
                            z--;
                        }
                        break;
                    case 3:
                        printf("Tipo: Aleatorio, Elementos: %d", n);

                        for(int i = 0; i < n; i++)
                        {
                            arr[i] = rand() % 100;
                        }
                        break;
                    case 4:
                        printf("\tSelection Sort:\n");
                        printf("\tBig O: n^2 --> (n^2 - n)/2 \n");
                        selectionSort(arr,n, ptrcount);
                        printf("Corriendo...");
                        printf("Total: %d\n", count);
                        break;
                    case 5:
                        printf("Insertion Sort:\n");
                        printf("Big O: n^2 --> (n^2 - n)/2 \n");
                        insertionSort(arr,n, ptrcount);
                        printf("Corriendo...\n");
                        printf("Total: %d\n", count);
                        break;
                    case 6:
                        printf("Heap Sort:\n");
                        printf("Big O: nlog(n) --> (3n - 1)/2 \n");
                        printf("Corriendo...\n");
                        HeapSort(arr,n, ptrcount);
                        printf("\n");
                        //printf("Count: %d\n", count);
                        break;
                }
                printf("\n");
            }
        }
    }

/****

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

        int count = 0;
        int* ptrcount = &count;

        arr = realloc(arr, sizeof(int) * n);

        switch(option)
        {
            case 1:
                printf("Arreglo ordenado ascedente \n");

                for(int i = 0; i < n; i++)
                {
                    arr[i] = i + 1;
                }
                break;
            case 2:
                printf("Arreglo ordenado descedente\n");

                int j = n;

                for(int i = 0; i < n; i++)
                {
                    arr[i] = j;
                    j--;
                }
                break;
            case 3:
                printf("Arreglo ordenado aleatoriamente\n");

                for(int i = 0; i < n; i++)
                {
                    arr[i] = rand() % 100;
                }
                break;
            case 4:
                printf("Selection Sort:\n");
                printf("Elementos: %d\n", n);
                printf("Big O: n^2 --> (n^2 - n)/2 \n");
                printf("Tiempo esperado: %d\n", (int)(n*(n - 1))/2);
                selectionSort(arr,n, ptrcount);
                printf("Corriendo...");
                printf("Total: %d\n", count);
                break;
            case 5:
                printf("Insertion Sort:\n");
                printf("Elementos: %d\n", n);
                printf("Big O: n^2 --> (n^2 - n)/2 \n");
                printf("Tiempo esperado: %d\n", (int)(n*(n - 1))/2);
                insertionSort(arr,n, ptrcount);
                printf("Corriendo...\n");
                printf("Total: %d\n", count);
                break;
            case 6:
                printf("Heap Sort:\n");
                printf("Elementos: %d\n", n);
                printf("Big O: nlog(n) --> (3n - 1)/2 \n");
                printf("Tiempo esperado: %d\n", (int)((3*n - 1))/2);
                printf("Corriendo...\n");
                HeapSort(arr,n, ptrcount);
                //printf("Count: %d\n", count);
                break;
        }
        printf("\n");
    }
    while(option != 6);
***/

    return 0;
}

