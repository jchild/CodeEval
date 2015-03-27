#include "stdafx.h"
#include <iostream>
#include <fstream>
#include<stdio.h>

/*

Players generally sit in a circle. The first player says the number “1”, 
and each player says next number in turn. However, any number divisible 
by X (for example, three) is replaced by the word fizz, and any divisible 
by Y (for example, five) by the word buzz. Numbers divisible by both 
become fizz buzz. A player who hesitates, or makes a mistake is 
eliminated from the game.

Write a program that prints out the final series of numbers where those 
divisible by X, Y and both are replaced by “F” for fizz, “B” for buzz and 
“FB” for fizz buzz.

*/


using namespace std;

void FizzBuzz(int divOne, int divTwo, int maxNumber){
  for (int i = 1; i <= maxNumber; i++){
    if (i % divOne == 0 && i % divTwo == 0)
      cout << "FB";
    else if (i % divOne == 0)
      cout << "F";
    else if (i % divTwo == 0)
      cout << "B";
    else
      cout << i;
    if (i != maxNumber)
      cout << " ";
  }
  cout << endl;
}
int main(int argc, char *argv[]){
  int divOne = 0, divTwo = 0 ,maxNumber = 0;
  ifstream file("myfile.txt");
  //ifstream file;
  //file.open(argv[1]);
  while (!file.eof())
  {
    file >> divOne >> divTwo >> maxNumber;
    FizzBuzz(divOne, divTwo, maxNumber);
  }
  file.close();
  getchar();
  return 0;
}
