package questions;

import java.util.Scanner;

public class chessfind {
	static Scanner sc= new Scanner(System.in);
	
	
	public static void main(String[] args) {
		
		System.out.println("input your square");
		String a = sc.nextLine();
		int pos = (int)a.charAt(1) + (int)a.charAt(0);
		if(pos%2==0)
			System.out.println("Black");
		else
			System.out.println("White");	
		
	}

}
