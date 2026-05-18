#include <iostream>

#include <string>

using namespace std;

int main(int argc, char *argv[]) {
  string cars[] = {"Volvo", "BMW", "Ford"};   // Three array elements
  string cars2[3] = {"Volvo", "BMW", "Ford"}; // Also three array elements (Best)
  string cars3[5];
  cars3[0] = "Volvo";
  cars3[1] = "BMW";
  cars3[2] = "Ford";
  cars3[3] = "Mazda";
  cars3[4] = "Tesla";
  return 0;
}
