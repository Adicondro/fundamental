#include <iostream>


void doPrint(){
  std::cout << "In doPrint()\n";
}

void printValue(int x)
{
  std::cout << x << 'n';
}

int add(int x, int y){
  return x + y;
}

int main()
{
  doPrint();

  printValue(100);

  add(12, 12);
  
}
