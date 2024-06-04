package vector;
import java.util.Enumeration;
import java.util.Vector;

public class VectorDemo{
	public static void main(String[] args) {
		Vector<Integer> v= new Vector<Integer>();
		System.out.println(v.capacity());
		for(int i=0;i<=10;i++) {
			v.addElement(i);
		}
		System.out.println(v);
		System.out.println(v.size());
		System.out.println(v.capacity());
	 
		Enumeration<Integer> i=v.elements();
		while(i.hasMoreElements()) {
			Integer a=i.nextElement();
			if(a%2==0) {
				System.out.println(a);
			}
		}
	}
}
