import java.util.regex.*;
class  PIN_Validation
{
	public static void isValidPinCode()
    {
		String regex= "^[1-9]{1}[0-9]{2}\\s{0,1}[0-9]{3}$";
		System.out.println(regex);
	}
	public static void main(String[] args) 
	{
		isValidPinCode();
	}
}
