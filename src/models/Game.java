package models;

import java.util.ArrayList;

public class Game {

	private Solution solution;
	
	private boolean win;
	
	private ArrayList<Attempt> result;
	
	public Game(){
		this.start();
	}
	
	public void start(){
		this.solution = new Solution();
		this.win = false;
		this.result = new ArrayList<Attempt>();
	}
	
	public void nextAttempt(String attemptInput){	
		Attempt attempt = new Attempt(attemptInput);
    	this.result.add(this.solution.check(attempt));
    	if(!this.result.get(this.result.size()-1).getResult().win()){
    	} else {
    		this.win = true;
    	}
	}
	
	public boolean isWon(){
		return this.win;
	}
	
	public ArrayList<Attempt> getResult(){
		return this.result;
	}
	
	public int getAttemptNumber(){
		return result.size();
	}
	
}