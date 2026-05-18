#include <iostream>

using namespace std;

void myFunction(){

  cout << "I just got executed";
}

int main (int argc, char *argv[]) {
  myFunction();
  myFunction();
  myFunction();
  return 0;
}
