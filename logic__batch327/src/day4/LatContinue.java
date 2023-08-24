package day4;

public class LatContinue {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		continueExample();
	}
	static void continueExample() {
		for(int j = 0; j <= 20; j++) {
			if(j == 5 || j > 16) {
				continue;
			}
			System.out.println(j);
		}
	}
}
