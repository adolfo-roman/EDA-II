#include "utilidades.h"
#include <stdio.h>

#define YELLOW  "\x1b[33m"
#define GREEN   "\x1b[32m"
#define RESET   "\x1b[0m"

void swap(int* a, int* b){
    int t = *a;
    *a = *b;
    *b = t;
}

void printArray(int arr[],int size){
	int i;
  	for (i=0; i < size; i++)
       	printf("%d ", arr[i]);
    	printf("\n");
}

void printSubArray(int arr[],int low, int high){
    int i;
    printf("Sub array :  ");
	for (i=low; i <= high; i++)
       printf("%d ", arr[i]);
    printf("\n");
}

void sswap(int* a, int* b, int j, int size, int list[]){
    int t = *a;
    *a = *b;
    *b = t;
    for (int i = 0; i < j; i++)
    {
        printf("%d ", list[i]);
    }


     printf(YELLOW "%d ", list[j]);
     printf(RESET);
     printf(GREEN "%d ", list[j + 1]);
     printf(RESET);

     for (int i = j + 2; i < size; i++)
     {
        printf("%d ", list[i]);
     }

      printf("\n");
}