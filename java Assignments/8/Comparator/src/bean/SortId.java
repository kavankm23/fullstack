package bean;
import java.util.*;

public class SortId implements Comparator<Employee>
	{ 
	    public int compare(Employee e1, Employee e2)
	    {
	        return e1.getId() - e2.getId();
	    }
	}