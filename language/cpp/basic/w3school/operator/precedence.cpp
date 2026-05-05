#include <iostream>

using namespace std;

int main(int argc, char *argv[]) {
  int result1 = 10 - 2 + 5;   // (10 - 2) + 5 = 13
  int result2 = 10 - (2 + 5); // 10 - 7 = 3

  cout << result1 << "\n";
  cout << result2 << "\n";
  return 0;
}
