public class Employee {

	public String name;
	public double GrossSalary;
	public double tax;
	
	
public double NetSalary() {
	return this.GrossSalary -= tax;
	}

public void IncreaseSalary(double percentage) {
		this.GrossSalary += tax;
		this.GrossSalary += this.GrossSalary * (percentage/100);
		this.GrossSalary -= tax;
	}
}
