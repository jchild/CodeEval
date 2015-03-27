#include "stdafx.h"
#include <fstream>
#include <iostream>

/*

You are given 3 coins of value 1, 3 and 5. 
You are also given a total which you have to 
arrive at. Find the minimum number of coins 
to arrive at it.

*/



void coinCount(int number){
	int count = 0;
	int i = 0;
	while (i != number){
		if (i + 5 <= number)
			i += 5;
		else if (i + 3 <= number)
			i += 3;
		else if (i + 1 <= number)
			i += 1;
		count += 1;
	}
	std::cout << count << std::endl;
}
int main(int argc, char *argv[]){
	int number;
	std::ifstream file;
	file.open(argv[1]);
	while (!file.eof()){
		file >> number;
		coinCount(number);
	}
	file.close();
	getchar();
	return 0;
}
