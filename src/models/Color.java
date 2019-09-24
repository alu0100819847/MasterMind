package models;

public enum Color {
	r,
	b,
	y,
	o,
	p,
	g,
	all{
		@Override
		public String toString() {
			String allColor = "";
			for(Color color : Color.values()){
				if(color != Color.all){
					allColor += color + ", ";
				}
			}
			return allColor;
		}

	}



}
