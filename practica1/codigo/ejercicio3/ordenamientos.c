#include "ordenamientos.h"
#include "utilidades.h"
#include <stdio.h>


void selectionSort(int arreglo[], int n, int* count)
{
	int indiceMenor, i, j;

	for (i = 0; i < n - 1; i++)
	{
		indiceMenor = i;

		for(j = i + 1; j < n; j++)
		{
			*count += 1;

			if(arreglo[j] < arreglo[indiceMenor])
			{
				indiceMenor = j;
			}

		}
		if (i != indiceMenor)
		{
			swap(&arreglo[i], &arreglo[indiceMenor]);
		}

		//printf("\nIteracion numero %d \n",i+1);

		//printArray(arreglo, n);
	}
}


void insertionSort(int a[], int n, int* count)
{
	int i, j, k;
	int aux;

	for(i = 1; i < n; i++)
	{
		*count += 1;

		j = i;
		aux = a[i];
		while (j > 0 && aux < a[j-1])
		{
			*count += 1;

			a[j] = a[j-1];
			j--;
		}

		a[j]=aux;

		//printf("\nIteracion numero %d \n",i);

		//printArray(a,n);
	}

	if(*count > n)
	{
		*count -= n - 1;
	}
}

int heapSize;

void HeapSort(int A[], int size, int* count)
{
	BuildHeap(A,size, count);

  	int i;

  	int b = *count;
  	*count = 0;

  	for(i = size - 1; i > 0; i--)
  	{
    	swap(&A[0], &A[heapSize]);

      	heapSize--;

      	*count += 1;

      	//printf("Iteracion HS: \n");

  		//printArray(A,size);

		Heapify(A, 0,size, count);
   }

   printf("BuildHeap: %d, HeapSort: %d, Total = %d", b, *count, b + *count);
}

void Heapify(int* A, int i, int size, int* count)
{


	int l = 2 * i + 1;
	int r = 2 * i + 2;
	int largest;

	if(l <= heapSize && A[l] > A[i])
	{
		largest = l;
	}
    else
    {
    	largest = i;
    }

  	if(r <= heapSize && A[r] > A[largest])
  	{
  		largest = r;
  	}

  	if(largest != i)
  	{
    	swap(&A[i], &A[largest]);

    	//printArray(A,size);

    	Heapify(A, largest,size, count);
     }

}

void BuildHeap(int* A, int size, int* count)
{
	heapSize = size - 1;

  	int i;

  	for(i = (size - 1) / 2; i >= 0; i--)
  	{
  		*count += 1;
		Heapify(A, i,size, count);
  	}
  	//printArray(A,size);

	//printf("Termin%c de construir el HEAP \n",162);
}







