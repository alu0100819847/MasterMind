public class MasterMind {
	
	private Game game;
	
	private GameView gameView;
	
	public MasterMind(){
		this.game = new Game();
		this.gameView = new GameView(game);
	}
	
	private void play(){
		this.gameView.play();
	}
	
	public static void main(String[] args) {	
		new MasterMind().play();
	}
	
}