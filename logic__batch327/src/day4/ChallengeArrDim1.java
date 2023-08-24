package day4;

import java.util.Arrays;
import java.util.Scanner;

public class ChallengeArrDim1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		dinamisVer(); // work for soal 1-4
//		soal01();
		soal02();
//		soal03();
//		soal04();
//		soal05();
//		soal06();
//		soal07(); // also work for soal08
//		soal08();
//		soal09();
//		soal10();
		

	}
	
	static void dinamisVer() {
		Scanner input = new Scanner(System.in);
		System.out.print("Insert the array length: ");
		int len = input.nextInt();
		int[] arr = new int[len];
		
		if(len > 0) {
			System.out.print("Set the first int: ");
			int j = input.nextInt();
			
			System.out.print("Set the gap number: ");
			int gap = input.nextInt();
			
			
			for(int i = 0; i < len; i++) {
				arr[i] = j;
				j+=gap;
			}
			
			System.out.println(Arrays.toString(arr));
		}else {
			System.out.println("Masukkan nilai length array yang benar!");
		}
		
		input.close();
	}
	
	static void soal01() {
		//n=7
		//output => 1 3 5 7 9 11 13
		Scanner input = new Scanner(System.in);
		System.out.print("Insert the array length: ");
		int len = input.nextInt();
		int[] arr = new int[len];
		
		if(len > 0) {
			int j = 1;
			for(int i = 0; i < len; i++) {
				arr[i] = j;
				j+=2;
			}
			
			System.out.println(Arrays.toString(arr));
		}else {
			System.out.println("Masukkan nilai length array yang benar!");
		}
		
		input.close();
		
	}

	static void soal02() {
		Scanner input = new Scanner(System.in);
		System.out.print("Insert the array length: ");
		int len = input.nextInt();
		int[] arr = new int[len];
		
		if(len > 0) {
				int j = 2;
			
			for(int i = 0; i < len; i++) {
				arr[i] = j;
				j+=2;
			}
			
			System.out.println(Arrays.toString(arr));
			
		}else {
			System.out.println("Masukkan nilai panjang array dengan benar!");
		}
		
		input.close();
		
		
	}

	static void soal03() {
		//output => 1	4	7	10	13	16	19 -> +3
		Scanner input = new Scanner(System.in);
		System.out.print("Insert the array length: ");
		int len = input.nextInt();
		int[] arr = new int[len];
		
		if(len > 0) {
			System.out.print("Set the first int: ");
			int j = input.nextInt();
			
			for(int i = 0; i < len; i++) {
				arr[i] = j;
				j+=3;
			}
			
			System.out.println(Arrays.toString(arr));
		}else {
			System.out.println("Masukkan nilai panjang array yang benar!");
		}
		
		input.close();
		
	}

	static void soal04() {
		//output => 1	5	9	13	17	21	25 -> +4
		Scanner input = new Scanner(System.in);
		System.out.print("Insert the array length: ");
		int len = input.nextInt();
		int[] arr = new int[len];
		
		if(len > 0) {
			System.out.print("Set the first int: ");
			int j = input.nextInt();
			
			for(int i = 0; i < len; i++) {
				arr[i] = j;
				j+=4;
			}
			
			System.out.println(Arrays.toString(arr));
		}else {
			System.out.println("Masukkan nilai panjang array yang benar!");
		}
		
		input.close();
	}

	static void soal05() {
		//n=7
		//output => 1	5	*	9	13	*	17 -> +4 and skip
		Scanner input = new Scanner(System.in);
		System.out.print("Insert the array length: ");
		int len = input.nextInt();
		String store = "";
		
		if(len > 0) {
			int j = 1;
			for(int i = 0; i < len; i++) {
				if((i+1) % 3 == 0) {
					store+= ("* ");
					continue;
				}else {
					store += j + " ";
				}
				j+=4;
			}
			
			System.out.println(store);
		}else {
			System.out.println("Masukkan nilai length array yang benar!");
		}
		
		input.close();
	}

	static void soal06() {
		//output => 1	5	*	13	17	*	25-> +4 and skip
		Scanner input = new Scanner(System.in);
		System.out.print("Insert the array length: ");
		int len = input.nextInt();
		String store = "";
		
		if(len > 0) {
			int j = 1;
			for(int i = 0; i < len; i++) {
				if((i+1) % 3 == 0) {
					store+= ("* ");
				}else {
					store += j + " ";
				}
				j+=4;
			}
			
			System.out.println(store);
		}else {
			System.out.println("Masukkan nilai length array yang benar!");
		}
		
		input.close();
	}

	static void soal07() {
		//output => 2	4	8	16	32	64	128 -> *2
		Scanner input = new Scanner(System.in);
		System.out.print("Insert the array length: ");
		int len = input.nextInt();
		int[] arr = new int[len];
		
		if(len > 0) {
			System.out.print("Set the first int: ");
			int j = input.nextInt();
			
			System.out.print("Set the gap number: ");
			int gap = input.nextInt();
			
			for(int i = 0; i < len; i++) {
				arr[i] = j;
				j*=gap;
			}
			
			System.out.println(Arrays.toString(arr));
		}else {
			System.out.println("Masukkan nilai length array yang benar!");
		}
		
		input.close();
	}

	static void soal08() {
		//output => 3	9	27	81	243	729	2187 -> *3
		Scanner input = new Scanner(System.in);
		System.out.print("Insert the array length: ");
		int len = input.nextInt();
		int[] arr = new int[len];
		
		if(len > 0) {
			System.out.print("Set the first int: ");
			int j = input.nextInt();
			
			for(int i = 0; i < len; i++) {
				arr[i] = j;
				j*=3;
			}
			
			System.out.println(Arrays.toString(arr));
		}else {
			System.out.println("Masukkan nilai length array yang benar!");
		}
		
		input.close();
	}

	static void soal09() {
		//output => 4	16	*	64	256	*	1024 -> *4 and skip
		Scanner input = new Scanner(System.in);
		System.out.print("Insert the array length: ");
		int len = input.nextInt();
		String store = "";
		
		if(len > 0) {
			System.out.print("Set the first int: ");
			int j = input.nextInt();
			
			for(int i = 0; i < len; i++) {
				if((i+1) % 3 == 0) {
					store+= ("* ");
					continue;
				}else {
					store += j + " ";
				}
				j*=4;
			}
			
			System.out.println(store);
		}else {
			System.out.println("Masukkan nilai length array yang benar!");
		}
		
		input.close();
	}

	static void soal10() {
		//output => 3	9	27	XXX	243	729	2187 -> *3 and skip
		Scanner input = new Scanner(System.in);
		System.out.print("Insert the array length: ");
		int len = input.nextInt();
		String store = "";
		
		if(len > 0) {
			System.out.print("Set the first int: ");
			int j = input.nextInt();
			
			for(int i = 0; i < len; i++) {
				if((i+1) % 4 == 0) {
					store+= ("XXX ");
				}else {
					store += j + " ";
				}
				j*=3;
			}
			
			System.out.println(store);
		}else {
			System.out.println("Masukkan nilai length array yang benar!");
		}
		
		input.close();
	}
}
