package reflection;

public class MyObject {
	public String f1;
	public static int count=0;
	
	{
		count++;
		System.out.println("MyObject: " + count);
	}
	
	public String m1(String str){
		f1 = new String("field1");
		System.out.println(str==null ? "method1" : str);
		return "method1";
	}
}
