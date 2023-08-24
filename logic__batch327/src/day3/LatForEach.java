package day3;

import java.util.Arrays;

public class LatForEach {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = {1,2,3,4,5};
		
		for(int item : arr) {
			System.out.println(item);
		}
		
		char[] arrChar = {'A', 'B', 'C', 'D', 'E'};
		for(char character : arrChar) {
			System.out.print(character + "\t");
		}
		System.out.println();
		
		String kalimat = "Saya adalah mahasiswa";
		String[] arrKata = kalimat.split(" ");
//		System.out.println(Arrays.toString(arrKata));
		for(String kata : arrKata) {
			System.out.println(kata);
		}
		
		String kata = "saya";
		char[] arrayKata = kata.toCharArray();
//		System.out.println(Arrays.toString(arrayKata));
		for(char k : arrayKata) {
			System.out.print(k + " , ");
		}
		
		

	}

}
