
public class color {
	char name;

	public color(char sim){
		this.name = sim;
	}
	
	public color(){
		this.name = ' ';
	}
	
	public boolean complete(){
		if(this.name == ' ') return false;
		else return true;
	}
	
	public void setName(char sim){
		this.name = sim;
	}
	
	public char getName(){
		return name;
	}
	
	public boolean check(char sim){
		if(sim == name) return true;
		else return false;
	} 
}
