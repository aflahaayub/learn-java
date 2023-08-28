package day5;

import java.util.Scanner;

public class LatArrayTwoDim {

	public static void main(String[] args) {
	
//		array2Dim();
		array2DimVer2();
	}
	
	static void array2DimVer2() {
		Scanner input = new Scanner(System.in);
		String[][] meja = new String[2][3];
		
		// mengisi array
		for(int i = 0; i< meja.length; i++) {
			for(int j = 0; j < meja[i].length;j++) {
				System.out.printf("Siapa yang akan duduk di meja (%d, %d)? ", i,j);
				meja[i][j] = input.nextLine();
			}
		}
		
		System.out.println("Urutan Meja:");
		//menampilkan isi array
		for(int i = 0; i<meja.length; i++) {
			for(int j=0; j<meja[i].length; j++) {
				System.out.printf("| %s | \t", meja[i][j]);
			}
			System.out.println();
		}
	}
	
	
	static void array2Dim() {
		String[][] login = {
			{"Administrator", "Admin"},
			{"Staff IT", "StaffIT"},
			{"Staff Finance","StaffFinance"}
		};
		
		for(int i = 0; i < login.length; i++) {
//			System.out.println(Arrays.toString(login[i]));
			for(int j = 0; j < login[i].length; j++) {
				System.out.print(login[i][j] + "\t");
//				System.out.println("Password: " + login[i][1]);
			}
			System.out.println();
		}
		
		int[][] arrInt = { {1,2,3}, {4,5,6}, {7,8,9}};
		for(int i =0; i < arrInt.length; i++) {
			for(int j = 0; j < arrInt[i].length; j++) {
				System.out.print(arrInt[i][j] + "\t");
			}
			System.out.println();
		}
		
	}

}
