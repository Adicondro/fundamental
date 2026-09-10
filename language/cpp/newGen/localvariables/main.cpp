#include <iostream>

int getValueFromUser(int val){
  std::cout << "Enter a Value: ";
  std::cin >> val;
  return val;
}

int main()
{
  int x {};
  int num { getValueFromUser(x) };

  std::cout << "You Entered " << num << '\n';

  return 0;
}
