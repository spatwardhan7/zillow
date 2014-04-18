
public class zillowstringToLong {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		test();
		

	}

	private static void test() {
		
		long i = stringToLong("123"); 

		if (i == 123) 
		{
			System.out.println("Success : i = " +i);
		}
		else
		{
			System.out.println("Failed");
		}
	}
	
	
	/*
	 * stringToLong function takes in a ASCII string which represents a number 
	 * and converts it into a Long. 
	 * 
	 * Known Limitations: 
	 * This Function requires the string to be clean, i.e without any spaces, 
	 * commas or any other special characters. The function will print an error message
	 * and return 0 if the string is not clean. 
	 *  
	 * Also, this function cannot handle strings longer than range of Long 
	 * 
	 */
	private static long stringToLong(String s) 
	{
		// Check for null string 
		if(s == null || s.length() == 0)
			return 0;
		
		boolean isNegative = false;
		int i = 0;  
		
		// Convert String to Character array
		char[] charStr = s.toCharArray(); 
		
		// Check if number in string is negative
		if(charStr[i] == '-')
		{
			isNegative = true;
			i++;
		}
		
		long value = 0;
		
		// Iterate through all characters and multiply by ten during each iteration
		// and add Integer value of character .
		while(i < charStr.length)
		{
			value *= 10;
			// Check if current character is a Digit, i.e between 0-9
			if(Character.isDigit(charStr[i]))
			{
				value += (charStr[i] - '0');  
				i++;
			}
			else
			{
				System.out.println("Unexpected Non - numeric character found in string : " +charStr[i]);
				return 0;
			}
		}
		
		// Multiply by -1 if number was negative
		if(isNegative)
		{
			value *= -1;
		}
			
		return value;
	}

}
