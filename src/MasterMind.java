import controller.Controller;
import controller.GameController;
import controller.Logic;
import models.Game;
import views.GameView;

public class MasterMind {
	
	private Logic logic;
	
	private GameView gameView;
	
	public MasterMind(){
		this.logic = new Logic();
		this.gameView = new GameView(logic);
	}
	
	private void play(){
		Controller controller;
		do {
			controller = this.logic.getController();
			if (controller != null) {
				this.gameView.interact(controller);
			}
		} while (controller != null);
	}
	
	public static void main(String[] args) {	
		new MasterMind().play();
	}
	
}