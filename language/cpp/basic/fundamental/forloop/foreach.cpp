#include <iostream>
#include <string>


using namespace std;

int main (int argc, char *argv[]) {
  int myNumbers[5] = {10, 20, 30, 40, 50};

  for(int num : myNumbers){
    cout << num << endl;
  }

  string word = "Hello";

  for(char c : word){
    cout << c << endl;
  }

  
  return 0;
}
