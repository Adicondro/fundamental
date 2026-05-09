#include <iostream>

using namespace std;

int main(int argc, char *argv[]) {
  int time = 20;

  bool isDay = time < 18;

  if (isDay) {
    cout << "Good day.";
  } else {
    cout << "Good evening.";
  }

  // Outputs "Good evening."
  return 0;
}
