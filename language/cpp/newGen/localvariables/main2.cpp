#include <iostream>

int getValueFromUser(){
  int val{};

  std::cout << "Enter a Value";
  std::cin >> val;
  return val;
}

int main (int argc, char *argv[]) {
  int num { getValueFromUser() };

  std::cout << "You entered " << num << '\n';
  return 0;
}
