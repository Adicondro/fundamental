#include <iostream>
#include <string>

using namespace std;

int main(int argc, char *argv[]) {
  string drink = "Boost";
  string beverages = drink;

  cout << drink << endl;
  cout << beverages << endl;
  cout << &drink << endl;
  cout << &beverages << endl;

  string food = "Pizza";
  string &meal = food; // references to food -> take the food memory address

  cout << food << endl;
  cout << meal << endl;
  cout << &food << endl;
  cout << &meal << endl;

  cout << "========" << endl;
  meal = "Burger"; // Changing meal to burger means food is burger too.
  cout << food << endl;
  cout << meal << endl;
  cout << &food << endl; // But the address doesn't change
  cout << &meal << endl;

  // &meal = 0x123123;

  // sebenarnya awal menginisialisasi adalah string& meal -> meal dengan tipe data string&
  // &meal gabisa karena = &meal itu sama kaya operasi (rvalue)
  // int x = 5; -> legal
  // x + y = 10 -> Illegal, karena lvalue harusnya punya storage -> Operasi
  // dan &meal itu setara dengan x + y -> Operasi

  // Jadi belajar reference bukan belajar & nya, tapi belajar inisialisasi variable dengan tipe data reference
  // Agar bisa mengambil memory address yang dituju di assign ke variable lain

  
  return 0;
}
