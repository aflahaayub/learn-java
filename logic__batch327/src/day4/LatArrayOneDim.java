package day4;

import java.util.Arrays;

public class LatArrayOneDim {

	public static void main(String[] args) {
		int[] arr1 = {1,2,3,4,5};
		
		int[] arr2 = new int[5];
		arr2[0] = 1;
		arr2[1] = 2;
		arr2[2] = 3;
		arr2[3] = 4;
		arr2[4] = 5;
		
		int[] arr3 = new int[] {1,2,3,4,5};
		
		String[] arrKata = new String[10];
		arrKata[0] = "Halo";
		System.out.println(arrKata[0]);
		
		for(int i = 0; i < arrKata.length; i++) {
			System.out.println(arrKata[i]);
		}

	}

}
