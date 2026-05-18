#include <iostream>

using namespace std;

int main(int argc, char *argv[]) {
  int countdown = 3;

  while(countdown >= 0){
    cout << countdown << endl;
    countdown--;
  }

  cout << "Happy New Year" << endl;
  return 0;
}
