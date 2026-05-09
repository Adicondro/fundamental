#include <iostream>

using namespace std;

int main (int argc, char *argv[]) {
  for(int i=1; i<=3; i++){
    cout << "For Loop I: " << i << endl;
    for(int j=1; j<=2; j++){
      cout << "For Loop II: " << j << endl;
    }
  }


  for(int x=1; x<=3; x++){
    for(int y=1; y<=2; y++){
      cout << x*y << " "; // 1*1 1*2 2*1 ...
    }
    cout << "\n";
  }
  return 0;
}
