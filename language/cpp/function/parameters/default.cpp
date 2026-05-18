#include <iostream>
#include <string>

using namespace std;

void myFunction(string country = "Norway");

int main (int argc, char *argv[]) {
  
  myFunction();
  myFunction("Italy");

  return 0;
}

void myFunction(string country){
  cout << country << endl;
}
