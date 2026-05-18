#include <iostream>
#include <string>

using namespace std;

void display(string fname, int age);

int main (int argc, char *argv[]) {

  display("Me", 12);
  
  return 0;
}


void display(string fname, int age){
  cout << "Sorrowful Reunion is " << fname << " and " << age;
}
