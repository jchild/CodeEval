/*
 * created By Jonathan Child
 * Feb/13/2015
 
Write a program which finds the first non-repeated character in a string.
 
 */

import java.io.*;
import java.util.*;
public class Matching {
	static ArrayList al = new ArrayList();
	public static void main(String[] args) throws IOException {
		Scanner file = new Scanner(new FileReader(args[0]));
		while(file.hasNextLine()){
			 processLine(file.nextLine());			
		}
	}	
	
	public static void processLine(String line){
		al.clear();
		boolean end = false;
		int x = 0;
		while(!end){
			if(!checkedBefore(line.charAt(x))){
				
				for (int y = x; y< line.length();y++){
					if(line.charAt(x) == line.charAt(y) && x !=  y){
						break;
					}
					if(line.charAt(x)!= line.charAt(y) && y+1 == line.length() ){
						System.out.println(line.charAt(x));
						end = true;
					}
					
				}
				
			}
			if(x+1 < line.length())
				x++;
			else{
				end = true;
				System.out.println(line.charAt(x));
			}
		}
		
	}
	
	public static boolean checkedBefore(char ch){
		
		
		boolean checked = false;
		
		if(al.contains(ch)){
			checked = true;
		}
		else{
			al.add(ch);
		}
		return checked;
	}
	
}
