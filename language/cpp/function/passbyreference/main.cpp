#include <iostream>
#include <string>

using namespace std;

int myFunction(int x);
int myFunction2(int& x);



int main (int argc, char *argv[]) {
  
  int firstNumber = 100;
  int secondNumber = 100;

  cout << "==Default Number" << endl;
  cout << &firstNumber << endl;
  cout << &secondNumber << endl;


  cout << "==Running Function==" << endl;
  cout << myFunction(firstNumber) << endl;
  cout << myFunction2(secondNumber) << endl;

  cout << "====Checking====" << endl;
  cout << firstNumber << endl;
  cout << secondNumber << endl;
  cout << &firstNumber << endl;
  cout << &secondNumber << endl;
  return 0;
}

int myFunction(int x){
  x = 50;
  return x;
}

int myFunction2(int& x){
  x = 50;
  return x;
}
