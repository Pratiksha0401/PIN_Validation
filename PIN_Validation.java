import java.util.regex.*;
class  PIN_Validation
{
	public static boolean isValidPinCode(String pinCode)
    {
		String regex= "^[1-9]{1}[0-9]{2}{0,1}[0-9]{3}$";
		Pattern p = Pattern.compile(regex);
		if (pinCode == null) {
            return false;
        }
		Matcher m = p.matcher(pinCode);
		return m.matches();
	}
	public static void main(String[] args) 
	{
		String PIN1="A400088";
		System.out.println(PIN1 + ": "+ isValidPinCode(PIN1));
		String PIN2="400088B";
		System.out.println(PIN2 + ": "+ isValidPinCode(PIN2));
	}
}
