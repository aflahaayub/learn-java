package day6;

import java.util.HashMap;

public class LatHashMap {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		hashMap();
	}
	
	static void hashMap() {
		HashMap<Integer, String> days = new HashMap<Integer, String>();
		days.put(1, "Monday");
		days.put(7, "Sunday");
		
		System.out.println(days);
		
		days.replace(7, "Saturday");
		
		String something = days.remove(1);
		
		System.out.println(something);
		
		// hapus all data
		days.clear();
		
		System.out.println(days);
	}

}
