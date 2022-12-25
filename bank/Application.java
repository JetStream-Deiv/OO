package bank;
import java.util.Scanner;
public class Application {
	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
		Bank banco = new Bank ();

		System.out.print("Enter account number: ");
		banco.setAccountNumber(sc.nextInt());

		System.out.print("Enter account holder: ");
		banco.setHolder(sc.next());

		System.out.print("Is there an initial deposit (y/n)? ");
		String Opcao = sc.next();

		if(Opcao.equalsIgnoreCase("y")) {
			System.out.print("Enter initial deposit value: ");
			double InitialD = sc.nextDouble();

			banco.deposit(InitialD);

		}else if(Opcao.equalsIgnoreCase("n")){
			banco.setBalance(0);
		}
		System.out.println("\nAccount data:\n"
				+ "Account: "+banco.getAccountNumber()+", Holder: "+banco.getHolder()+", Balance: R$"+banco.getNewBalance());

		System.out.print("\nEnter a deposit value: ");
		double valorDepo = sc.nextDouble();
		banco.deposit(valorDepo);

		System.out.println("Updated account data:\n"
				+ "Account: "+banco.getAccountNumber()+", Holder: "+banco.getHolder()+", Balance: R$"+banco.getNewBalance());

		System.out.print("\nEnter a withdraw value: ");
		double valorSaque = sc.nextDouble();
		banco.withdraw(valorSaque);

		System.out.println("Updated account data:\n"
				+ "Account: "+banco.getAccountNumber()+", Holder: "+banco.getHolder()+", Balance: R$"+banco.getNewBalance());
	}
}