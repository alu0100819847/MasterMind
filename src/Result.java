
public class Result {
	
	private int dead;
	
	private int hurt;
	
	private Attempt attempt;
	
	public Result(int dead, int hurt, Attempt attempt){
		this.dead = dead;
		this.hurt = hurt;
		this.attempt = attempt;
	}
	
	public boolean win(){
		if(this.dead == 4){
			return true;
		}
		return false;
	}
	public int getDead(){
		return dead;
	}
	
	public int getHurt(){
		return hurt;
	}
	
	public Attempt getAttempt(){
		return attempt;
	}
	
}
