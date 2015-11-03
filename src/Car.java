public class Car {
	private String color;
	private int horsepower;
	private String enginesize;
	
	
public Car(String enginesize, int horsepower, String color) {
	
	this.setEnginesize(enginesize);
	this.setColor(color);
	this.setHorsepower(horsepower);
	
}



	public void setColor(String color2) {
		this.color = color2;
	}
	public String getColor() {
		return color;
	}

public void setHorsepower(int horsepower2) {
	this.horsepower = horsepower2;
	
}
public int getHorsepower() {
	return horsepower;
}

public void setEnginesize(String enginesize2) {
	this.enginesize = enginesize2;
	
}
public String getEnginesize() {
	
	return enginesize;
}

public String toString() {
	return " The Engine is a " +this.getEnginesize()  + ", The color is " + this.getColor() + ", the horsepower is " + this.getHorsepower() +"." +"\n";
	
}


}