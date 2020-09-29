package come.bridgelabz.practice.userValidation;

import java.util.Scanner;

public class UserValidation {

	public static void main(String[] args) {
		
		JavaRegex j= new JavaRegex();
		System.out.println("Enter your firstName");
		Scanner s = new Scanner(System.in);
		String firstName = s.nextLine();
		if(j.firstNameCheck(firstName)) 
		{
			System.out.println("Firstname is valid");
		}
		else 
		{
			System.out.println("Firstname is not valid");
			return;
		}
		
		System.out.println("Enter your lastname");
	    s=new Scanner(System.in);
		String lastname = s.nextLine();
		if(j.firstNameCheck(lastname)) 
		{
			System.out.println("lastname is valid");
		}
		else 
		{
			System.out.println("lastname is not valid");
			return;
		}
		
		System.out.println("Enter your email");
	    s=new Scanner(System.in);
		String email = s.nextLine();
		if(j.emailCheck(email)) 
		{
			System.out.println("email is valid");
		}
		else 
		{
			System.out.println("email is not valid");
			return;
		}
		
		System.out.println("Enter your phone number");
	    s=new Scanner(System.in);
		String phone = s.nextLine();
		if(j.phoneCheck(phone)) 
		{
			System.out.println("phone number is valid");
		}
		else 
		{
			System.out.println("phone number is not valid");
			return;
		}
		
		System.out.println("Enter your password");
	    s=new Scanner(System.in);
		String password = s.nextLine();
		if(j.passwordCheck(password)) 
		{
			System.out.println("password is valid");
		}
		else 
		{
			System.out.println("password is not valid");
			return;
		}
		
		s.close();
	}

}
