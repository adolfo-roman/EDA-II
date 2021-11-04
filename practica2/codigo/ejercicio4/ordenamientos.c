#include "ordenamientos.h"
#include "utilidades.h"
#include <stdio.h>
#include <stdlib.h>

	int partition (int arr[], int low, int high, int* ptr)
	{
	    int pivot = arr[high];
	    //if(pivot < 11)
	    	//printf("Pivote: %d\n", pivot);
	    int j, i = (low - 1);
	    int x = 0;
	
	    for (j = low; j <= high - 1; j++)
	    {
	        *ptr += 1;
	
	        if (arr[j] <= pivot)
	        {
	            i++;
	            swap(&arr[i], &arr[j]);
	            x++;
	        }
	
	    }
	    swap(&arr[i + 1], &arr[high]);
	
	    if(x == pivot - 1 && x != 0)
	    {
			return -1;
	    }
	
	    return (i + 1);
	}
	
	void quickSort(int arr[], int low, int high, int* ptr)
	{
	    *ptr += 1;
	    if (low < high)
	    {
	        int pi = partition(arr, low, high, ptr);
			//printf("primero\n");
			if(pi == -1){return ;}
	        quickSort(arr, low, pi - 1, ptr);
	        //printf("segundo\n");
	        quickSort(arr, pi + 1, high, ptr);
	    }
	}

void bubbleSort(int a[], int size, int* ptr)
{
    int i, j, n;
    int x = 1;
    n = size;
    for (i = n - 1; i > 0; i--)
    {
    	for (j = 0; j < i; j++)
    	{
    		*ptr += 1;

    		if (a[j] > a[j+1])
    		{
    			swap(&a[j], &a[j+1]);
    			x = 0;
    		}
    	}
    	//printArray(a, size);

    	if(x == 1){break;}
    }
}

void merge(int list[], int p, int q, int r, int* ptr)
{
	int list2[r + 1];
	int i,j,k;
	k = 0;
	i = p;
	j = q + 1;

	*ptr+=1;

	while(i <= q && j <= r)
	{
		//*ptr += 1;

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
		//*ptr += 1;
		list2[k++] = list[i++];
	}

	while(j <= r)
	{
		//*ptr += 1;
		list2[k++] = list[j++];
	}

	for(i = r; i >= p; i--)
	{
		//*ptr += 1;
		list[i] = list2[--k];
	}
}

void mergeSort(int list[], int p, int r, int* ptr)
{
	*ptr += 1;
	int q;
	if(p < r)
	{
		q = (p + r) / 2;
		mergeSort(list, p, q, ptr);
		mergeSort(list, q + 1, r, ptr);
		merge(list, p, q, r, ptr);
	}
}
