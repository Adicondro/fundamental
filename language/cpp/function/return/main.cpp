#include <iostream>
#include <string>

using namespace std;

int myFunction();

  int main (int argc, char *argv[]) {
  
  cout << myFunction() << endl;

  return 0;
}

int myFunction(){
  return 1;
}
