#include <stdio.h>

int main()
{
    int arr[20] = {20,19,18,17,16,15,14,13,12,11,10,9,8,7,6,5,4,3,2,1};
    int* ptr = &arr[0];

    for(int i = 0; i < 20; i++)
    {
        printf("%d ", *(ptr + i));
    }
    printf("\n");
}