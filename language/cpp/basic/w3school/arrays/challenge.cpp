#include <iostream>
using namespace std;

int main() {
  // 1) Declare an int array named numbers with 5 elements
  int numbers[5] = {1,2,3,4,5};

  // 2) Set numbers[0] to 10
  numbers[0] = 10;
  // 3) Set numbers[4] to 50
  numbers[4] = 50;

  // 4) Print numbers[0]
  cout << numbers[0];
  // 5) Print numbers[4]
  cout << numbers[4];

  return 0;
}
