import java.util.Scanner;

public class game {
	int turns;
	solution answer;
	boolean win;
	String [] tablero = {"", "", "", "", "", "", "", "", "", ""};
	
	public game(){
		this.start();
	}
	
	public void start(){
		this.turns = 0;
		this.answer = new solution();
		this.win = false;
		System.out.println("------MASTER MIND------");
		System.out.println("SECRET: ****");
		int result = this.turn();
		if(result == 1) System.out.print("YOU WIN!!!");
		if(result == 2) System.out.print("YOU LOSE!!!");
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
	
	private int turn(){
		int result = 2;		
		if(turns == 10) return 2;
		else{
			System.out.println("\nIntento: " + (turns+1));
			this.printTable();
			System.out.print("\nEnter 4 characters word: ");
			Scanner inp = new Scanner(System.in);
		    String input = inp.nextLine();
		    char [] checkAnswer = this.answer.check(input);
		    if(checkAnswer[0] == '*') System.out.print("Wrong length word");
		    else{
	    		if(!this.answer.checkCharacters(input)) System.out.print("Wrong characters. Use: r, b, y, o, p, g");
	    		else {
			    	if(checkAnswer[0] == 'w'){
			    		this.win = true;
			    	}
			    	else{
			    		System.out.print(new String(checkAnswer));
			    		setTable(input, checkAnswer);
			    		turns++;
			    	}
	    		}
		    }
			if(this.win) return 1;
			else {
				result = turn();
			}
		}
		return result;
	}
	
	private void setTable(String try_, char [] result){
		tablero[this.turns] = try_ + "-->" + new String(result);
	}
	
	private void printTable(){
		for(int i = 0; i < this.turns; i++){
			System.out.print(tablero[i] + "\n");
		}
	}
}
