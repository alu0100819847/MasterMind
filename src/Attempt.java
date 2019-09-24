
public class Attempt extends Combination{
	
	private int state;
	
	public Attempt(String input){
		this.combination = new Color[4];
		this.validateAttempt(input);
		if(state == 0){
			for(int i = 0; i < input.length(); i++){
				for(Color color : Color.values()) {
					
					if(color.toString().equals( input.substring(i, i+1)) ){
						this.combination[i] = color;
					}
				}
			}
		}
	}
	
	private void validateAttempt(String attempt){
		if(attempt.length() != 4){
			this.state = 2;
		}
		else{
			for(int i = 0; i < attempt.length(); i++){
				boolean exist = false;
				for(Color color : Color.values()){
					if(color.name() == attempt.substring(i, i+1)){
						combination[i] = color;
						exist = true;
					}
					if(!exist){
						this.state = 1;
					}
				}
			}
		}
		this.state = 0;
	}
	
	public int getState(){
		return this.state;
	}
	
	public Color getCombination(int position){
		return combination[position];
	}
	
}
