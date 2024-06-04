package vector;

import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class HashMapDemo {
	public static void main(String[] args) {
		HashMap h=new HashMap();
		h.put("Swapnil", 700);
		h.put("Sagar", 800);
		h.put("Sahil", 400);
		h.put("Swaraj", 600);
		h.put("Suvrat", 800);
		System.out.println(h);
		h.put("name", 400);
		System.out.println(h);
		System.out.println(h.put("name", 400));
		Collection c= h.values();
		Set s1=h.entrySet();
		System.out.println(s1);
		Iterator itr=s1.iterator();
		while(itr.hasNext()) {
			Map.Entry m1=(Map.Entry)itr.next();
			System.out.println(m1.getKey()+" "+m1.getValue());
			if(m1.getKey().equals("Swapnil")) {
				m1.setValue(1000);
			}
			System.out.println(h);
		}
	}
}
