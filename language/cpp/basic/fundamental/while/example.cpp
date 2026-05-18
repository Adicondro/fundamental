#include <iostream>

using namespace std;


int main (int argc, char *argv[]) {
  int i = 0;

  while(i <= 10){
    cout << "Even Number: " << i << endl;
    i += 2;
  }

  int number = 12345;

  int revNumbers = 0;

  while(number){
    // Menaruh number ke revNumbers
    revNumbers = revNumbers * 10 + number % 10; // 0 * 10 + 12345 % 10 = 0 + 5 = 5
    // Mengurangi number                                                
    number /= 10; // 12345 / 10 = 1234
  }

  cout << "Reversed Numbers: " << revNumbers << endl;

  int dice = 1;

  while(dice <= 6){
    if(dice < 6){
      cout << "No Yatzy!" << endl;
    }else{
      cout << "Yatzy!" << endl;
    }
    dice++;
  }


  return 0;
}
