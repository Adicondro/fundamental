#include <iostream>

using namespace std;

int main(int argc, char *argv[]) {
  int x = 15;
  int y = 25;

  if (x > 10) {
    cout << "x is greater than 10\n";

    // Nested if
    if (y > 20) {
      cout << "y is also greater than 20\n";
    }
  }
  return 0;
}
