package day7;

import java.util.Arrays;
import java.util.Scanner;

public class LatConvertAllArray {
	static Scanner input = new Scanner(System.in);

	public static void main(String[] args) {
		arrayConvertStrToInt();

	}
	
	static void arrayConvertStrToInt() {
		String[] array = {"1", "2", "3", "4", "5"};
		int[] arrInt = new int[array.length];
		for(int i = 0; i < array.length; i++) {
			arrInt[i] = Integer.valueOf(array[i]);
		}
		
		int[] arrInt2 = Arrays.stream(array).mapToInt(Integer::valueOf).toArray();
		
		System.out.println(Arrays.toString(arrInt2));
		
		System.out.print("Harga Baju: ");
		int[] arr = Arrays.stream(input.next().split(",")).mapToInt(Integer::valueOf).toArray();
		
		System.out.println(Arrays.toString(arr));
	}
	
	static void arrayConvertIntToStr() {
		int[] array = {1, 2, 3, 4, 5};
		
		String[] arrStr2 = Arrays.stream(array).mapToObj(String::valueOf).toArray(String[]::new);
		
		System.out.println(Arrays.toString(arrStr2));
	}

}
