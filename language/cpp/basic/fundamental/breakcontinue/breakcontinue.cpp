#include <iostream>

using namespace std;

int main (int argc, char *argv[]) {
  
  for(int i = 0; i<5; i++){
    if(i == 2){
      continue;
    }
    cout << i << endl;
  }

  for(int j =0; j <5; j++){
    if(j == 2){
      break;
    }
    cout << j << endl;
  }

  int k = 0;
  while(k <= 10){
    cout << k << endl;
    k++;
    if(k == 5 ){
      cout << "Stop Here in 5" << endl;
      break;
    }
  }

  return 0;
}
