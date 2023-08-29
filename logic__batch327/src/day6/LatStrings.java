package day6;

import java.util.Arrays;

public class LatStrings {

	public static void main(String[] args) {
		string();
	}
	
	static void string() {
		String str = "HELLO";
		String str2 = "";
		String str3 = "Hllo";
		
		System.out.println("Panjang string " + str + ": " + str.length());
		
		//compare 
		int result = str.compareTo("HELLO");
		int res2 = "abc".compareTo("x");
		
		//charAt
		char chr = str.charAt(2);
		System.out.println(chr);
		
		// isEmpty string
		if(!str.isEmpty()) {
			System.out.println("true");
		}else {
			System.out.println("false");
		}
		
		// indexOf
		int index = str.indexOf('e');
		int otherIndx = str.lastIndexOf('L');
		int indexLagi = str.indexOf("LL");
		
		// Substring
		System.out.println(str.substring(1));
		System.out.println(str.substring(1,4));
		
		//trim
		String trimming = "Hello   ".trim();
		String trimming2= " nyoba sana sini".trim();
		
		System.out.println(trimming);
		System.out.println(trimming2);
		
		//replace
		String old = "tooth";
		String newStr = old.replace("o", "e"); // param lama ke param baru
		System.out.println(old);
		System.out.println(newStr);
		
		//split
		String strSplit = "Hello apa kabar?";
		String[] strArr = strSplit.split(" ");
		System.out.println(Arrays.toString(strArr));
		System.out.println(String.join("\t" , strArr));
		
		//toCharArray()
		String strToCharArray = "Hello";
		char[] arrChar = strToCharArray.toCharArray();
		for(char i : arrChar) {
			System.out.println(i);
		}
		
		//starsWith and endsWith
		String startWith = "Hello apa kabar";
		if(startWith.startsWith("Hello"))
			System.out.println("String dimulai dengan hello");
		
		String strSplit1 = "Hello apa kabar ?";
		String[] strArr1 = strSplit1.split(" ");
		
		String[] arrStr = {"1", "2", "3", "4"};
		int[] arrInt = new int[arrStr.length];
		for(int i = 0; i < arrStr.length; i++) {
			arrInt[i] = Integer.parseInt(arrStr[i]);
//			arrInt[i] = Integer.valueOf(arrStr[i]);
		}
		System.out.println(Arrays.toString(arrInt));
		
	}

}
