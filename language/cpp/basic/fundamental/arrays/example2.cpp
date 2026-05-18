#include <iostream>

using namespace std;

int main (int argc, char *argv[]) {
  int ages[8] = {20, 22, 18, 35, 48, 26, 87, 70};

  int lowestAge = ages[0];

  for(int i; i < sizeof(ages) / sizeof(ages[0]); i++){
    int age = ages[i];
    if(lowestAge > age){
      lowestAge = age;
    }
  }

  // Kunci, kalau mau store 1 index untuk dilanjutin index berikutnya -> store di variable baru

  cout << "The lowest age is: " << lowestAge << endl;
  return 0;
}
