#include <stdio.h>

#include "ordenamientos.h"
#include "utilidades.h"
#include "utilidades.c"
#include "ordenamientos.c"


int main()
{
    int arr[] = {54,1,65,98,4,9,1,9,8,1,5};

    printArray(arr, 11);
    mergeSort(arr, 0, 10);
    printArray(arr, 11);
}