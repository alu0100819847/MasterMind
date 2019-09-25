package models;
import java.util.ArrayList;

public class Game {

	private Solution solution;
	
	private boolean win;
	
	private ArrayList<Attempt> attempt;
	
	public Game(){

	}
	
	public void start(){
		this.solution = new Solution();
		this.win = false;
		this.attempt = new ArrayList<Attempt>();
	}
	
	public void nextAttempt(String attemptInput){	
		Attempt attempt = new Attempt(attemptInput);
		this.attempt.add(this.solution.check(attempt));
    	if(this.attempt.get(this.attempt.size()-1).getResult().win()){
    		this.win = true;
    	}
	}
	
	public boolean isWon(){
		return this.win;
	}
	
	public ArrayList<Attempt> getAttempt(){
		return this.attempt;
	}
	
	public int getAttemptNumber(){
		return attempt.size();
	}
	
}