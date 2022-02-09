
public class Employee {

	private static int empNum;
	private static double empSalary;
	public int getEmpNum() {
		return empNum;
	}
	public Employee(){
		this(empNum,empSalary);
	}
	public void setEmpNum(int empNum) {
		this.empNum = empNum;
	}
	public double getEmpSalary() {
		return empSalary;
	}
	public void setEmpSalary(double empSalary) {
		this.empSalary = empSalary;
	}
	public Employee(int empNum,double empSalary) {
		this.empNum=empNum;
		this.empSalary=empSalary;
	}
	@Override
	public String toString() {
		String str="Emp Num:"+empNum+"\nEmp Salary:"+empSalary;
			return str;	
	}
}
