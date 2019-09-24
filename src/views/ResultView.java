package views;

import models.Result;

public class ResultView {
	private Result result;

	public ResultView(Result result){
		this.result = result;
	}
	
	public String getImprimibleResult(){
		return this.result.getDead() +" Deads " + this.result.getHurt() + " Hurts";
	}
	
}
