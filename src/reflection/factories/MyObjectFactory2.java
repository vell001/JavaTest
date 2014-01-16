package reflection.factories;

import reflection.MyObject;
import reflection.interfaces.ObjectFactory;

public class MyObjectFactory2 implements ObjectFactory {

	@Override
	public MyObject createMyObject() {
		MyObject o = new MyObject();
		o.f1 = "made in MyObjectFactory2";
		return o;
	}
}
