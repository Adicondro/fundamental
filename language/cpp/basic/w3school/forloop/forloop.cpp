#include <iostream>

using namespace std;

int main (int argc, char *argv[]) {
  for(int i = 1; i <= 10; i++ ){
    cout << "iteration: " << i << endl;
  }

  for(int j = 0; j <= 10; j = j+2){
    cout << "Even Number: " << j << endl;
  }
  return 0;
}
