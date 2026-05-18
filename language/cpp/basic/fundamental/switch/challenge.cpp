#include <iostream>

using namespace std;

int main (int argc, char *argv[]) {
  int choice;

  cout << "Enter your choice 1 or 2: ";
  cin >> choice;

  switch(choice){
    case 1:
      cout << "You ordered coffee" << endl;
      break;
    case 2:
      cout << "You ordered water" << endl;
      break;
    default:
      cout << "Wrong number" << endl;

  }


  return 0;
}
