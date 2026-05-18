#include <iostream>
#include <string>

using namespace std;



int main (int argc, char *argv[]) {
  string cars[] = {"Mercedes", "Mclaren", "Ford"};

  // 1. Dengan index
  for(int i = 0; i < 3; i++){
    cout << i << " : " << cars[i] << endl;
  }

  cout << "=========" << endl;

  // 2. For Each
  for(string i : cars){
    cout << i << endl;
  }
  return 0;
}
