package models;

public class Attempt extends Combination {
	
	public Attempt(String input){
		this.combination = new Color[4];
		for(int i = 0; i < input.length(); i++){
			for(Color color : Color.values()) {
				if(color.toString().equals( input.substring(i, i+1)) ){
					this.combination[i] = color;
				}
			}
		}
	}
	
	
	public Color getCombination(int position){
		return combination[position];
	}
	
}
