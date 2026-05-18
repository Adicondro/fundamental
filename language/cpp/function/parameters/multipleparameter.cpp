#include <iostream>

using namespace std;

void myFunction(string fname, int age);

int main(int argc, char *argv[]) {

  myFunction("Liam", 3);
  myFunction("Jenny", 14);
  myFunction("Anja", 30);

  return 0;
}

void myFunction(string fname, int age) {
  cout << fname << " Refsnes. " << age << " years old. \n";
}
