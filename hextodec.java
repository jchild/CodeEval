/*
 * created By Jonathan Child
 * Dec/11/2014
 
 You will be given a hexadecimal (base 16) number. Convert it into decimal (base 10).
 
 */

import java.io.*;
import java.util.*;

public class hextodec {
	public static void main(String[] args) throws IOException {
		Scanner file = new Scanner(new FileReader(args[0]));
		while(file.hasNextLine()){
			System.out.println( processLine(file.nextLine()) );			
		}
	}
	
	//calculates the decimal value
	public static int processLine(String line){
		double sum = 0;
		int stringlength = line.length();
		int power = stringlength - 1;
		int value = 0;
		for (int i =0; i < stringlength; i++){
			
			//checks if the character is a numeric value
			if(!Character.isDigit(line.charAt(i))){
				value = CharToDigit(line.charAt(i));
			}
			
			//if character is numeric, converts character to integer
			else {
				value = Character.digit(line.charAt(i),10);
			}
			if (value == -1){
				sum = -1;
				break;
			}
			
			sum += value * Math.pow(16, power);
			power--;
			
		}
		
		return (int) Math.floor(sum);
	}
	//changes the non numeric characters to integers
	public static int CharToDigit(char LineChar){
		if (LineChar == 'A' || LineChar == 'a')
			return 10;
		else if (LineChar == 'B'|| LineChar == 'b')
			return 11;
		else if (LineChar == 'C'|| LineChar == 'c')
			return 12;
		else if (LineChar == 'D'|| LineChar == 'd')
			return 13;
		else if (LineChar == 'E'|| LineChar == 'e')
			return 14;
		else if (LineChar == 'F'|| LineChar == 'f')
			return 15;
		else
			return -1;
		/*switch (LineChar) {
		case 'A': case 'a':
			return 10;
		case 'B': case 'b':
			return 11;
		case 'C': case 'c':
			return 12;
		case 'D': case 'd':
			return 13;
		case 'E': case 'e' :
			return 14;
		case 'F': case 'f':
			return 15;
		
		default:
			break;
	}*/
		
		
	}

}
