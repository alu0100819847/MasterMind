package models;

public class Result {
	
	private int dead;
	
	private int hurt;
	
	public Result(int dead, int hurt){
		this.dead = dead;
		this.hurt = hurt;
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
	

	
}
