package day5;

import java.util.ArrayList;

public class LatArrayList {
	public static void main(String[] args) {
		arrList();
	}
	
	static void arrList() {
		// instantiating
		ArrayList arr = new ArrayList();
		
		// add data to arraylist obj
		arr.add("Leo");
		arr.add(100);
		arr.add(true);
		
		System.out.println(arr);
		
		System.out.println(arr.get(0));
		
		arr.remove(true);
		
		for(int i = 0; i < arr.size(); i++) {
			System.out.println(arr.get(i));
		}
		
		for(Object i : arr) {
			System.out.print(i);
		}
		
		// multidimensional
		ArrayList<ArrayList<Object>> a = new ArrayList<ArrayList<Object>>();
		
	}
}
