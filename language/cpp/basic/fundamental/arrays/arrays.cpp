#include <iostream>
#include <string>

using namespace std;

int main (int argc, char *argv[]) {
  string cars[4];

  cars[0] = "Volvo";
  cars[1] = "Mercedes";
  cars[2] = "Mclaren";
  cars[3] = "BYD";

  cout << cars[1] << endl;

  cars[1] = "Honda";

  cout << cars[1] << endl;


  // Alternative
  string camera[4] = {"Sony FX3", "Sony A6400", "Sony A7ii", "Digicam"};
  return 0;
}
