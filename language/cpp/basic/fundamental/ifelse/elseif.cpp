#include <iostream>

using namespace std;

int main(int argc, char *argv[]) {

  int time = 16;

  bool isMorning = time < 12;
  bool isDay = time < 18;

  if (isMorning) {
    cout << "Good morning.";
  } else if (isDay) {
    cout << "Good day.";
  } else {
    cout << "Good evening.";
  }
  return 0;
}
