package come.bridgelabz.practice.userValidation;

import java.util.regex.Pattern;

public class JavaRegex {
	
	public boolean firstNameCheck(String firstName)
	{
		Pattern pattern = Pattern.compile("[A-Z]{1}[a-z]{2,}");
		return pattern.matcher(firstName).matches();
	}

}
