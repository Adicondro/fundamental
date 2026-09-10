#include <iostream>

void returnNothing()
{
}

int returnFive()
{
  return 5;
}

int main()
{
  returnNothing();
  returnFive();

  std::cout << returnFive();
  std::cout << returnNothing();

  return 0;
}
