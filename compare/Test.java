package compare;

import java.util.TreeSet;

public class Test {
    public static void main(String[] args) {
        Employee e1 = new Employee(101, "swapnil");
        Employee e2 = new Employee(102, "ganesh");
        Employee e3 = new Employee(103, "Pranav");
        Employee e4 = new Employee(104, "Sagar");
        Employee e5 = new Employee(105, "Anil");

        TreeSet t = new TreeSet(new Mycomparator());
        t.add(e1);
        t.add(e2);
        t.add(e3);
        t.add(e4);
        t.add(e5);
     
        System.out.println(t);
       
    }
}
