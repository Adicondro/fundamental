#include <iostream>

using namespace std;

void setToSeven(int v){
  v = 7;
}

void setToSevenPtr(int* v){
  *v = 7;
}


int main(int argc, char* argv[]){

  int x = 5;
  setToSeven(x);
  cout << x << endl; // Still 5
                     
  setToSevenPtr(&x);
  cout << x << endl; // Now its 7 for pointer



	return 0;
}
