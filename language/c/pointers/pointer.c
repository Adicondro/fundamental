#include <stdio.h>

int main()
{
    int x = 4;
    int *my_ptr = &x;
    int **my_d_ptr = &my_ptr; // variable my_ptr akan di assign isi dari my_ptr -> 0x12839123

    int y = 2;
    int * my_ptr2 = &y;

    // printf("x=%d\n", x);
    printf("my_ptr=%p\n", my_ptr);
    printf("*mt_ptr=%d\n", *my_ptr);
    printf("Stage 2\n");
    printf("x=%d\n", x);
    printf("my_ptr=%p\n", my_ptr);
    printf("*mt_ptr=%d\n", *my_ptr);
    // Error
    printf("my_d_ptr=%p\n", my_d_ptr);
    printf("*my_d_ptr=%p\n", *my_d_ptr);
    printf("**my_d_ptr=%d\n", **my_d_ptr);

    // printf("my_ptr=%p\n", my_ptr2);
    printf("my_ptr=%p\n", my_ptr2);
    printf("my_ptr=%d\n", *my_ptr2);




    return 0;
}