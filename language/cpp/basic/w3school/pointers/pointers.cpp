#include <iostream>

using namespace std;

int main (int argc, char *argv[]) {
  


  int x = 4;

  int& rfr1 = x; // Take the value from x (also the Memory Address)

  int* ptr1 = &x; // Take the memory address from x
 
  cout << "Value: " << x << endl; // 4
  cout << "Memory Address of the value: " << &x << endl; // adr
  cout << "Storing Value (Pointers): " << ptr1 << endl; // Output: Address of X
  // Dereferencing (Accessing value with pointer)                                                       
  cout << "Using Pointers: " << *ptr1 << endl; // Pointing to this address -> What is inside of this address -> 4 Value

  return 0;
}
