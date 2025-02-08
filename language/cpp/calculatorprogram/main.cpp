#include <iostream>

using namespace std;

int main()
{

    // Variable declaration

    float value1, value2, hasil;
    char aritmatika;

    cout << "Selamat data di program kalkulator \n\n";

    // Memasukkan input dari user

    cout << "Masukkan angka pertama: ";
    cin >> value1;
    cout << "Pilih operator +, -, *, atau /: ";
    cin >> aritmatika;
    cout << "Masukkan nilai kedua : ";
    cin >> value2;

    cout << "\nHasil perhitungan: ";

    cout << value1 << aritmatika << value2;

    // if (aritmatika == '+')
    // {
    //     hasil = value1 + value2;
    // }
    // else if (aritmatika == '-')
    // {
    //     hasil = value1 - value2;
    // }
    // else if (aritmatika == '*')
    // {
    //     hasil = value1 * value2;
    // }
    // else if (aritmatika == '/')
    // {
    //     hasil = value1 / value2;
    // }
    // else
    // {
    //     cout << "Operator yang anda masukkan salah" << endl;
    // }

    switch (aritmatika)
    {
    case '+':
        hasil = value1 + value2;
        break;
    case '-':
        hasil = value1 - value2;
        break;
    case '*':
        hasil = value1 * value2;
        break;
    case '/':
        hasil = value1 / value2;
        break;
    default:
        cout << "Operator yang anda masukkan salah" << endl;
        break;
    }

    cout << " = " << hasil << endl;

    cin.get();
    return 0;
}