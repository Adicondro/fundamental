#include <iostream>
#include <string>
using namespace std;

int main()
{
    // String
    string myString = "Hello, World!";
    cout << "String: " << myString << endl;

    // Integer variable
    int myInt = 10;
    cout << "Integer: " << myInt << endl;

    // Floating point variable
    float myFloat = 3.14f;
    cout << "Float: " << myFloat << endl;

    // Double precision floating point variable
    double myDouble = 2.718281828459;
    cout << "Double: " << myDouble << endl;

    // Character variable
    char myChar = 'A';
    cout << "Character: " << myChar << endl;

    // Boolean variable
    bool myBool = true;
    cout << "Boolean: " << boolalpha << myBool << endl;

    // Input Output
    int umur;
    cout << "Masukkan umur anda: ";
    cin >> umur;

    cout << "Umur anda adalah: " << umur << endl;

    return 0;
}