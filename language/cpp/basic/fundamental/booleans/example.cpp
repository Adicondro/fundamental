#include <iostream>

using namespace std;

int main(int argc, char *argv[]) {
  int myAge = 25;
  int votingAge = 18;

  cout << (myAge >= votingAge); // return true

  if (myAge >= votingAge) {
    cout << "Old enough to vote";
  } else {
    cout << "Not old enough to vote";
  }
  return 0;
}
