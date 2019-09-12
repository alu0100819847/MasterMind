import java.util.Scanner;

public class GameView {
	SolutionView solutionView;
	AttemptView attemptView;
	ResultView resultView;
	
	public GameView(){
		this.headGame();
		solutionView = new SolutionView();
		attemptView = new AttemptView();
		resultView = new ResultView();
	}
	
	private void headGame(){
		System.out.println("------MASTER MIND------");
	}
	
	public void printSecretCombination(){
		this.solutionView.printSecretCombination();
	}
	
	public void printTurnInformation(int turns){
		System.out.println("\nIntento: " + (turns+1));
	}
	
	public String readAttempt(){
		return this.attemptView.readAttempt();
	}
	
	public void printValidateCodes(int code){
		this.attemptView.printValidateCodes(code);
	}
	
	public void win(){
		System.out.print("YOU WIN!!!");
	}
	
	public void lose(){
		System.out.print("YOU LOSE!!!");
	}
	
	public void printResults(Result [] result, int turns){
		for(int i = 0; i < turns; i++){
			this.resultView.printResult(result[i]);
		}
	}
	
	public String menu(){
		Scanner inp = new Scanner(System.in);
		System.out.println("\nDo you want to play again?");
		System.out.print("\n1- Play Again.");
		System.out.print("\n0- Exit.");
		System.out.print("\nOption: ");
	    String input = inp.nextLine();
	    return input;
	}
}
