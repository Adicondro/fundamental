#include <iostream>
#include <string>

using namespace std;

int main (int argc, char *argv[]) {
  // An array storing different ages
  int ages[8] = {20, 22, 18, 35, 48, 26, 87,70};

  // Rata rata = jumlah total / panjang total
  
  float avg, sum = 0;
  int length;

  // Finding array length
  length = sizeof(ages) / sizeof(ages[0]);

  for(int i; i < sizeof(ages) / sizeof(ages[0]); i++){
    int age = ages[i];
    cout << i << " : " << age << endl;
    sum = sum + age; // 0 + 20, 0 + 22
    cout << "Sum Status: " << sum << endl;
  }

  cout << "=====Total=====" << endl;
  cout << "Total Sum: " << sum << endl;
  cout << "Total Length: " << length << endl;

  avg = sum / length;

  cout << "The Average age is: " << avg << endl;

  return 0;
}
