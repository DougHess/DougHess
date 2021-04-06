import java.util.ArrayList;

public class SocSecProcessor {

	public static void main(String[] args) {
		ArrayList<String> tc = new ArrayList<String>();
		tc.add("123-12-1234");
		tc.add("123-123-1234");
		tc.add("12-123-1234");
		tc.add("123-12-1r34");
		int i=1;
		for (String ssn: tc) {	
		try {
			System.out.println("Processing ssn # " + i++);
			isValid(ssn);
			System.out.println("No exception! Operation succeeded!");
			
		}
		catch (Exception e) {
			System.out.println("Exception -" + e.getMessage());
		}
		}
	}
	public static boolean isValid(String ssn) throws Exception{
		boolean flag = true;
		String msg= "";
		if (ssn.length() != 11) {
			msg=(", SSN is not equal to 11");
			flag = false;
		}
		if (ssn.charAt(3) != '-' || ssn.charAt(6) != '-'){
			msg +=(", Dashes are not in the right places");
			flag =false;
		}
		
		for (int pos = 0; pos < ssn.length(); pos++) {
				if ((pos != 3 && pos != 6 )&& !Character.isDigit(ssn.charAt(pos))) {
			msg +=(", Has non digits");
			flag=false;
			}
		}
			
		if (!flag) {
			throw new SocSecException(msg);
		}
		return flag;
		
	}
}
