package day4;

public class LatBreak {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		breakExample();
	}
	
	static void breakExample() {
		for(int j = 0; j <= 10; j++) {
			if(j > 5) {
				break;
			}
			System.out.println(j);
		}
	}

}
