package testdemo;

//Add Employee Name and Employee ID as variables

public class Employee {

	String empName;
	long empId;

	final static String COMPANYNAME = "wipro";

	public String getEmpName() {
		return empName;
	}

	public void setEmpName(String empName) {
		this.empName = empName;
	}

	public static void displayCompanyDetails() {
		System.out.println(COMPANYNAME);
	}

	public static void main(String[] args) {
		Employee emp1 = new Employee();
		emp1.setEmpName("Jotheesh");
		String empName = emp1.getEmpName();
		System.out.println(empName);
		Employee.displayCompanyDetails();
		
		
	}

}
