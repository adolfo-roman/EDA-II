#include <stdio.h>
#include <stdlib.h>

#include "aux.h"
#include "counting.h"
#include "radix.h"
#include "options.h"

#include "aux.c"
#include "counting.c"
#include "radix.c"
#include "options.c"

int main(void)
{
   int option;

    do
    {
        menu(&option);

        option == 1 ? optionOne():
        option == 2 ? optionTwo():
        option ;

    }
    while(option != 3);

    return 0;

}