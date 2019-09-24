import java.util.ArrayList;

public class Game {

	private Solution solution;
	
	private boolean win;
	
	private ArrayList<Result> result;
	
	public Game(){
		this.start();
	}
	
	public void start(){
		this.solution = new Solution();
		this.win = false;
		this.result = new ArrayList<Result>();
	}
	
	public int nextAttempt(String attemptInput){	
		Attempt attempt = new Attempt(attemptInput);
	    if(attempt.getState() == 0){
	    	this.result.add(this.solution.check(attempt));
	    	if(!this.result.get(this.result.size()-1).win()){    		
	    	} else {
	    		this.win = true;
	    	}
	    }
		return attempt.getState();
	}
	
	public boolean isWon(){
		return this.win;
	}
	
	public ArrayList<Result> getResult(){
		return this.result;
	}
	
	public int getAttemptNumber(){
		return result.size();
	}
	
}