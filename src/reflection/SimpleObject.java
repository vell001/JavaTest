package reflection;

public class SimpleObject {
	private static SimpleObject simpleObject = null;
	public static SimpleObject getInstance(){
		if(simpleObject == null)
			simpleObject = new SimpleObject();
		return simpleObject;
	}
	private SimpleObject(){}
	
	public int id;
	
	public static void main(String[] args) {
		SimpleObject o1 = SimpleObject.getInstance();
		o1.id = 2;
		SimpleObject o2 = SimpleObject.getInstance();
		System.out.println(o2.id);
	}
}
