#include <iostream>

#include "TutorialConfig.h"

// #include "MathFunctions.h"
#ifdef USE_MYMATH
#include "MathFunctions.h"
#endif



int main(int argc, char* argv[])
{
    if (argc < 2) {
    // report version
    std::cout << argv[0] << " Version " << Tutorial_VERSION_MAJOR << "."
              << Tutorial_VERSION_MINOR << std::endl;
    std::cout << "Usage: " << argv[0] << " number" << std::endl;
    return 1;
  }

    // MathFunctions mf;
    int inputValue = std::atoi(argv[1]);
    // int v = mf.Square(inputValue);

    #ifdef USE_MYMATH
      MathFunctions mf;    
      int v = mf.Square(inputValue);
      // const double outputValue = mysqrt(inputValue);
      std::cout << "Square of " << inputValue << " via MathFunctions : " << v << std::endl;
    #else
      // const double outputValue = sqrt(inputValue);
      int v = inputValue * inputValue;
      std::cout << "Square of " << inputValue << " without MathFunctions : " << v << std::endl;
    #endif

    // std::cout << "Square of " << inputValue << " : " << v << std::endl;
    return 0;

}