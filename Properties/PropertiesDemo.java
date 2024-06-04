package Properties;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

public class PropertiesDemo {
	public static void main(String[] args) throws IOException {
		Properties p= new Properties();
		FileInputStream fis = new FileInputStream("C:/Users/Group046/Desktop/Java/core_java/src/Properties/abc.properties");
		p.load(fis);
		System.out.println(p);
		String s=p.getProperty("user");
		System.out.println(s);
		System.out.println(s);
	}
}
