#include <stdio.h>

int my_add(int a, int b);
int my_subtract(int a, int b);

int main()
{
    printf("1+1=%d\n", my_add(1,1));
    printf("1-1=%d\n", my_subtract(1,1));
    return 0;
}