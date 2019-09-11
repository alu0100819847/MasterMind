
public class GameView {
	SolutionView solutionView;
	AttemptView attemptView;
	
	public GameView(){
		this.headGame();
		solutionView = new SolutionView();
		attemptView = new AttemptView();
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
}
