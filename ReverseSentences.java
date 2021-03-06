/*

Write a program which reverses the words in an input sentence.

*/


import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;


public class ReverseSentences {
    public static void main (String[] args) throws IOException {
        File file = new File(args[0]);
        BufferedReader buffer = new BufferedReader(new FileReader(file));
        String line;
        while ((line = buffer.readLine()) != null) {
            line = line.trim();
            // Process line of input Here
			System.out.println( reverseLine(line) );

    	}
	}
	
	public static String reverseLine(String line){
		
		int begin = 0;
		int end = line.length();
		String newLine = " ";
		String newWord;
		for(int i = line.length()-1; i >= 0 ; i--){
			
			if(line.charAt(i) == ' '|| i==0){
				
				
				if(i!=0){
					begin = i+1;
				    newWord = line.substring(begin, end);
					newWord = newWord + " ";
					newLine = newLine + newWord;
					end = i;
					
				}
				else{
					begin = i;
					newWord = line.substring(begin, end);
					newLine = newLine + newWord;

				}
			}
			
		}
		return newLine.trim();
	}
}
