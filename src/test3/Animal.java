package test3;

public class Animal extends Biology{
	private double speed;
	public Animal(){}
	public Animal(double s){
		this.speed = s;
	}
	public double getSpeed() {
		return speed;
	}
	public void setSpeed(double speed) {
		this.speed = speed;
	}
	public void move(){
		System.out.println("speed:" + speed);
	}
}
