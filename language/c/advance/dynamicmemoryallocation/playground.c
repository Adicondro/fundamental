#include <stdio.h>

void myFunction(int c, int d);


int main(){
  int x = 4;
  int y = 7;
  myFunction(x, y);
}

void myFunction(int c, int d){
  printf("%d %d", c, d);
}
