#include <iostream>

using namespace std;

int main()
{

    float a,b,hasil;
    char aritmetika;


    cout << "======Calculator Game======" << endl;
    cout << "Masukkan angka 1: ";
    cin >> a;
    cout << "Masukkan Aritmetika: ";
    cin >> aritmetika;
    cout << "Masukkan angka 2: ";
    cin >> b;

    cout << "Hasil Perhitungan: ";
    cout << a << aritmetika << b;

    if(aritmetika == '+'){
      hasil = a + b;
    }else if(aritmetika == '-'){
      hasil = a - b;
    }else if(aritmetika == '*'){
      hasil = a * b;
    }else if(aritmetika == '/'){
      hasil = a / b;
    }else{
      cout << "Operator anda salah" << endl;
    }

    cout << " = " << hasil << endl;


    cin.get();
    return 0;
}
