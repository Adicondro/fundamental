#include <iostream>
#include <string>

using namespace std;

class Mahasiswa{
  public:
    string name;
    string nim;
    string jurusan;
    double IPK;

    Mahasiswa(string name, string nim, string jurusan, double IPK){
      Mahasiswa::name = name;
      Mahasiswa::nim = nim;
      Mahasiswa::jurusan = jurusan;
      Mahasiswa::IPK = IPK;
    }
};

int main (int argc, char const *argv[]) {

  Mahasiswa mahasiswa1 = Mahasiswa("Ucup", "1301213152", "Informatika", 3.23);

  cout << "Nama: " << mahasiswa1.name << endl;
  cout << "NIM: " << mahasiswa1.nim << endl;
  cout << "Jurusan: " << mahasiswa1.jurusan << endl;
  cout << "IPK: " << mahasiswa1.IPK << endl;
  
  Mahasiswa mahasiswa2 = Mahasiswa("Otong", "1301211132", "Informatika", 3.19);

  cout << "Nama: " << mahasiswa2.name << endl;
  cout << "NIM: " << mahasiswa2.nim << endl;
  cout << "Jurusan: " << mahasiswa2.jurusan << endl;
  cout << "IPK: " << mahasiswa2.IPK << endl;
  return 0;
}
