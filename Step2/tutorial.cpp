#include <iostream>

#include "MathFunctions.h"
#include "TutorialConfig.h"

int main(int argc, char* argv[])
{
    if (argc < 2) {
    // report version
    std::cout << argv[0] << " Version " << Tutorial_VERSION_MAJOR << "."
              << Tutorial_VERSION_MINOR << std::endl;
    std::cout << "Usage: " << argv[0] << " number" << std::endl;
    return 1;
  }

    MathFunctions mf;
    int inputValue = std::atoi(argv[1]);
    int v = mf.Square(inputValue);

    std::cout << "Square of " << inputValue << " : " << v << std::endl;
    return 0;

}