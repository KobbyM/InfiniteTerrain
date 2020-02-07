package com.qa.adventure;
import java.util.Scanner;

public class UserInput {
	public static String input() {
		Scanner in = new Scanner(System.in);
		
		String value = in.nextLine();

		return value;
	}
}
