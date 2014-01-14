package properties_test;

import java.util.Locale;
import java.util.ResourceBundle;

public class TestProperties {
	public static void main(String[] args) {
		ResourceBundle res_zh = ResourceBundle.getBundle("properties_test/test", Locale.CHINA );
		ResourceBundle res_en = ResourceBundle.getBundle("properties_test/test", Locale.US);
		System.out.println(Locale.CHINA + ":" + res_zh.getString("welcome"));
		System.out.println(Locale.US+ ":" + res_en.getString("welcome"));
	}
}
