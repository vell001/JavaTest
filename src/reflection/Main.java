package reflection;

import java.lang.reflect.InvocationTargetException;

import reflection.factories.GlobalFactory;

public class Main {
	public static void main(String[] args) throws ClassNotFoundException, InstantiationException, IllegalAccessException, IllegalArgumentException, InvocationTargetException {
		/*String className = "reflection.MyObject";
		String[] classMethods = {"m1"};
		Class<?> c = Class.forName(className);
		Object o1 = c.newInstance();

		Method[] methods = c.getMethods();
		for(Method m : methods){
			if(m.getName().equals(classMethods[0])){
				m.invoke(o1, "hello world");
			}
		}*/
		System.out.println(GlobalFactory.createObjectFactory().createMyObject().f1);
	}
}
