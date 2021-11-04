#include <stdio.h>

#include "ordenamientos.h"
#include "utilidades.h"
#include "utilidades.c"
#include "ordenamientos.c"

int main()
{
    int arr[] = {1,2,3,4,5};

    //printArray(arr, 5);
    bubbleSort(arr, 5);
    //printArray(arr, 5);

    return 0;
}