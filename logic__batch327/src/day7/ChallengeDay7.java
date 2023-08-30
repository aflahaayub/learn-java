package day7;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class ChallengeDay7 {
	static Scanner input = new Scanner(System.in);

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		soal07();
	}

	static void soal01() {
		// Fibonaci
		// Input 7: 1,1,2,3,5,8,13
		// 1+1 = 2 , 2+1 = 3 , 3+2 = 5, 5+8 = 13
		System.out.print("Masukkan total angka: ");
		int total = input.nextInt();

		int prev = 0;
		int container = 1;
		if (total > 2) {
			for (int i = 0; i < total; i++) {
				// 0 + 1 = 1; container = 1
				// 1 - 0 = 1; prev = 1

				// 1 + 1 = 2 ; container = 2
				// 2 - 1 = 1 ; prev = 1

				// 1 + 2 = 3 ; container = 3
				// 3 - 1 = 3; prev = 2;

				// 2 + 3 = 5; container = 5;
				// 5 - 2 = 3; prev = 3

				// 3 + 5 = 8; container = 8;
				// 8 - 3 = 5; prev = 5
				container = prev + container;
				prev = container - prev;

				if (i == (total - 1)) {
					System.out.print(prev);
				} else {
					System.out.print(prev + ", ");
				}
			}
		} else {
			System.out.print("Total must be more than 2");
		}

	}

	static void soal02() {
		// Fibonaci
		// Input 7: 1,1,1,3,5,9,17
		// 1+1+1 = 3 , 1+1+3 = 5 , 1+3+5 = 9, 3+5+9 = 17
		System.out.print("Masukkan total angka: ");
		int total = input.nextInt();
		String deret = "";
		String comma = "";

		int[] arr = new int[total];

		for (int i = 0; i < total; i++) {
			if (i <= 2) {
				arr[i] = 1;
			} else {
				arr[i] = arr[i - 1] + arr[i - 2] + arr[i - 3];
			}
			
			comma = (i != total-1) ?"," : "";
			
			deret += String.valueOf(arr[i]) + comma;
		}

		System.out.print(deret);
		
		// cara lain ilangin []
		System.out.println(Arrays.toString(arr).replace("[", "").replace("]", ""));

	}

	static void soal03() {
		System.out.print("Input number :");
		int num = input.nextInt();
		String deret = "";

		if (num > 2) {
			int flag = 0;
			for (int i = 2; i <= num; i++) { // i = 2
				flag = 1;

				for (int j = 2; j <= i / 2; j++) { // j <= 1 (failed), lgsg masuk ke condition flag
					if (i % j == 0) {
						flag = 0;
						break;
					}

				}

				if (flag == 1) {
					deret += String.valueOf(i) + " ";
				}
			}

			System.out.print(deret);

		} else {
			System.out.print("Number must be more than 2");
		}
	}

	static void soal04() {
		System.out.print("Input time: ");
		String[] time = input.next().split(":");

		int hour = Integer.parseInt(time[0]);
		int minute = Integer.parseInt(time[1]);
		String second = time[2];
		int sec = Integer.parseInt(second.substring(0, 2));

		int container = 12;
		if ((hour <= 12 && hour >= 0) && (minute > 0 && minute < 60) && (sec > 0 && sec < 60)) {
			if (second.contains("PM")) {
				if (hour != 12) {
					hour += container;
				}
				System.out.printf("%d:%s:%d", hour, minute, sec);

			} else if (second.contains("AM")) {
				second = second.substring(0, 2);
				if (hour == 12) {
					hour = 0;
				}

				System.out.printf("0%d:%s:%d", hour, minute, sec);
			}

		} else {
			System.out.print("Input the right time format (00-12)h:(00-59)m:(00-59)s!");
		}
	}

	static void soal05() {
		// factor tree
		/*
		 * Input : 12 Output: 12/2 = 6; 6/2 = 3; 3/3 =1
		 */

		System.out.print("Input num: ");
		int num = input.nextInt();
		// if input can be divided by 2 or 3 or 5, store the data, and do the dividing
		// again
		int[] divider = { 2, 3, 5 };
		int i = 0;
		int storeNum = num;
		boolean flag = true;

		if (num >= 2) {
			while (flag) {

				if (storeNum % divider[i] == 0) {
					System.out.printf("%d / %d = %d %n", storeNum, divider[i], storeNum / divider[i]);

					storeNum /= divider[i];
				} else {
					i++;
				}

				if (i > divider.length - 1) {
					flag = false;
				}

			}
		} else {
			System.out.print("Input the right number (>2)! ");
		}
	}

	static void soal05VerPrime() {
		int num = input.nextInt();
		
		while(num != 1) {
			
			for(int i = 2; i<=num/2; i++) {
				if(num%i==0) {
					System.out.println(num + "/" + i + "=" + )
				}
			}
		}
	}
		
	static void soal06() {
		// if 1 l -> 2.5km

		/*
		 * 1. Jarak dari Toko ke Customer 1 = 2KM 2. Jarak dari Customer 1 ke Customer 2
		 * = 500 M 3. Jarak dari Customer 2 ke Customer 3 = 1.5KM 4. Jarak dari Customer
		 * 3 ke Customer 4 = 300M
		 */
		// input: 1 2 3
		// output:
		// Jarak Tempuh = 2KM + 500KM + 1.5KM = 4KM
		// Bensin = 2 Liter

		System.out.println("Masukkan urutan perjalanan (1-4): ");
		String[] order = input.nextLine().split(" ");

		int[] distance = { 2000, 500, 1500, 300 }; // convert to M
		double oneL = 2500; // convert to M

		int totalDistance = 0;

		System.out.print("Jarak Tempuh = ");

		for (int i = 0; i < order.length; i++) {
			if (distance[i] > 1000) {
				if (distance[i] % 1000 == 0) {
					System.out.print(distance[i] / 1000 + "KM");
				} else {
					System.out.print((double) distance[i] / 1000 + "KM");
				}

			} else {
				System.out.print(distance[i] + "M");
			}

			totalDistance += distance[i];

			if (i != order.length - 1) {
				System.out.print(" + ");
			}
		}

		if (totalDistance > 1000) {
			if (totalDistance % 1000 != 0) {
				System.out.print(" = " + (double) totalDistance / 1000 + "KM" + "\n");
			} else {
				System.out.print(" = " + totalDistance / 1000 + "KM" + "\n");
			}

		} else {
			System.out.print(" = " + totalDistance + "M" + "\n");
		}

		System.out.print("Bensin = " + (int) Math.ceil(totalDistance / oneL) + " Liter");

	}

	static void soal06Dinamis() {
		System.out.print("Masukkan banyak customer: ");
		int customer = input.nextInt();

		input.nextLine();

		System.out.print("Masukkan urutan jarak customer (meter):  ");
		String[] urutan = input.nextLine().split(" ");
		
		
		// check if customer and length of urutan is the same
		if (customer == urutan.length) {
			System.out.print("Masukkan urutan perjalanan (1-" + urutan.length + "): ");
			String[] order = input.nextLine().split(" ");

			// check if length of order is less OR same as length of urutan
			if (order.length <= urutan.length) {

				int[] distance = new int[urutan.length];
				double oneL = 2500; // convert to M

				int totalDistance = 0;

				for (int i = 0; i < distance.length; i++) {
					distance[i] = Integer.parseInt(urutan[i]);
				}

				// print jarak tempuh first
				System.out.print("Jarak Tempuh = ");

				for (int i = 0; i < order.length; i++) {
					
					//check if the element of arr distance is bigger than 1000
					// if it is, change it into KM by dividing it by 1000
					// if not, just use meter.
					if (distance[i] > 1000) {
						// check if element distance dont have remaining if divided by 1000
						// if it is, we can use int. If not, we can use double to see the remaining number
						if (distance[i] % 1000 == 0) {
							System.out.print(distance[i] / 1000 + "KM");
						} else {
							System.out.print((double) distance[i] / 1000 + "KM");
						}

					} else {
						System.out.print(distance[i] + "M");
					}

					// calculate the total of distance element
					totalDistance += distance[i];

					// if i is not in the end of loop, print +
					if (i != order.length - 1) {
						System.out.print(" + ");
					}
				}

				// check if total is bigger than 1000
				// if it is, we can use KM. If not, just use meter.
				if (totalDistance > 1000) {
					//check if totalDistance doesnt have remaining number when divided by 1000
					// if it is, we can use double to shown the remaining number
					// if not, just print the whole number
					if (totalDistance % 1000 != 0) {
						System.out.print(" = " + (double) totalDistance / 1000 + "KM" + "\n");
					} else {
						System.out.print(" = " + totalDistance / 1000 + "KM" + "\n");
					}

				} else {
					System.out.print(" = " + totalDistance + "M" + "\n");
				}

				System.out.print("Bensin = " + (int) Math.ceil(totalDistance / oneL) + " Liter");
				
			} else {
				
				System.out.print("Masukkan urutan perjalanan dengan benar!");
			}
			
			
		}else {
			System.out.print("Masukkan banyak customer dan urutan jarak dengan benar!");
		}
	}

	static void soal07() {
		// input: SOSSPSSQSSQR -> SOS, SPS, SQS, SQR
		// output: 4

		System.out.print("Input message: ");
		char[] message = input.next().toUpperCase().toCharArray();

		int wrongCount = 0;
		int first = 1;
		int second = 2;
		int third = 3;

		for (int i = 0; i < message.length; i+=3) {
			// 123 456 789

			if (message[first - 1] != 'S') {
				wrongCount++;
			}

			first += 3;

			if (message[second - 1] != 'O') {
				wrongCount++;
			}

			second += 3;

			if (message[third - 1] != 'S') {
				wrongCount++;
			}

			third += 3;

			if ((first > message.length) || (second > message.length) || (third > message.length)) {
				break;
			}
		}

		System.out.print(wrongCount);

	}
}
