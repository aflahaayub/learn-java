package day5;

import java.util.Arrays;
import java.util.Scanner;

public class ChallengeAr2Dim {
	
	private static Scanner input = new Scanner(System.in);

	public static void main(String[] args) {
//		Scanner input = new Scanner(System.in);
		
//		String answer = input.nextLine();
		String answer = "Y";
		
		while("Y".equalsIgnoreCase(answer)) {
			try {
				System.out.print("Silahkan pilih nomor soal 1-10: ");
				int num= input.nextInt();
							
				switch(num) {
				case 1: 
					soal01();
					break;
				case 2: 
					soal02();
					break;
				case 3: 
					soal03();
					break;
				case 4: 
					soal04();
					break;
				case 5: 
					soal05();
					break;
				case 6: 
					soal06();
					break;
				case 7: 
					soal07();
					break;
				case 8: 
					soal08();
					break;
				case 9: 
					soal09();
					break;
				case 10: 
					soal10();
					break;
				default:
					System.out.println("Masukkan hanya nomor 1-10!");
				}
			}catch(Exception err) {
				System.out.println("----------------------------------");
				System.out.println("Error output: " + err.getMessage());
				System.out.print("Harap masukkan angka 1-10!");
				
			}
			System.out.println();
			input.nextLine();
			System.out.print("Apakah anda ingin kembali menjalankan program? (y/n) ");
			answer = input.next();
		}
		
		System.out.println("Salah memasukkan input. Anda keluar dari program.");
		
		input.close();
	}
	
	static void soal01() {
		/* n = 7, n2 = 3
			i :	0	1	2	3	4	5	6
			0 :	1	3	9	27	81	243	729
		*/
		
		System.out.println("Masukkan nilai kolom: ");
		int n1 = input.nextInt();
		
		System.out.println("Masukkan nilai baris: ");
		int n2 = input.nextInt();
		
		int[][] arr = new int[n2][n1];
		int newVar = 1;
		
		for(int i = 0; i < arr.length; i++) {
			if(i > 2) {
				break;
			}
			System.out.println();
			for(int j = 0; j < arr[i].length; j++) {
				if(i == 1) {
					arr[i][j] = newVar;
					newVar *= 3;
					System.out.print(arr[i][j] + " ");
				}else if( i > 1) {
					break;
				}
				else {
					arr[i][j] = j;
					System.out.print(arr[i][j] + " ");
				}
				
			}
		}

	}
	static void soal02() {
		/* n = 7, n2 = 3
		0	1	2	3	4	5	6
		1	3	-9	27	81	-243	729 -> 
	*/

		System.out.println("Masukkan nilai kolom: ");
		int n1 = input.nextInt();
		
		System.out.println("Masukkan nilai baris: ");
		int n2 = input.nextInt();
		
		int[][] arr = new int[n2][n1];
		
		int newVar = 1;
		
		for(int i = 0; i < arr.length; i++) {
			if(i > 1) {
				break;
			}
			System.out.println();
			for(int j = 0; j < arr[i].length; j++) {
				if(i == 1) {
					arr[i][j] = newVar;
					if((j+1) % 3 == 0) {
						arr[i][j] *= -1;
					}
					System.out.print(arr[i][j] + " ");
					newVar*= 3;
				}else {
					arr[i][j] = j;
					System.out.print(arr[i][j] + " ");
				}
				
			}
		}

	}
	static void soal03() {
		
		System.out.println("Masukkan nilai kolom: ");
		int n1 = input.nextInt();
		
		System.out.println("Masukkan nilai baris: ");
		int n2 = input.nextInt();
		
		int[][] arr = new int[n2][n1];
		int counter = 3;
		
		for(int i = 0; i < arr.length; i++) {
			if(i>1){
				break;
			}
			System.out.println();
			
			for(int j = 0; j < arr[i].length; j++) {
				if(i == 0) {
					arr[i][j] = j;
					
				}else if( i == 1) {
					
					if(j==0) {
						arr[i][j] = counter;
						
					}else {
						if(j > 3) {
							counter /= 2;
						}
						else {
							counter *= 2;
						}
						arr[i][j] = counter;	
					}
					
				}else {
					break;
				}
				System.out.print(arr[i][j] + " ");
			}
			
			
		}
		
	}
	static void soal04() {
		/*n = 7, n2 = 5
			0	1	2	3	4	5	6
			1	5	2	10	3	15	4
		 *  */
		
		System.out.println("Masukkan nilai kolom: ");
		int n1 = input.nextInt();
		
		System.out.println("Masukkan nilai baris: ");
		int n2 = input.nextInt();
		
		int[][] arr = new int[n2][n1];
		int counter = 5;
		int otherCounter = 1;
		
		for(int i =0; i < arr.length; i++) {
			if(i > 1) {
				break;
			}
			System.out.println();
			for(int j = 0; j < arr[i].length; j++) {
				if(i == 0) {
					arr[i][j] = j;
				}else if( i == 1){
					if((j+1)%2 == 0) {
						arr[i][j] = counter;
						counter += 5;
					}else {
						arr[i][j] = otherCounter;
						otherCounter++;
					}
				}else {
					break;
				}
				System.out.print(arr[i][j] + " ");
			}
		}
	}
	static void soal05() {
		/*	n = 7
		 *  0	1	2	3	4	5	6
			7	8	9	10	11	12	13
			14	15	16	17	18	19	20 */

		System.out.println("Masukkan nilai kolom: ");
		int n1 = input.nextInt();
		
		System.out.println("Masukkan nilai baris: ");
		int n2 = input.nextInt();
		
		int[][] arr = new int[n2][n1];
		int counter = 0;
		int othCounter =0;
		for(int i = 0; i < arr.length; i++) {
			if(i > 2) {
				break;
			}
			System.out.println();
			
			othCounter = counter;
			for(int j = 0; j < arr[i].length; j++) {
				if(i == 0) {
					arr[i][j] = j;
				}else {
					arr[i][j] = othCounter;
					othCounter++;
					
				}
				System.out.print(arr[i][j] + " ");
			}
			counter += n1;
		}
	}
	static void soal06() {
		/*n = 7
			0	1	2	3	4	5	6
			1	7	49	343	2401	16807	117649
			1	8	51	346	2405	16812	117655
			
			n = 5
			
			0	1	2	3	4
			1	5	25	125	625 -> 1,0 1,1 1,2 1,3 
			1	6	27	128	629
		*/
		
		System.out.print("Masukkan nilai kolom: ");
		int n2 = input.nextInt();
		
		System.out.print("Masukkan nilai baris: ");
		int n1 = input.nextInt();
	
		
		int[][] arr = new int[n1][n2];
		int counter = n2;
		
		for(int i = 0; i < arr.length; i++) {
			if(i > 2) {
				break;
			}
			System.out.println();
			for(int j = 0; j < arr[i].length; j++) {
				if(i==0) {
					arr[i][j] = j;
				}
				else if(j==0) {
					arr[i][j] = 1;
				}
				else if(j>0 && i == 1) {
					arr[i][j] = (counter);
					counter *= n2;
				}
				else {
					arr[i][j] = arr[1][j] + arr[0][j];
				}
				
				System.out.print(arr[i][j] + " ");
			}
		}
	}
	
	static void soal07() {
		/*	n = 7
		 *  0	1	2	3	4	5	6
			7	8	9	10	11	12	13
			14	15	16	17	18	19	20 */

		System.out.println("Masukkan nilai kolom: ");
		int n1 = input.nextInt();
		
		System.out.println("Masukkan nilai baris: ");
		int n2 = input.nextInt();
		
		int[][] arr = new int[n2][n1];
		int counter = 0;
		int othCounter =0;
		for(int i = 0; i < arr.length; i++) {
			if(i > 2) {
				break;
			}
			System.out.println();
			othCounter = counter;
			for(int j = 0; j < arr[i].length; j++) {
				if(i == 0) {
					arr[i][j] = j;
				}else {
					arr[i][j] = othCounter;
					othCounter++;
					
				}
				System.out.print(arr[i][j] + " ");
			}
			
			counter += n1;
			}
		
	}
	static void soal08() {
		/*	0	1	2	3	4	5	6
			0	2	4	6	8	10	12
			0	3	6	9	12	15	18
 */

		System.out.println("Masukkan nilai kolom (j): ");
		int n1 = input.nextInt();
		
		System.out.println("Masukkan nilai baris (i): ");
		int n2 = input.nextInt();
		
		System.out.println("Masukkan nilai tengah: ");
		int jump = input.nextInt();
		
		int[][] arr = new int[n2][n1];
		
		int counter = jump;
		
		for(int i = 0; i < arr.length; i++) {
			if(i > 2) {
				break;
			}
			System.out.println();
			for(int j = 0; j < arr[i].length; j++) {
				if(i==0) {
					arr[i][j] = j;
				}
				else if(j==0) {
					arr[i][j] = 0;
				}
				else if(j>0 && i == 1) {
					arr[i][j] = (counter);
					counter +=  jump;
				}
				else {
					arr[i][j] = arr[1][j] + arr[0][j];
				}
				
				System.out.print(arr[i][j] + " ");
			}
		}
	}
	static void soal09() {
		System.out.println("Masukkan nilai kolom (j): ");
		int n1 = input.nextInt();
		
		System.out.println("Masukkan nilai baris (i): ");
		int n2 = input.nextInt();
		
		int[][] arr = new int[n2][n1];
		
		int stored = 0;
		
		for(int i = 0; i < arr.length; i++) {
			if(i > 2) {
				break;
			}
			
			System.out.println();
			
			int last = arr[i].length-1;
			for(int j = 0; j < arr[i].length; j++) {
				
				if(i == 0) {
					arr[i][j] = j;
				}else if(i == 1) {
					arr[i][j] = stored;
					stored += 3;
				}else {
					arr[i][j] = arr[1][last];
					last--;
				}
				System.out.print(arr[i][j] + " ");
			}
		}
	}
	static void soal10() {
		/*	0	1	2	3	4	5	6
			0	3	6	9	12	15	18
			0	4	8	12	16	20	24 */
		System.out.println("Masukkan nilai kolom: ");
		int n1 = input.nextInt();
		
		System.out.println("Masukkan nilai baris: ");
		int n2 = input.nextInt();
		
		System.out.println("Masukkan nilai tengah: ");
		int jump = input.nextInt();
		
		int[][] arr = new int[n2][n1];
		
		int counter = jump;
		
		for(int i = 0; i < arr.length; i++) {
			if(i > 2) {
				break;
			}
			System.out.println();
			for(int j = 0; j < arr[i].length; j++) {
				if(i==0) {
					arr[i][j] = j;
				}
				else if(j==0) {
					arr[i][j] = 0;
				}
				else if(j>0 && i == 1) {
					arr[i][j] = (counter);
					counter +=  jump;
				}
				else {
					arr[i][j] = arr[1][j] + arr[0][j];
				}
				
				System.out.print(arr[i][j] + " ");
			}
		}
	}

}
