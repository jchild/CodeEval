#include "stdafx.h"
#include <stdio.h>
#include <stdlib.h>
#include <iostream>
#include <fstream>
#include <string>

/*

You are given several strings that may/may not be valid 
emails. You should write a regular expression that determines 
if the email id is a valid email id or not. You may assume 
all characters are from the English language.

*/


using namespace std;
bool validEmail(string email){
	bool at = false;
	bool ret = false;
	int quote = 0;
	if (email.find_first_not_of("abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ01234567890_-@.!#$%&()+=?\"") != string::npos)
	{
		return false;
	}
	cout << "[" << email[0] << "] ";
	for (int i = 0; i <= email.length(); i++){
		if (email[i] == '.' && i == 0 || email[i] == '@' && i == 0 || email[i] == '.' && email[i + 1] == '.' || at == true && email[i] == '@' || i != 0 && email[i] == '\"' && quote != 1)
			return false;

		if (email[i] == '\"')
			quote += 1;
		if (email[i] == '@' && email[i - 1] != '.' && quote != 1){
			at = true;
		}
		if (at == true){
			if (email[i] == '.' && email[i - 1] != '@' || email[i + 1] != NULL){
				ret = true;
			}

		}
	}
	return ret;

}

int main(int argc, char *argv[]){
	string email;
	//ifstream file("myfile.txt");
	ifstream file;
	file.open(argv[1]);
	while (!file.eof())
	{
		getline(file, email);
		if (email.length() == 0)
			continue;
		else{
			cout << "( " << email << " ) ";
			if (validEmail(email) == true)
				cout << "true" << endl;
			else
				cout << "false" << endl;
		}
	}
	file.close();
	getchar();
	return 0;
}
