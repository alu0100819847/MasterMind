package views;

import models.Color;

public class SolutionView {
	
	SolutionView(){
		
	}
	
	public void printSecretCombination(){
		System.out.println();
		System.out.println("SECRET: ****");
		System.out.println("Possible colors: " + Color.all);
	}

}
