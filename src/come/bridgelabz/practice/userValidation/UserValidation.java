package come.bridgelabz.practice.userValidation;

import java.util.Scanner;

public class UserValidation {

	public static void main(String[] args) {
		
		JavaRegex j= new JavaRegex();
		System.out.println("Enter your firstName");
		Scanner s = new Scanner(System.in);
		String firstName = s.nextLine();
		s.close();
		if(j.firstNameCheck(firstName)) 
		{
			System.out.println("Firstname is valid");
		}
		else 
		{
			System.out.println("Firstname is not valid");
			return;
		}
	}

}
