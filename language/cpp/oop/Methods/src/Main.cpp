#include <iostream>
#include <string>

using namespace std;

class Mahasiswa{
  public:
    string name;
    string nim;
    string jurusan;
    double ipk;

  Mahasiswa(string name, string nim, string jurusan, double ipk){
    Mahasiswa::name = name;
    Mahasiswa::nim = nim;
    Mahasiswa::jurusan = jurusan;
    Mahasiswa::ipk = ipk;
  }

  // Function tanpa parameter, tanpa return

  void display(){
    cout<< "Nama: " << name << endl;
    cout<< "NIM: " << nim << endl;
    cout<< "Jurusan: " << jurusan << endl;
    cout<< "IPK: " << ipk << endl;
  }
  
  // Function dengan parameter, tanpa return
  void setName(const char* name){ // Bisa pakai string bisa pakai const char* name
    Mahasiswa::name = name;
  }


  // Function tanpa parameter, dengan return

  string getName(){
    return Mahasiswa::name;
  }

  double getIPK(){
    return Mahasiswa::ipk;
  }
  
  // Function dengan parameter, dengan return
  double katrolIPK(const double &tambahannilai){
    return Mahasiswa::ipk + tambahannilai;
  }


};


int main (int argc, char const *argv[]) {


  Mahasiswa mahasiswa1 = Mahasiswa("Ucup", "1301213152", "Hukum", 3.23);

  mahasiswa1.display();
  mahasiswa1.setName("Adicondro");
  mahasiswa1.display();

  mahasiswa1.getName();

  string dataNama = mahasiswa1.getName();

  cout << "dataNama: " << dataNama << endl;
  cout << "dataIPK: " << mahasiswa1.getIPK() << endl;
  
  return 0;
}

