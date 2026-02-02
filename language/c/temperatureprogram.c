#include <stdio.h>

int main() {

  char choice = '\0';
  float fahrenheit = 0.0f;
  float celcius = 0.0f;

  printf("Temperature Conversion Program\n");
  printf("C. Celcius to Fahrenheit\n");
  printf("F. Fahrenheit to Celcius\n");
  printf("Is the temp in Celcius (C) or Fahrenheit (F)?: ");
  scanf("%c", &choice);

  if (choice == 'C') {
    printf("Enter the temperature in Celcius: ");
    scanf("%f", &celcius);
    fahrenheit = (celcius * 9/5) + 32;
    printf("%.1f Celcius is equal to %.1f Fahrenheit", celcius, fahrenheit);
  } else if (choice == 'F') {
    printf("Enter the temperature in Fahrenheit: ");
    scanf("%f", &fahrenheit);
    celcius = (fahrenheit - 32) * 5/9;
    printf("%.1f Fahrenheit is equal to %.1f Celcius", fahrenheit, celcius);
  } else {
    printf("Invalid choice! Please select C of F\n");
  }

  return 0;
}
