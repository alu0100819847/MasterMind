
public class ResultView {
	public ResultView(){
		
	}
	public void printResult(Result result){
		Attempt attempt = result.getAttempt();
		String attemptSecuence = "";
		for(int i = 0; i < 4; i++){
			attemptSecuence += attempt.getSecuence(i);
		}
		System.out.println(attemptSecuence + " --> " + result.getDead() + " Deads " + result.getHurt() + " Hurts");
	}
}
