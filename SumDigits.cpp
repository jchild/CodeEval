#include "stdafx.h"
#include <stdio.h>
#include <sstream>
#include <iostream>
#include <fstream>

/*

Given a positive integer, find the sum of its constituent digits.

*/


using namespace std;

int main(int argc, char *argv[]){
	int i;
	ifstream file;
	file.open(argv[1]);
	while (!file.eof()){
		int x = 0;
		file >> i;
		cout << "[" << i << "]";
		while (i){
			x += i % 10;
			i = i / 10;
		}
		cout << x << endl;
	}
	file.close();
	getchar();
	return 0;
}
