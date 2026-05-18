#include <iostream>
#include <string>

using namespace std;

int main (int argc, char *argv[]) {
  string firstName = "John ";
  string lastName = "Doe";


  string fullName = firstName.append(lastName);

  cout << fullName << endl;
  return 0;
}
