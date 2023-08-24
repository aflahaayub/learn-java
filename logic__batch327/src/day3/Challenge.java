package day3;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Scanner;

public class Challenge {

	public static void main(String[] args) {
		challenge1();
//		challenge2();
	}
	

	static void challenge1() {
		Scanner input = new Scanner(System.in);
		
		// only include the first and the last character, the rest is *
		System.out.println("Insert a text with a space between: ");
		String text = input.nextLine();
		String[] splitTxt = text.split(" ");
		
		String storeStr = "";
		
		for(int i = 0; i<splitTxt.length; i++) { //"Aku Sayang Kamu" in splitTxt[1] will return Sayang
			for(int j=0; j<splitTxt[i].length(); j++) {
				
				if(j!=0 && j != (splitTxt[i].length()-1)){ // length() bcs the splitTxt[i] will return a String. So basically it's asking for a length of a String
					storeStr += "*";
				}else {
					storeStr += splitTxt[i].charAt(j); // Aku.charAt(1) = k
				}
				
			}
			storeStr += " "; // adding a space between string. It is also good for performance because if we use System.out inside the loop, it will printing each time
		}
		
		System.out.print(storeStr);
	}
	
	static void challenge2() {
		Scanner input = new Scanner(System.in);
		// Change the first and the last char into *
		System.out.println("Insert a text with a space: ");
		String text = input.nextLine();
		String[] splitTxt = text.split(" ");
		String storeStr = "";
		
		for(int i = 0; i<splitTxt.length; i++) {
			for(int j=0; j<splitTxt[i].length(); j++) {
				if(j!=0 && j != (splitTxt[i].length()-1)){
					storeStr += splitTxt[i].charAt(j);
				}else {
					storeStr += "*";
				}
			}
			storeStr += " ";
		}
		System.out.print(storeStr);
	}
}
