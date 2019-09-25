package models;

public class Solution extends Combination {
	
	public Solution(){
		this.combination = new Color[4];
		char [] colorUsed = new char [Color.values().length];
		for (int i = 0; i < this.combination.length; i++) {
			int possibleValueAssignment;
			do{
				possibleValueAssignment = (int) (Math.random() * (Color.values().length-1));
				int colorPosition = 0;
				for(Color color : Color.values()) {
					if(colorPosition == possibleValueAssignment){
						this.combination[i] = color;
					}
					colorPosition++;
				}
			} while(colorUsed[possibleValueAssignment] == ' ');
			colorUsed[possibleValueAssignment] = ' ';
	    }
	}
	
	public Attempt check(Attempt attempt){
		int deadCounter = 0;
		int hurtCounter = 0;
		for(int i = 0; i < this.combination.length; i++){
			for(int j = 0; j < this.combination.length; j++){
				if(attempt.getCombination(i) == this.combination[j]){
					if(i == j){
						deadCounter++;
					}
					else{
						hurtCounter++;
					}
				}
			}
		}
		attempt.setResult(new Result(deadCounter, hurtCounter));
		return attempt;
	}
	
}