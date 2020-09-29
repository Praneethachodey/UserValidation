package come.bridgelabz.practice.userValidation;

import java.util.regex.Pattern;

public class JavaRegex {
	
	public boolean firstNameCheck(String firstName)
	{
		Pattern pattern = Pattern.compile("[A-Z]{1}[a-z]{2,}");
		return pattern.matcher(firstName).matches();
	}
	
//	public boolean emailCheck(String email)
//	{
//		//String valid = new String("^[\\w-\\+]+(\\.[\\w]+)*@[\\w-]{2,})?(\\.[a-z]{2,})?$");
//		String valid = new String("^[a-zA-Z0-9\\-_]+([\\.+_-][a-zA-Z0-9]+)?@([a-zA-Z0-9]+)\\.([a-z0-9]{2,})(\\.[a-z]{2})?$");
//		Pattern pattern = Pattern.compile(valid);
//		return pattern.matcher(email).matches();
//	}

}
