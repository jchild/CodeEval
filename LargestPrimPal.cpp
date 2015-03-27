#include "stdafx.h"
#include <iostream>
#include <stdio.h>
#include <math.h>
#include <stdlib.h>
#include <string>
#include <sstream>

/*

Write a program which determines the largest prime palindrome less than 1000.

*/

using namespace std;

string convertInt(int number){
	stringstream ss;
	ss << number;
	return ss.str();
}

bool isAPalindrome(int number){
	string Pal = convertInt(number);
	char Palcompair[5], temp[5];
	int PalPointer = Pal.length() - 1;
	for (int i = 0; i < Pal.length(); i++){
		Palcompair[i] = Pal[PalPointer];
		temp[i] = Pal[i];
		PalPointer--;
	}

	int compair = atoi(temp);
	int compairPal = atoi(Palcompair);

	if (compair == compairPal)
		return true;
	else
		return false;

}


bool isPrime(int number){
	if (number <= 1)
		return false;
	else if (number == 2)
		return true;
	else if (number % 2 == 0)
		return false;
	else{
		bool prime = true;
		int divisor = 3;
		double numberTemp = static_cast<double> (number);
		int upperLimit = static_cast<int> (sqrt(numberTemp) + 1);

		while (divisor <= upperLimit){
			if (number % divisor == 0)
				prime = false;
			divisor += 2;
		}
		return prime;

	}

}

int PrimePalindrome(int max){
	int largestPrimePal = 0;
	for (int i = 901; i <= max; i++){
		if (isPrime(i) && isAPalindrome(i)){
			largestPrimePal = i;
		}

	}
	return largestPrimePal;
}

int main(){
	int LargestPrimePalindrome = PrimePalindrome(1000);
	cout << LargestPrimePalindrome << endl;
	getchar();
	return 0;
}
