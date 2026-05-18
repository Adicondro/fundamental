#include <iostream>
#include <string>

using namespace std;

int main (int argc, char *argv[]) {
  
  string cars = "Mercedes";

  string* my_ptr = &cars;

  cout << "Storing " << my_ptr << " into pointers storage." << endl;
  cout << "My pointers in " << my_ptr << " is pointing at: " << *my_ptr << endl;


  // Modifying
  *my_ptr = "Mclaren";
  cout << "Now the value in what pointing at is " << *my_ptr << endl;
  cout << "With the same address as before -> " << my_ptr <<  endl;



  // Reference Modifying
  string bike = "Yamaha";
  string& my_ref = bike;
  cout << "my_ref: " << my_ref << endl;
  cout << "address: " << &my_ref << endl;

  my_ref = "Honda";
  cout << "my_ref: " << my_ref << endl;
  cout << "address: " << &my_ref << endl;



  return 0;
}
