package day3;

public class LatFor {

	public static void main(String[] args) {
		for(int i = 0; i < 5; i++) {
//			System.out.println(i);
		}
		
		for(int i = 0; i < 5; i++) {
			for(int j = 0; j < 5;j++) {
				System.out.print("(" + i + ","+ j + ")");
			}
			// \t untuk tab
			System.out.println();
		}

	}

}
