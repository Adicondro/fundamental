#include <iostream>

using namespace std;

int main (int argc, char *argv[]) {
  int* ptr = new int;
  *ptr = 35;
  cout << *ptr << endl;

  delete ptr;
  return 0;
}
