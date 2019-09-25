import controller.Controller;
import controller.Logic;
import views.GameView;

public class MasterMind {
	
	private Logic logic;
	
	private GameView gameView;
	
	public MasterMind(){
		this.logic = new Logic();
		this.gameView = new GameView();
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