#include <iostream>

using namespace std;

int main(int argc, char *argv[]) {

  int x = 10;
  x += 5; // same as x = x + 5
          //
  int y = 10;

  y += 5;            // same as x = x + 5
  cout << y << "\n"; // 15

  y *= 2;            // same as x = x * 2
  cout << y << "\n"; // 30

  return 0;
}
