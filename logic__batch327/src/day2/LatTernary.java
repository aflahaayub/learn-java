package day2;

public class LatTernary {

	public static void main(String[] args) {
		String title;
		String otherTitle;
		boolean isMale = true;
		boolean isFemale = true;
		
		if(isMale) {
			title = "Mr.";
		}else {
			title = "Ms.";
		}
		
		otherTitle = isFemale? "Ms." : "Mr.";
		
		System.out.println(title + "John");
		System.out.println(otherTitle + "Claire");
		
		// nested if
		if(isMale) {
			title = "Mr.";
		}else {
			if(isFemale) {
				title = "Ms.";
			}else {
				title ="Alien";
			}
		}
		
	

	}

}
