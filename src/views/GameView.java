package views;
import controller.*;
import models.Attempt;
import java.util.Scanner;
import java.util.ArrayList;

public class GameView implements View {
	
	private SolutionView solutionView;
	
	private AttemptView attemptView;
	
	public GameView(){
		this.solutionView = new SolutionView();
		this.attemptView = new AttemptView();
	}
	
	private void headGame(){
		System.out.println("------MASTER MIND------");
	}

	private void printAttemptNumberInformation(int attemptNumber){
		System.out.println("\nIntento: " + attemptNumber);
	}
	
	private void winLose(boolean win){
		if(win){
			System.out.println("YOU WIN!!!");
		} else {
			System.out.println("YOU LOSE!!!");
		}
	}
	
	private void printResults(ArrayList<Attempt> result){
		for(int i = 0; i < result.size(); i++){
			this.attemptView.printResult(result.get(i));
		}
	}
	
	private String menuOption(){
		Scanner inp = new Scanner(System.in);
		System.out.println("Do you want to play again?");
		System.out.println("1- Play Again.");
		System.out.println("0- Exit.");
		System.out.print("Option: ");
		String input = inp.nextLine();
		System.out.println();
		return input;
	}

	@Override
	public void visit(GameController controller){
		if(controller.getStateValue() == 0){
			this.headGame();
			controller.start();
			controller.next();
		}
		if(controller.getStateValue() == 2){
			this.printAttemptNumberInformation(controller.getAttemptNumber()+1);
			this.printResults(controller.getAttempt());
			controller.next();
		}
		if(controller.getStateValue() == 4){
			this.winLose(controller.isWon());
			String option = this.menuOption();
			if(option.equals("1")) {
				controller.reset();
				controller.getStateValue();
			}
			controller.next();

		}
	}

	@Override
	public void visit(SolutionController solutionController) {
		this.solutionView.printSecretCombination();
		solutionController.next();
	}

	@Override
	public void visit(AttemptController attemptController) {
		attemptController.nextAttempt(this.attemptView.readAttempt());
		attemptController.next();
	}

	@Override
	public void interact(Controller controller) {
		controller.accept(this);
	}

}
