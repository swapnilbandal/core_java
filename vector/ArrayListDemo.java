package vector;

import java.util.ArrayList;
import java.util.Iterator;

public class ArrayListDemo {
    public static void main(String[] args) {
        ArrayList<Integer> a = new ArrayList<Integer>();
        for(int i = 0; i < 10; i++) {
            a.add(i);
        }
        System.out.println("ArrayList: " + a);
        
        Iterator<Integer> itr = a.iterator();
        while(itr.hasNext()) {
            int element = itr.next();
            if(element % 2 == 0) {
                System.out.println("Even element: " + element);
            }
        }
    }
}
