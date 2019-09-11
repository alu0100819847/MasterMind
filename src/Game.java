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
		
		Scanner inp = new Scanner(System.in);
		System.out.println("\nDo you want to play again?");
		System.out.print("\n1- Play Again.");
		System.out.print("\n0- Exit.");
		System.out.print("\nOption: ");
	    String input = inp.nextLine();
	    
		switch(input) {
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
			
			this.printTable();
			gameView.printTurnInformation(this.turnCounter);	    
		    Attempt attempt = new Attempt(gameView.readAttempt());
		    if(attempt.getState() != 0){
		    	gameView.printValidateCodes(attempt.getState());
		    }
		    else{
		    	this.result[turnCounter] = this.answer.check(attempt);

		    	if(!this.result[turnCounter].win()){
		    		for(int i = 0; i < this.turnCounter; i++){
		    			System.out.println("tablero");
		    		}
		    		this.turnCounter++;
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