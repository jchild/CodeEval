
//Write a program to determine the sum of the first 1000 prime numbers.
//3682913
#include "stdafx.h"
#include <iostream>
#include <stdio.h>
#include <math.h>
#include <stdlib.h>

using namespace std;


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

int calcSum(int max){
	int primeSum = 0;
	int counter = 0;
	for (int i = 1; i <= max; i++)
	{
		if (isPrime(i)&&counter<1000){
			primeSum += i;
			counter++;
		}

	}
	return primeSum;
}


int main(){

	int sum = calcSum(100000);

	cout << sum;

	getchar();
	return 0;
} 
