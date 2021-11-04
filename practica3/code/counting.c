void findMax(char a[], int* r, int size)
{
    int max = (int) a[0];
    int min = max;

    for(int i = 0; i < size - 1; i++)
    {
        int b = (int) a[i + 1];

        if(max < b)
        {
            max = b;
        }

        if(min > b)
        {
            min = b;
        }
    }

    *r = (max - min) + 1;
    *(r + 1) = min;

    return ;
}

void fillZeros(int* a, int size)
{
    for(int i = 0; i < size; i++)
    {
        *(a + i) = 0;
    }

    return;
}

void restore(int* a, char b[], char c, int min)
{
    int elem, index;

    elem = ((int) c) - min;
    index = *(a + elem) - 1;
    b[index] = c;
    *(a + elem) -= 1;
}


void countingSort(char a[], int size, char b[])
{
    int r[2];
    int elem;

    findMax(a, r, size);

    int max = r[0], min = r[1];

    //printf("max %d min %d\n", max, min);

    int count[max];

    fillZeros(count, max);

    //printIntArr(count, max);

    for(int j = 0; j < size; j++)
    {
        elem = (int) a[j];
        //printf("char %c ascii %d index %d\n", a[j], (int) a[j], elem - min);
        count[elem - min]++;
    }

    printIntArr(count, max);

    for(int i = 1; i < max; i++)
    {
       count[i] = count[i] + count[i - 1];
    }

    printIntArr(count, max);

    for(int j = size - 1; j >= 0; j--)
    {
        restore(count, b, a[j], min);
    }

    return ;
}