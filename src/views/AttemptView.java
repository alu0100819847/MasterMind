package views;

import models.Color;
import models.Attempt;

import java.util.Scanner;

public class AttemptView {

	
	public AttemptView(){

	}
	
	public String readAttempt(){
		boolean repeat = false;
		String attempt = "";
	    do{
	    	if(repeat){
	    		if(attempt.length() != 4){
	    			System.out.println("Wrong length word");
	    		}
	    		else{
	    			System.out.println("Wrong characters. Use: "+ Color.all);
	    		}
	    	}
			System.out.print("\nEnter 4 characters word: ");
			Scanner inp = new Scanner(System.in);
		    attempt = inp.nextLine();
		    repeat = this.checkAttempt(attempt);
	    } while(attempt.length() != 4 || repeat);
		return attempt;
	}
	
	private boolean checkAttempt(String attempt){
    	if(attempt.length() == 4){
	    	for(int i = 0; i < attempt.length(); i++){
	    		boolean exist = false;
				for(Color color : Color.values()){
					if(color.toString().equals(attempt.substring(i, i+1))){
						exist = true;
					}
				}
				if(!exist){
					return true;
				}
			}
    	}
    	else {
    		return true;
    	}
    	return false;
	}

	public void printResult(Attempt attempt){
		ResultView resultView = new ResultView(attempt.getResult());
		String attemptCombination = "";
		for(int i = 0; i < 4; i++){
			attemptCombination += attempt.getCombination(i);
		}
		System.out.println(attemptCombination + " --> " + resultView.getImprimibleResult());
	}
}
