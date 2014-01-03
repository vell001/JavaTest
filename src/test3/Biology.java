package test3;

public class Biology {
	
	private int age;
	public Biology() {
		// TODO Auto-generated constructor stub
		age = 0;
	}
	public void growUp(int n){
		age = age + n;
		System.out.println("age"+age);
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	
}
