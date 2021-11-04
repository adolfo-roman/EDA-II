void radixSort(int arr[], int size)
{
    int last = 4;

    do
    {
        int* arrOne = (int*) malloc(sizeof(int));
        int* arrTwo = (int*) malloc(sizeof(int));
        int* arrThree = (int*) malloc(sizeof(int));
        int* arrFour = (int*) malloc(sizeof(int));

        int one = 0, two = 0, three = 0, four = 0, digit = 0;

        for(int i = 0; i < size; i++)
        {
            switch(last)
            {
                case 1:
                    digit = (int) arr[i] / 1000;
                    break;
                case 2:
                    digit = arr[i] % 1000;
                    digit = (int) digit / 100;
                    break;
                case 3:
                    digit = arr[i] % 100;
                    digit = (int) digit / 10;
                    break;
                case 4:
                    digit = arr[i] % 10;
                    break;
            }

            switch(digit)
            {
                case 1:
                    one++;
                    arrOne = (int*) realloc(arrOne, sizeof(int) * one);
                    arrOne[one - 1] = arr[i];
                    break;
                case 2:
                    two++;
                    arrTwo = (int*) realloc(arrTwo, sizeof(int) * two);
                    arrTwo[two - 1] = arr[i];
                    break;
                case 3:
                    three++;
                    arrThree = (int*) realloc(arrThree, sizeof(int) * three);
                    arrThree[three - 1] = arr[i];
                    break;
                case 4:
                    four++;
                    arrFour = (int*) realloc(arrFour, sizeof(int) * four);
                    arrFour[four - 1] = arr[i];
                    break;
            }
        }

        for(int i = 0; i < one; i++)
        {
            arr[i] = arrOne[i];
        }

        for(int i = one; i < two + one; i++)
        {
            arr[i] = arrTwo[i - one];
        }

        for(int i = two + one; i < three + two + one; i++)
        {
            arr[i] = arrThree[i - (one + two)];
        }

        for(int i = three + two + one; i < four + three + two + one; i++)
        {
            arr[i] = arrFour[i - (one + two + three)];
        }

        last--;

        free(arrOne);
        free(arrTwo);
        free(arrThree);
        free(arrFour);

        printIntArr(arr, size);
    }
    while(last != 0);

    printf("\n");

    return;
}