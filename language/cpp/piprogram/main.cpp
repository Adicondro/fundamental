#include <iostream>
#include <string>
#include <cmath>
using namespace std;

int main()
{

    // Circle area program

    // Variable declaration

    double radius;
    const double PI = 3.14;

    cout << "Enter the radius of the circle: ";
    cin >> radius;

    // Calculate the area of the circle

    double area = PI * pow(radius, 2);
    cout << "The area of the circle is: " << area << endl;

    return 0;
}
