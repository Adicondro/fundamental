#include <iostream>

using namespace std;

int main (int argc, char *argv[]) {
  bool isCodingFun = true;
  bool isFishTasty = false;

  cout << isCodingFun << "\n"; // False
  cout << isFishTasty << "\n";


  // if you prefer true and false not 1 and 0, use boolalpha

  bool isAdiFun = true;
  bool isEveryoneHappy = false;

  cout << boolalpha;

  cout << isAdiFun << endl;
  cout << isEveryoneHappy << endl;

  cout << noboolalpha; // reset to 1/0
  cout << isAdiFun;

  // if you want to go back use noboolalpha

  return 0;
}
