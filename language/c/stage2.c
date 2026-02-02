#include <stdio.h>
#include <stdbool.h>

void happyBirthday(){
  printf("A");
  printf("B");
  printf("C");
  printf("D");
  printf("E");
}

int main(){

  happyBirthday();
  happyBirthday();
  happyBirthday();

  int num1 = 10;
  int i = 0;

  while(i < 10){
    i++;
    printf("\n%d\n", i);
  }

  printf("=======");

  for(int x = 0; x <= 10; x++){
    printf("%d", x);
  }

  return 0;

}
