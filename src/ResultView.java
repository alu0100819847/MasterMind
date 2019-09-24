
public class ResultView {
	
	public ResultView(){
		
	}
	
	public void printResult(Result result){
		Attempt attempt = result.getAttempt();
		String attemptCombination = "";
		for(int i = 0; i < 4; i++){
			attemptCombination += attempt.getCombination(i);
		}
		System.out.println(attemptCombination + " --> " + result.getDead() + " Deads " + result.getHurt() + " Hurts");
	}
	
}
