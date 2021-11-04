#include "ordenamientos.h"
#include "utilidades.h"
#include <stdio.h>
#include <stdlib.h>


void selectionSort(int arreglo[], int n)
{
	int indiceMenor, i, j;

	for (i = 0; i < n - 1; i++)
	{
		indiceMenor = i;

		for(j = i + 1; j < n; j++)
		{
			if(arreglo[j] < arreglo[indiceMenor])
			{
				indiceMenor = j;
			}

		}
		if (i != indiceMenor)
		{
			swap(&arreglo[i], &arreglo[indiceMenor]);
		}

		printf("\nIteracion numero %d \n",i+1);

		printArray(arreglo, n);
	}
}


void insertionSort(int a[], int n)
{
	int i, j, k;
	int aux;

	for(i = 1; i < n; i++)
	{
		j = i;
		aux = a[i];
		while (j > 0 && aux < a[j-1])
		{
			a[j] = a[j-1];
			j--;
		}

		a[j]=aux;

		printf("\nIteracion numero %d \n",i);

		printArray(a,n);
	}
}

int heapSize;

void HeapSort(int A[], int size)
{
	BuildHeap(A,size);

  	int i;

  	for(i = size - 1; i > 0; i--)
  	{
    	swap(&A[0], &A[heapSize]);

      	heapSize--;

      	printf("Iteracion HS: \n");

  		printArray(A,size);

		Heapify(A, 0,size);
   }
}

void Heapify(int* A, int i, int size)
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

    	printArray(A,size);

    	Heapify(A, largest,size);
     }

}

void BuildHeap(int* A, int size)
{
	heapSize = size - 1;

  	int i;

  	for(i = (size - 1) / 2; i >= 0; i--)
  	{
		Heapify(A, i,size);
  	}
	printf("Termin%c de construir el HEAP \n",162);
}

int partition (int arr[], int low, int high)
{
    int pivot = arr[high];
    //printf("Pivote: %d    ", pivot);
    int j, i = (low - 1);
    for (j = low; j <= high - 1; j++)
    {
        if (arr[j] <= pivot)
        {
            i++;
            swap(&arr[i], &arr[j]);
            printArray(arr, high);
        }
    }
    swap(&arr[i + 1], &arr[high]);
    printArray(arr, high);
    return (i + 1);
}

void quickSort(int arr[], int low, int high)
{
    if (low < high)
    {
        int pi = partition(arr, low, high);
		printf("primero\n");
        quickSort(arr, low, pi - 1);
        printf("segundo\n");
        quickSort(arr, pi + 1, high);
    }
}

void bubbleSort(int a[], int size)
{
    int i, j, n;
    int x = 1;
    n = size;
    for (i = n - 1; i > 0; i--)
    {
    	for (j = 0; j < i; j++)
    	{
    		if (a[j] > a[j+1])
    		{
    			swap(&a[j], &a[j+1]);
    			x = 0;
    		}
    	}
    	printArray(a, size);

    	if(x == 1){break;}
    }
}

void merge(int list[], int p, int q, int r)
{
	int list2[r + 1];
	int i,j,k;
	k = 0;
	i = p;
	j = q + 1;

	while(i <= q && j <= r)
	{
		if(list[i] < list[j])
		{
			list2[k++] = list[i++];
		}
		else
		{
			list2[k++] = list[j++];
		}
	}
	while(i <= q)
	{
		list2[k++] = list[i++];
	}
	while(j <= r)
	{
		list2[k++] = list[j++];
	}

	for(i = r; i >= p; i--)
	{
		list[i] = list2[--k];
	}
}

void mergeSort(int list[], int p, int r)
{
	int q;
	if(p < r)
	{
		q = (p + r) / 2;
		mergeSort(list, p, q);
		mergeSort(list, q + 1, r);
		merge(list, p, q, r);
	}
}
