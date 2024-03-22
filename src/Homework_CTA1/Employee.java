package Homework_CTA1;
public class Employee {
		public String firstName;
		public String lastName;
		public int employeeID;
		double salary; 
		
		//Constructor for salary, initialize at zero
		public Employee () {
		this.salary = 0; }
		
		//Setters for first name, last name, employee id 
		public void setFirstName(String firstName) {
			this.firstName = firstName; }
		public void setlastName(String lastName) {
			this.lastName = lastName; }
		public void setemployeeID(int employeeID) {
			this.employeeID = employeeID; }
			
		//Getters
		public String getfirstName() { return firstName; }
		public String getLastName() { return lastName; }
		public int getemployeeID(){ return employeeID; }
		
		//Print method
		public void employeeSummary(){
		System.out.println(firstName + lastName + employeeID);
		}
		public static void main(String[] args) { 
		
} 
}
 

	