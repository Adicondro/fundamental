#include <iostream>

using namespace std;

int main(int argc, char *argv[]) {
  enum Level { LOW, MEDIUM, HIGH };
  // You can't change enums values

  // To access it you must create enum level myVar

  enum Level myVar = MEDIUM;

  // Print the enum variable
  cout << myVar;



  return 0;
}
