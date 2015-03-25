/*
 * created By Jonathan Child
 * Feb/12/2015
 
 Your task is to write a program which determines (calculates) the percentage ratio of lowercase and uppercase letters.
 
 */

import java.io.*;
import java.util.*;


public class CapPercent {
	public static void main(String[] args) throws IOException {
		Scanner file = new Scanner(new FileReader(args[0]));
		while(file.hasNextLine()){
			 processLine(file.nextLine());			
		}
	}


	public static void processLine(String line){
	
		double lower = 0;
		double upper = 0;
		double totalLetters = 0;
	
		for(int i = 0; i< line.length(); i++){
		
			if(Character.isUpperCase(line.charAt(i))){
				upper += 1;
				totalLetters += 1;
			}
			else if (Character.isLowerCase(line.charAt(i))){
				lower += 1;
				totalLetters += 1;
			}
		
		}
		
		System.out.printf("lowercase: %.2f uppercase: %.2f\n", (lower/totalLetters)*100, (upper/totalLetters)*100);

	}
}
