#include <iostream>

using namespace std;

int main(int argc, char *argv[]) {
  int doorCode = 1337;

  if (doorCode == 1337) {
    cout << "Correct code.\nThe door is now open.\n";
  } else {
    cout << "Wrong code.\nThe door remains closed.\n";
  }

  int age = 20;
  bool isCitizen = true;

  if (age >= 18) {
    cout << "Old enough to vote.\n";

    if (isCitizen) {
      cout << "And you are a citizen, so you can vote!\n";
    } else {
      cout << "But you must be a citizen to vote.\n";
    }
  } else {
    cout << "Not old enough to vote.\n";
  }

  return 0;
}
