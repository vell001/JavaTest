package reflection;

public class SimpleFactory {
	public static MyObject createMyObject(String f1){
		MyObject o = new MyObject();
		o.f1 = f1;
		return o;
	}
}
