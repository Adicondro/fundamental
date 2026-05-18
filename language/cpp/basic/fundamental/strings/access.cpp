#include <iostream>
#include <string>

using namespace std;

int main (int argc, char *argv[]) {
  string myString = "Hello";
  cout << myString[0] << endl; // H
  cout << myString[1] << endl; // e
  
  // Change String Characters
  myString[0] = 'J';
  cout << myString;



  return 0;
}
