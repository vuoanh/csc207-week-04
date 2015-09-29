
public class Employee {
	
	private double salary;
	private final String name;
	private final String ID;
	private boolean employed;
	
	public Employee (String name, double salary, String ID) {
		this.salary = salary;
		this.name = name;
		this.ID = ID;
		this.employed = true;
	}
	
	public String getName() {
		return name;
	}
	
	public String getID() {
		return ID;
	}
	
	public double getSalary() {
		return salary;
	}
	
	public void setEmployed(boolean employed) {
		this.employed = employed;
	}

}
