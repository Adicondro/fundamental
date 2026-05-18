#include <iostream>
#include <string>

using namespace std;

int main(int argc, char *argv[]) {

  string cars = "Mercedes";

  cout << "====Regular====" << endl;
  cout << cars << endl;
  cout << &cars << "\n" << endl;

  cars = "Mclaren";
  cout << cars << endl;
  cout << &cars << "\n" << endl;

  cout << "Problem:" << endl;
  string cars2 = cars;
  cout << cars << endl;
  cout << &cars << endl;
  cout << cars2 << endl;
  cout << "After changing" << endl;
  cout << &cars << endl;
  cout << &cars2 << "\n" << endl; // The address is different
  
  // Solution 1:  cars = "Mclaren"; but can't manipulate cars variable in cars2
  // Solution 2:  use reference (+1 variable)
  // Solution 3: use pointer (memory to pointer storage)





  return 0;
}
