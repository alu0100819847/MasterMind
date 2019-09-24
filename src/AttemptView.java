import java.util.Scanner;
import java.util.HashMap;

public class AttemptView {
	HashMap<String, String> validateCodes;
	public AttemptView(){
		validateCodes = new HashMap<String, String>();
		validateCodes.put("1", "Wrong characters. Use: r, b, y, o, p, g");
		validateCodes.put("2", "Wrong length word");
	}
	
	public String readAttempt(){
		System.out.print("\nEnter 4 characters word: ");
		Scanner inp = new Scanner(System.in);
	    String attempt = inp.nextLine();
		return attempt;
	}
	
	public void printValidateCodes(int code){
		System.out.println(validateCodes.get(Integer.toString(code)));
	}
	
}