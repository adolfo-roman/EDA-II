void printIntArr(int a[], int size)
{
    for(int j = 0; j < size; j++)
    {
        printf("%d ", a[j]);
    }
    printf("\n");
}

void printCharArr(char c[], int size)
{
    for(int j = 0; j < size; j++)
    {
        printf("%c ", c[j]);
    }
    printf("\n");
}

void charGet(char c[], int size)
{
    printf("Ingrese 20 caracteres: \n");

    char a;

    for(int i = 0; i < size; i++)
    {
        a = getchar();

        if(a == '\n')
        {
            a = getchar();
        }

        c[i] = a;
    }

    return ;
}

