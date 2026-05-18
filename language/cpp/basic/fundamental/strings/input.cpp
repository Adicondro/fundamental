#include <iostream>
#include <string>

int main(int argc, char *argv[]) {
  std::string firstName;

  std::cout << "Type your first name: ";
  std::cin >> firstName; // Cin detects whitespace, tabs, etc as a terminating
                         // character example: John Doe -> John
  std::cout << "Your name is: " << firstName << std::endl;

  // Solution
  // Add this if multi input
  std::cin.ignore(std::numeric_limits<std::streamsize>::max(), '\n');


  std::string fullName2;
  std::cout << "Type your full name: ";
  std::getline(std::cin, fullName2);
  std::cout << "Your name is: " << fullName2 << std::endl;

  return 0;
}
