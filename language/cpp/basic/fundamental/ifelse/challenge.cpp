#include <iostream>

using namespace std;

int main (int argc, char *argv[]) {
    // Write age here

  int age;

  cout << "Enter Your Age: ";
  cin >> age;

  // Write an if statement that checks if age >= 18
  if(age >=18){
    cout << "Allowed" << endl;
  }else{
    cout << "Not Allowed" << endl;
  }
  // If true, print "Allowed" inside the if block
  // Write an else statement
  // Inside the else block, print "Not allowed"
  return 0;
}
