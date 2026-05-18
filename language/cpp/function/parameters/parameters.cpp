#include <iostream>
#include <string>

using namespace std;

void myFunction(string fname);

int main (int argc, char *argv[]) {
  
  myFunction("Adicondro");
  return 0;
}

void myFunction(string fname){

  cout << fname << endl;
}
