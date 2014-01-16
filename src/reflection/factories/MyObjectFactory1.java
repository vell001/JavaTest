package reflection.factories;

import reflection.MyObject;
import reflection.interfaces.ObjectFactory;

public class MyObjectFactory1 implements ObjectFactory {

	@Override
	public MyObject createMyObject() {
		MyObject o = new MyObject();
		o.f1 = "made in MyObjectFactory1";
		return o;
	}
}
