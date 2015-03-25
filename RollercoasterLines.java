import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;


public class RollercoasterLines {
	public static void main(String[] args) throws IOException {
		Scanner file = new Scanner(new FileReader(args[0]));
		while(file.hasNextLine()){
			System.out.println( processLine(file.nextLine()) );			
		}
	}
	
	public static String processLine(String line){
		boolean isUpper = true;
		char newLine [] = line.toCharArray();
		for(int i = 0; i < line.length(); i++){
		
			if (isUpper == true){
				if (Character.isLetter(line.charAt(i))){
					newLine[i] = Character.toUpperCase(line.charAt(i));
					isUpper = false;
				}
			}
			else {
				if(Character.isLetter(line.charAt(i))){
					newLine[i] = line.charAt(i);
					isUpper = true;
				}
			}
		}
		
		return String.valueOf(newLine);
		
	}
}
