#include <iostream>

using namespace std;

int main(int argc, char *argv[]) {
  int time = 22;
  string message = (time < 12)   ? "Good morning."
                   : (time < 18) ? "Good afternoon."
                                 : "Good evening.";
  cout << message;
  return 0;
}
