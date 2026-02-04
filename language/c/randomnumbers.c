#include <stdio.h>
#include <stdlib.h>
#include <time.h>

int main()
{

  srand(time(NULL));

  int min = 1;
  int max = 6;

  int randomNum = (rand() % max) + min;


  printf("%d", randomNum);

  return 0;
}
