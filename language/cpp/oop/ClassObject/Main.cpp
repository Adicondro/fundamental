#include <iostream>
#include <string>

using namespace std;

class Mahasiswa {

public:
  string name;
  string nim;
};

int main(int argc, char const *argv[]) 
{
  cout << "Test" << endl;

  Mahasiswa mahasiswa1;
  mahasiswa1.name = "Ucup";
  mahasiswa1.nim = "1301213152";

  Mahasiswa mahasiswa2;
  mahasiswa2.name = "Otong";
  mahasiswa2.nim = "1310121939";

  cout << "Nama anda adalah: " << mahasiswa1.name << endl;
  cout << "NIM anda adalah: " << mahasiswa1.nim << endl;

  cout << "Nama anda adalah: " << mahasiswa2.name << endl;
  cout << "NIM anda adalah: " << mahasiswa2.nim << endl;


  return 0;
}
