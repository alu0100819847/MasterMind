
public class Solution extends Combination{
	
	public Solution(){
		this.secuence = new Color[4];
		char [] colorUsed = new char [Color.values().length];
		System.out.println("------MASTER MIND------");
		for (int i = 0; i < this.secuence.length; i++) {
			int posibleValueAssignment;
			do{
				posibleValueAssignment = (int) (Math.random() * Color.values().length);
				int colorPosition = 0;
				for(Color color : Color.values()) {
					if(colorPosition == posibleValueAssignment){
						this.secuence[i] = color;
					}
					colorPosition++;
				}
			} while(colorUsed[posibleValueAssignment] == ' ');
			colorUsed[posibleValueAssignment] = ' ';
	    }
		for(int i = 0; i < secuence.length; i++) {
			System.out.println(secuence[i]);
		}
	}
	
	public Result check(Attempt attempt){
		int deadCounter = 0;
		int hurtCounter = 0;
		for(int i = 0; i < this.secuence.length; i++){
			for(int j = 0; j < this.secuence.length; j++){
				if(attempt.getSecuence(i) == this.secuence[j]){
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