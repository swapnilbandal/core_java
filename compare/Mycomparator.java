package compare;

import java.util.Comparator;

public class Mycomparator implements Comparator<Employee> {
    @Override
    public int compare(Employee o1, Employee o2) {
    	Employee e1=(Employee)o1;
    	Employee e2=(Employee)o2;
        String s1 = e1.empName;
        String s2 = e2.empName;
        return s1.compareTo(s2);
    }
}
