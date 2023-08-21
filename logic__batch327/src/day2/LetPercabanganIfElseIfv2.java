package day2;

import java.util.Scanner;

public class LetPercabanganIfElseIfv2 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		System.out.print("Masukkan Username anda: ");
		String username = input.next();
		
		System.out.print("Masukkan Passowrd anda: ");
		String password = input.next();
		
		String result = "";
		// Operator Logic
		if(username.equals("xsisacademy") || username.equals("xsismitra")) {
			if(password.equals("winners")) {
				result = "Login Success!";
			}
			else {
				result = "Wrong password!";
			}
		}else {
			if(password.equals("winners")) {
				result = "Wrong username!";
			}else {
				result = "Username and Password is not correct!";
			}
		}
		
		System.out.println(result);
	}

}
