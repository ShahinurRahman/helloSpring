
public class InheritanceExample{
	float salary = 50000; 
}
class Employee extends InheritanceExample{
	int bonus = 2000;
	
	public static void main(String[] args){
		Employee emp = new Employee();
		System.out.println("Employee Salary: "+emp.salary);
		System.out.println("Employee Salary: "+emp.bonus);
	}
}
