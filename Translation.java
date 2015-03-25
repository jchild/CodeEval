/*
 * created By Jonathan Child
 * Feb/12/2015
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
