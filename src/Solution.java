
public class Solution extends Combination{
	
	public Solution(){
		this.combination = new Color[4];
		char [] colorUsed = new char [Color.values().length];
		for (int i = 0; i < this.combination.length; i++) {
			int posibleValueAssignment;
			do{
				posibleValueAssignment = (int) (Math.random() * Color.values().length);
				int colorPosition = 0;
				for(Color color : Color.values()) {
					if(colorPosition == posibleValueAssignment){
						this.combination[i] = color;
					}
					colorPosition++;
				}
			} while(colorUsed[posibleValueAssignment] == ' ');
			colorUsed[posibleValueAssignment] = ' ';
	    }
	}
	
	public Result check(Attempt attempt){
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
		return new Result(deadCounter, hurtCounter, attempt);
	}
	
}