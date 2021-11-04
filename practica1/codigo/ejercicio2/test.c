#include <stdio.h>
#include <math.h>

#include "ordenamientos.h"
#include "ordenamientos.c"
#include "utilidades.h"
#include "utilidades.c"

int main()
{
    int arr[] = {10,9,8,7,6,5,4,3,2,1};

    int length = (int) sizeof(arr)/sizeof(int);

    int x = (int)log2(length);

    int s = pow(2,x + 1) - 1;

    int s2 = 0;

    int count = 0;

    int times = 0;

    for(int i = 0; i < x + 1; i++)
    {

        times++;

        for(int j = 0; j < s + 1; j++)
        {

            times++;

            if(j < s)
            {
                printf(" ");

            }
            else
            {
                printf("%d", arr[count]);
                //times++;
                count++;
                //times++;
            }
        }

        for(int k = 0; k < pow(2,i)-1; k++)
        {
            times++;

            for(int l = 0; l < s2 + 1; l++)
            {
                times++;

                if(l < s2)
                {
                    printf(" ");
                    //times++;
                }
                else
                {
                    if(count < length)
                    {
                        printf("%d", arr[count]);
                        //times++;
                        count++;
                        //times++;
                    }
                    else
                    {
                        printf(" ");
                        //times++;
                    }

                }
            }
        }

        printf("\n");
        //times++;
        s2 = s;
        //times++;
        s = (s - 1)/2;
        //times++;



    }

    //printf("%d\n", times);

    return 0;
}

