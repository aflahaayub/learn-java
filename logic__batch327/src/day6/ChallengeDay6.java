package day6;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;

public class ChallengeDay6 {
	private static Scanner input = new Scanner(System.in);

	public static void main(String[] args) {
//		String answer = "Y";
//		while("Y".equalsIgnoreCase(answer)) {
//			try {
//				System.out.print("Silahkan pilih nomor soal 1-6: ");
//				int num= input.nextInt();
//							
//				switch(num) {
//				case 1: 
//					soal01();
//					break;
//				case 2: 
//					soal02();
//					break;
//				case 3: 
//					soal03();
//					break;
//				case 4: 
//					soal04();
//					break;
//				case 5: 
//					soal05();
//					break;
//				case 6: 
//					soal06();
//					break;
//				default:
//					System.out.println("Masukkan hanya nomor 1-6!");
//				}
//			}catch(Exception err) {
//				System.out.println("----------------------------------");
//				System.out.println("Error output: " + err.getMessage());
//				System.out.print("Harap masukkan angka 1-6!");
//				
//			}
//			System.out.println();
//			
//			System.out.print("Apakah anda ingin kembali menjalankan program? (y/n) ");
//			answer = input.next();
//		}
//		
//		System.out.println("Salah memasukkan input. Anda keluar dari program.");
//		
//		input.close();
		
		soal06Ver2();
	}
	
	static void soal01() {
		// input: 78
		// baju -> 35,40,50,20 --> 20,35,40,50
		// celana -> 40,30,45,10 --> 10,30,40,45
		
		// output: 75 -> 35 + 40
		
		System.out.println("Uang Andi: ");
		int uang = input.nextInt();
		
		System.out.println("Harga Baju: ");
		String baju = input.next();
		
		System.out.println("Harga Celana: ");
		String celana = input.next();
		
		// split the input into array
		String[] listBaju = baju.split(",");
		String[] listCelana = celana.split(",");
		
		// create an array variable to store the nearest value
		ArrayList<Integer> nearest = new ArrayList<Integer>();
		
		int[] hargaBaju = new int[listBaju.length];
		int[] hargaCelana = new int[listCelana.length];
		
		if(hargaBaju.length == hargaCelana.length) {
			// convert string into int array
			for(int i = 0; i < listBaju.length; i++) {
			    hargaBaju[i] = Integer.parseInt(listBaju[i]);
			    hargaCelana[i] = Integer.parseInt(listCelana[i]);
			}
			
			// sorting
			Arrays.sort(hargaBaju);
			Arrays.sort(hargaCelana);
			
			int celanaCounter = 0;
			int bajuCounter = 0;
			
//			System.out.println(Arrays.toString(hargaBaju));
//			System.out.println(Arrays.toString(hargaCelana));
			
			
			// create a for loop to check who is the nearest from the input val
			for(int i = 0; i < hargaBaju.length; i++) {
				// move to right or left
				int lowestBaju = hargaBaju[bajuCounter];
				int highestCelana = hargaCelana[(hargaBaju.length-1) - celanaCounter];
		
				//System.out.printf("lowest baju (%d) tambah highest celana (%d) adalah %d %n", lowestBaju, highestCelana, lowestBaju+highestCelana); 
				
				// check if the lowest val of hargaBju + highest val of hargaCelana bigger than uang
				// if it is, move the highest val to the second highst
				// if it's not, store it to an array nearest and move from lowest to the second lowest
				if((lowestBaju+highestCelana)>uang) {
					celanaCounter++;
				}else {
					nearest.add(lowestBaju+highestCelana);
					bajuCounter++;
				}
			}
			
			if(nearest.size() > 0) {
				Collections.sort(nearest);
//				System.out.println(nearest);
				System.out.println("Harga Baju yang mencukupi uang Andi : " + nearest.get(nearest.size()-1));
			}else {
				System.out.println("Uang Andi terlalu sedikit!");
			}
		
		}else {
			System.out.println("Masukkan harga masing-masing barang dengan panjang yang sama!");
		}
	}

	static void soal02() {
		// rotate number
		 // input-> arr: 5,6,7,0,1 , rotate : 2
		// output -> 1: 6,7,0,1,5 , 2: 2: 7,0,1,5,6
		
		System.out.println("Masukkan urutan angka: ");
		String urutan = input.next();
		
		System.out.println("Rotate: ");
		int rotate = input.nextInt();
		
		String[] arrUrutan = urutan.split(",");
		
		ArrayList<String> arrList = new ArrayList<String>();
		
		
		for(int i = 0; i < arrUrutan.length; i++) {
			arrList.add(arrUrutan[i]);
		}
		
		String str = new String(); 
		
		for(int i = 0 ; i < rotate; i++ ) {
			arrList.add(arrList.remove(0));
			String urutanStr = String.join(",", arrList);
			System.out.println(i+1 + ": " + urutanStr);
		}
	}

	static void soal03() {
		// 8 puntung -> 1 batang rokok
		// 20 puntung -> 2 batang rokok sisa 4 puntung
		
		// 100 puntung -> ? batang rokok
		// 1 batang rokok Rp.500 , penghasilan?
		
		System.out.println("Berapa puntung : ");
		int puntung = input.nextInt();
		int rokok = puntung/8;
		int sisa = puntung % 8;
		
		if(puntung < 8) {
			System.out.println("Puntung tidak cukup untuk membuat batang rokok. ");
		}else {
			System.out.println("Anda berhasil mengumpulkan " + rokok + " batang rokok dan " + sisa + " puntung.");
			System.out.println("Uang yang didapat: Rp." + rokok*500);
		}
		
			
	}

	static void soal04() {
		/* input:
		 * Total Menu: 4
		 * Makanan alergi index ke 1
		 * Harga Menu: 12.000 , 20.000 , 9.000 , 15.000 
		 * Uang Elsa: 20.000*/
		
		/* total makanan -> 56.000
		 * Makanan yang bisa dimakan elsa: 36.000 (56k -20k) */
		
		/* output:
		 * Elsa harus membayar = 18.000 (36/2) paroan sama dimas 
		 * Sisa uang elsa : 2k
		 * 
		 * Kalau gada sisa, cetak -> Uang Pas
		 * Jika kurang, cetak -> -2.000
		 * */
		
		System.out.print("Total Menu: ");
		int totalMenu = input.nextInt();
		
		System.out.print("Makanan Alergi Index Ke- ");
		int index = input.nextInt();
		
		input.nextLine();
		
		System.out.print("Urutan harga menu: ");
		String menu = input.nextLine();
		
		System.out.print("Uang Elsa: ");
		double uangElsa = input.nextDouble();
		
		String[] hargaPerMenu = menu.split(" , ");
		
		double total = 0;
		
		String menuAlergi = hargaPerMenu[index];
		
		for(String harga : hargaPerMenu) {
			total += Double.parseDouble(harga);
		}
		
		double bisaDimakan = total - (Double.parseDouble(menuAlergi) );
		
		System.out.printf("Elsa harus membayar = %.3f %n", bisaDimakan/2);
		if((uangElsa - (bisaDimakan/2)) == 0){
			System.out.println("Uang Pas");
			
		}else {
			System.out.printf("Sisa Uang Elsa : %.3f ",(uangElsa - (bisaDimakan/2)));
		}
		
	}

	static void soal05() {
		// Input -> Simple Case
		// Output -> Vokal = aeei , Konsonan = clmpss
		
		// Input -> Next Case
		// Output -> Vokal = aee, Konsonan = cnstx
//		input.nextLine();
		
		System.out.println("Input text: ");
		String text = input.nextLine().toLowerCase();
		
		String[] arrTxt = text.split(" ");
		
		String vowels = "";
		String consonant = "";
		
		
		for(int i = 0; i < arrTxt.length; i++) {
			char[] chars = arrTxt[i].toCharArray();
						
			for(int j = 0; j <chars.length; j++) {
				char c = chars[j];
				switch(c) {
					case 'a': 
						vowels += 'a';
						break;
					case 'i': 
						vowels += 'i';
						break;
					case 'u': 
						vowels += 'u';
						break;
					case 'e': 
						vowels += 'e';
						break;
					case 'o': 
						vowels += 'o';
						break;
					default:
						consonant += c;
				}
			}

		}
		
		char[] vow = vowels.toCharArray();
		Arrays.sort(vow);
		
		StringBuilder textVow = new StringBuilder();
		textVow.append(vow);
		
		char[] conso = consonant.toCharArray();
		Arrays.sort(conso);
		
		StringBuilder textConso = new StringBuilder();
		textConso.append(conso);
	
		System.out.println("Vowels = " + textVow);
		System.out.println("Consonant = " + textConso);
		
	}
	
	static void soal05Ver2() {
		System.out.println("Input text: ");
		String text = input.nextLine().toLowerCase();
		String vowels = "";
		String consonant = "";
		
		for(int i = 0; i < text.length(); i++) {
			char c = text.charAt(i);
						
			switch(c) {
				case 'a': 
					vowels += 'a';
					break;
				case 'i': 
					vowels += 'i';
					break;
				case 'u': 
					vowels += 'u';
					break;
				case 'e': 
					vowels += 'e';
					break;
				case 'o': 
					vowels += 'o';
					break;
				default:
					consonant += c;
			}

		}
		
		char[] vow = vowels.toCharArray();
		Arrays.sort(vow);
		
		StringBuilder textVow = new StringBuilder();
		textVow.append(vow);
		
		char[] conso = consonant.toCharArray();
		Arrays.sort(conso);
		
		StringBuilder textConso = new StringBuilder();
		textConso.append(conso);
	
		System.out.println("Vowels = " + textVow);
		System.out.println("Consonant =" + textConso);
		
	}
	
	static void soal06() {
		// input: saya adalah superman
		// output: s*y*  a*a*a* s*p*r*a*
		
		System.out.println("Masukkan kalimat: ");
		
		input.nextLine(); // consume the remaining space
		
		String kalimat = input.nextLine();
		String[] splitKalimat = kalimat.split(" ");
		String newStr = "";
		
		for(int i = 0; i < splitKalimat.length; i++) {
			
			for(int j =0; j < splitKalimat[i].length(); j++) {
				if((j+1)%2 == 0) {
//					newStr = kalimat.replaceFirst(String.valueOf(splitKalimat[i].charAt(j)), "*");
					newStr += "*";
				}else {
					newStr += splitKalimat[i].charAt(j);
				}
			}
			newStr += " ";
		}
		
		System.out.println(newStr);
		
	}

	static void soal06Ver2() {
		// input: saya adalah superman
		// output: s*y*  a*a*a* s*p*r*a*
				
		System.out.println("Masukkan kalimat: ");
		
		String kalimat = input.nextLine();
		String newStr = "";

		for(int i = 0; i < kalimat.length(); i++) {
			if((i+1)%2 == 0) {
				if(kalimat.charAt(i) == ' ') {
					newStr += " ";
				}else{
				newStr += "*";	
				}
			}else {
				newStr += kalimat.charAt(i);
			}
		}
		
		System.out.println("Kalimat baru : " + newStr);
	}
}