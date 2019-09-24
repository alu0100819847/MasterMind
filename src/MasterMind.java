import controller.gameController;
import models.Game;
import views.GameView;

public class MasterMind {
	
	private Game game;
	
	private gameController gameController;
	
	public MasterMind(){
		this.game = new Game();
		this.gameController = new GameView(game);
	}
	
	private void play(){
		this.gameController.play();
	}
	
	public static void main(String[] args) {	
		new MasterMind().play();
	}
	
}