
public class EmployeeDemo {

	public static void main(String[] args) {
		Employee[] emps=new Employee[4];
		emps[0]=new Employee(1001, 5000.0);
		for(int  i=0;i<emps.length;i++) {
			emps[i]=new Employee(1000+i,5000.0);
		}
        for(Employee emp:emps) {
        System.out.println(emp);	
        }
        
	}

}
