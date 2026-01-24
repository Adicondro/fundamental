#include <stdio.h>
#include <stdbool.h>

int main(void)
{
    float gpa = 0.0f;
    char name[5] = "";
    int age = 2;
    char grade = '\0';

    printf("Enter your GPA: ");
    scanf("%f", &gpa);

    printf("Enter your Name: ");
    scanf("%4s", name);

    printf("Enter your Age: ");
    scanf("%d", &age);

    printf("Enter your Grade: ");
    scanf(" %c", &grade);

    printf("=========================\n");
    printf("Your GPA is: %f\n", gpa);
    printf("Your Name is: %s\n", name);
    printf("My Age is: %d\n", age);
    printf("Your Grade is: %c\n", grade);

    return 0;
}