#include <iostream>
#include <string>

using namespace std;

int main (int argc, char *argv[]) {
  string letter[2][4] = {
    {"A","B","C", "D"},
    {"X","Y","Z","S"}
  };

  string letter2[3][2][2] = {
    {
      {"A", "B"},
      {"C","D"}
    },
    {
      {"E", "F"},
      {"G", "H"}
    },
    {
      {"I", "J"},
      {"K", "L"}
    }
  };

  cout << letter2[2][0][0] << endl; // Must be I

  return 0;
}
