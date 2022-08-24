import java.util.Scanner;
public class Application {
public static void main(String[] args) {
	Scanner sc = new Scanner (System.in);
	Employee funcionario = new Employee ();
	
	System.out.print("Name: ");
	funcionario.name = sc.next();
	System.out.print("Gross Salary: ");
	funcionario.GrossSalary = sc.nextDouble();
	System.out.print("Tax: ");
	funcionario.tax = sc.nextDouble();
	
	System.out.println("");
	System.out.print("Employee: "+ funcionario.name + ", $ " + funcionario.NetSalary());
	System.out.println("");
	
	System.out.print("Which percentage to increase salary? ");
	double porcentagem = sc.nextDouble();
	
	funcionario.IncreaseSalary(porcentagem);
	
	System.out.println("");
	System.out.print("updated data: " + funcionario.name +", $ " + funcionario.GrossSalary);
 }
}
