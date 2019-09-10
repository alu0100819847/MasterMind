public class solution {
	color [] alf_ = {new color('r'), new color('b'), new color('y'), new color('o'), new color('p')};
	color [] answer = {new color(), new color(), new color(), new color()};
	color [] alf = {new color('r'), new color('b'), new color('y'), new color('o'), new color('p')};
	
	public solution(){

		for (int i = 0; i < this.answer.length; i++) {
			int temp = (int) (Math.random() * this.alf.length);
			
			while(!alf[temp].complete()){
				temp = (int) (Math.random() * this.alf.length);
			}
			this.answer[i].setName(this.alf[temp].getName());
			alf[temp].setName(' ');
	    }
		for (int i = 0; i < this.answer.length; i++) {
			System.out.println(answer[i].getName());
		}
	}
	
	public char [] check(String sim){
		char [] result = {' ', ' ', ' ', ' '} ;
		if(sim.length() != this.answer.length) result[0] = '*';
		int counter = 0;
		int winCounter = 0;
		for(int i = 0; i < this.answer.length; i++){
			color temp = new color(sim.charAt(i));
			for(int j = 0; j < this.answer.length; j++){
				if(temp.check(this.answer[j].getName())){
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

				if(sim.charAt(i) == alf_[j].getName()) result = true; 
			}
			if(!result) return false;
		}
		return true;
	}
}
