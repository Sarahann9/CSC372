package Homework_CTA1;

class Manager extends Employee {
	String departmentA;
	
	public void setdepartmentA (String departmentA) {
		this.departmentA = departmentA;
	}
	public void employeeSummary(){
	System.out.println(firstName + lastName + employeeID + salary + departmentA);
	} 
	
}
	 