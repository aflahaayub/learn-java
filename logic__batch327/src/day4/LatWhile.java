package day4;

public class LatWhile {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int i = 1;
		
//		while(i <= 20) {
//			System.out.println(i);
//			i++;
//		}
		
		int x = 0;
		int y = 0;
		
		while(x<5) {
			while(y < 5) {
				System.out.print(y);
//				if(x==y) {
//					System.out.print("*");
//				}else {
//					System.out.print(" ");
//				}
				y++;
			}
			System.out.println();
			System.out.println(x + " " + y);
			x++;
		}
	}

}
