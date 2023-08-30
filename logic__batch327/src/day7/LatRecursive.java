package day7;

import java.util.Scanner;

public class LatRecursive {
	
	static Scanner input = new Scanner(System.in);

	public static void main(String[] args) {
//		System.out.println(recursion(10));
//		recursion(10);
		
		printingData();

	}
	
	static void printingData() {
		System.out.println("--Recursive Method--");
		System.out.print("Masukkan nilai awal kecil: ");
		int lowest = input.nextInt();
		
		System.out.print("Masukkan nilai akhir besar: ");
		int highest = input.nextInt();
		
		System.out.print("Masukkan tipe recursive: ");
		String type = input.next();
		
		
		otherRecursion(lowest, highest, type);
	}
	
	static int recursion(int data) {
		if(data > 0) {
			return data + recursion(data-1);
		}else {
			return 0;
		}
	}
	
	static int otherRecursion(int lowest, int highest, String type) {
		System.out.println(type == "ASC");
		if(type == "ASC") {
			
			if(lowest == highest) {
				System.out.print(lowest + " ");
				return lowest;
			}
			
			System.out.print(lowest + " ");
			return otherRecursion(lowest+1, highest, "ASC");
		}else  {
			
			if(lowest == highest) {
				System.out.print(highest + " ");
				return highest;
			}
			
			System.out.print(highest + " ");
			return otherRecursion(lowest, highest-1, "DESC");
			
		}
		
	}

}
