/*
 * created By Jonathan Child
 * Feb/12/2015
 
 We have come up with the best possible language called Codel. To translate text into Codel, 
 we take any message and replace each English letter with another English letter. This mapping 
 is one-to-one and onto, which means that the same input letter always gets replaced with the 
 same output letter, and different input letters always get replaced with different output letters.
 A letter may be replaced by itself. Spaces are left as-is. 
 For example (and here is a hint!), our translation algorithm includes the following three mappings: 
 'b' -> 'n', 'j' -> 'u', and 'v' -> 'g' is based on the best possible replacement mapping, and we 
 will never change it. It will always be the same. In every test case. We will not tell you the rest 
 of our mapping because that would make the problem too easy, but there are a few examples below 
 that may help.
 
 */

import java.io.*;
import java.util.*;


public class Translation {
	static HashMap<Character, Character> decode = new HashMap<Character, Character>();
	
	public static void main(String args[]) throws IOException{
		populateMap();
		Scanner file = new Scanner(new FileReader(args[0]));
		while(file.hasNextLine()){
			 processLine(file.nextLine());			
		}	
	}
	
	public static void processLine(String line){
		char charArray[] =line.toCharArray();
		for(int i = 0; i < line.length();i++){
			charArray[i] = decode.get(charArray[i]);
		}
		System.out.println(charArray);
	}
	public static void populateMap(){
		decode.put('y','a');
		decode.put('n','b');
		decode.put('f','c');
		decode.put('i','d');
		decode.put('c','e');
		decode.put('w','f');
		decode.put('l','g');
		decode.put('b','h');
		decode.put('k','i');
		decode.put('u','j');
		decode.put('o','k');
		decode.put('m','l');
		decode.put('x','m');
		decode.put('s','n');
		decode.put('e','o');
		decode.put('v','p');
		decode.put('z','q');
		decode.put('p','r');
		decode.put('d','s');
		decode.put('r','t');
		decode.put('j','u');
		decode.put('g','v');
		decode.put('t','w');
		decode.put('h','x');
		decode.put('a','y');
		decode.put('q','z');
		decode.put(' ',' ');
	}

}
