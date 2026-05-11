#include <iostream>

using namespace std;

enum Level { LOW = 25, MEDIUM, HIGH = 35 };

int main(int argc, char *argv[]) {

  enum Level level1 = MEDIUM;
  enum Level level2 = HIGH;
  enum Level level3 = LOW;
  cout << level1 << endl;
  cout << level2 << endl;
  cout << level3 << endl;

  return 0;
}
