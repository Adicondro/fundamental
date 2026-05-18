#include <iostream>

#include <string>

using namespace std;

int main (int argc, char *argv[]) {
  
  int numGuests;
  cout << "How many guests? ";
  cin >> numGuests;

  if(numGuests == 0){
    cout << "The guests must be more than 1";
    return 0;
  }

  string* guests = new string[numGuests];

  cin.ignore();

  for(int i = 0; i < numGuests; i++){
    cout << "Enter name for guest " << (i + 1) << endl;
    getline(cin, guests[i]);
  }

  // Show all guests
  cout << "\nGuests checked in:\n";
  for (int i = 0; i < numGuests; i++) {
    cout << guests[i] << "\n";
  }

  delete[] guests; // Clean up memory
  return 0;
}
