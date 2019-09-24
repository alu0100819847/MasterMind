package views;

import controller.GameController;
import models.Game;
import models.Attempt;

import java.util.Scanner;
import java.util.ArrayList;

public class GameView implements GameController {
	
	private SolutionView solutionView;
	
	private AttemptView attemptView;
	
	private Game game;
	
	public GameView(Game game){
		this.solutionView = new SolutionView();
		this.attemptView = new AttemptView();
		this.game = game;
	}
	
	public void play(){
		this.headGame();
		boolean finished = false;
		do{
			this.solutionView.printSecretCombination();
			this.printResults(this.game.getAttempt());
			this.printAttemptNumberInformation(game.getAttemptNumber());
			this.game.nextAttempt(this.attemptView.readAttempt());
			finished = game.isWon();
		} while(!finished && game.getAttemptNumber()<10);
		this.winLose();
		this.menuOption();
	}
	
	private void headGame(){
		System.out.println("------MASTER MIND------");
		
	}

	private void printAttemptNumberInformation(int attemptNumber){
		System.out.println("\nIntento: " + attemptNumber);
	}
	
	private void winLose(){
		if(this.game.isWon()){
			System.out.print("YOU WIN!!!");
		}
		else{
			System.out.print("YOU LOSE!!!");
		}
	}
	
	private void printResults(ArrayList<Attempt> result){
		for(int i = 0; i < result.size(); i++){
			this.attemptView.printResult(result.get(i));
		}
	}
	
	private void menuOption(){
		Scanner inp = new Scanner(System.in);
		System.out.println("Do you want to play again?");
		System.out.println("1- Play Again.");
		System.out.println("0- Exit.");
		System.out.print("Option: ");
	    menuSelection(inp.nextLine());
	    System.out.println();
	}
	
	private void menuSelection(String option){
		switch(option) {
		  case "1":
			  clear();
			  this.play();
		    break;
		  case "0":
		    break;
		  default:
			  break;
		}
	}
	
	private void clear(){
		this.solutionView = new SolutionView();
		this.attemptView = new AttemptView();
		this.game.start();
	}
	
}
