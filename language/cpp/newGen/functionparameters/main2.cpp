#include <iostream>

int getValueFromUser(){

  std::cout << "Enter an Integer: ";
  int input{};
  std::cin >> input;

  return input;
}

// Tidak akan bisa karena num itu masuknya adalah variable external, sehingga diperlukan parameter

void printDouble(){
  std::cout << num << " doubled is: " << num * 2 << '\n';
}

int main()
{
  int num { getValueFromUser() };

  printDouble();

  return 0;
}



