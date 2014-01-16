package reflection.factories;

import java.util.ResourceBundle;

import reflection.interfaces.ObjectFactory;

public class GlobalFactory {
	private static ObjectFactory of = null;
	static{
		ResourceBundle res = ResourceBundle.getBundle("reflection/factories/factory");
		String factoryName = res.getString("reflection.MyObject");
		try {
			Class<?> c = Class.forName(factoryName);
			of = (ObjectFactory)c.newInstance();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	public static ObjectFactory createObjectFactory(){
		return of;
	}
}
