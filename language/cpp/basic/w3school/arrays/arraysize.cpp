#include <iostream>

#include <string>

using namespace std;

int main (int argc, char *argv[]) {
  int myNumbers[5] = {1,2,3,4,5};
  cout << sizeof(myNumbers) << endl;
  int getArrayLength = sizeof(myNumbers) / sizeof(myNumbers[0]); // 20 / 4 = 5, berarti ada 5 elemen di dalam array
  cout << getArrayLength << endl;                                                           




  // Asal mula for each
  int myNumbers2[5] = {5,4,3,2,1};

  for(int i = 0; i < sizeof(myNumbers2) / sizeof(myNumbers2[0]); i++){  // 20 / 4 = 5 -> i < 5 
    int num = myNumbers[i];
    cout << num << endl;
  }

  // Mencoba String
  string cars[4] = {"Volvo", "Mercedes", "Aston Martin", "Ferrari"}; 
  cout << sizeof(cars) << endl;
  int getArrayLength2 = sizeof(cars) / sizeof(cars[0]); // 96 / 24 = 4 elemen array, 1 elemen = 24
  cout << getArrayLength2 << endl;

  for(int i = 0; i < sizeof(cars) / sizeof(cars[0]); i++){
    string car = cars[i];
    cout << car << endl;
  }

  



  return 0;
}
