public class Solution {
	char [] alf_ = {'r', 'b', 'y', 'o', 'p', 'g'};
	char [] answer = {' ', ' ', ' ', ' '};
	char [] alf = {'r', 'b', 'y', 'o', 'p', 'g'};
	
	public Solution(){

		for (int i = 0; i < this.answer.length; i++) {
			int posibleValueAssignment = (int) (Math.random() * this.alf.length);
			
			while(alf[posibleValueAssignment] == ' '){
				posibleValueAssignment = (int) (Math.random() * this.alf.length);
			}
			this.answer[i] = this.alf[posibleValueAssignment];
			alf[posibleValueAssignment] = ' ';
	    }
		for (int i = 0; i < this.answer.length; i++) {
			System.out.println(answer[i]);
		}
	}
	
	public char [] check(String sim){
		char [] result = {' ', ' ', ' ', ' '} ;
		if(sim.length() != this.answer.length) result[0] = '*';
		int counter = 0;
		int winCounter = 0;
		for(int i = 0; i < this.answer.length; i++){
			for(int j = 0; j < this.answer.length; j++){
				if(sim.charAt(i) == this.answer[j]){
					if(i == j){
						result[counter] = 'D';
						winCounter++;
					}
						
					else result[counter] = 'H';
					counter++;
				}
			}
		}
		if(winCounter == 4) result[0] = 'w';
		return result;
	}
	
	public boolean checkCharacters(String sim){
		for(int i = 0; i < answer.length; i++){
			
			boolean result = false;
			for(int j = 0; j< alf_.length; j++){

				if(sim.charAt(i) == alf_[j]) result = true; 
			}
			if(!result) return false;
		}
		return true;
	}
}