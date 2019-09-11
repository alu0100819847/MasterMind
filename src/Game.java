import java.util.Scanner;

public class Game {
	int turnCounter;
	Solution answer;
	boolean win;
	Result [] result;
	
	public Game(){
		this.start();
	}
	
	public void start(){
		GameView gameView = new GameView();
		this.initializeData();
		gameView.printSecretCombination();
		this.turn(gameView);
	   
		switch(gameView.printMenu()) {
		  case "1":
			  this.start();
		    break;
		  case "0":
		    break;
		  default:
			  break;
		}
	}
	
	private void turn(GameView gameView){	
		if(turnCounter == 10) gameView.lose();
		else{
			gameView.printTurnInformation(this.turnCounter);	    
		    Attempt attempt = new Attempt(gameView.readAttempt());
		    if(attempt.getState() != 0){
		    	gameView.printValidateCodes(attempt.getState());
		    }
		    else{
		    	this.result[turnCounter] = this.answer.check(attempt);

		    	if(!this.result[turnCounter].win()){    		
		    		this.turnCounter++;
		    		gameView.printResults(this.result, this.turnCounter);
		    		this.turn(gameView);
		    	} else {
		    		this.win = true;
		    		gameView.win();
		    	}
		    }
		}
	}
	
	private void initializeData(){
		this.turnCounter = 0;
		this.answer = new Solution();
		this.win = false;
		this.result = new Result[10];
	}
}