
public class Product {
	
	public String name;
	public double price;
	public int quantity;
	
	public double totalValueInStock() {
		return price * quantity;
	}
	
	public void addProducts(int quantity) { 
		//o quantity da entrada com o mesmo nome do atributo
		//é uma ambiguidade, então usa-se "this" para usar o atributo da classe
		 this.quantity += quantity;
	}
	
	public void removeProducts(int quantity) {
		this.quantity -= quantity;
	}
	
	public String toString() {
		//return name;
		//o objeto em formato de string, vai ser o nome do produto.
		//System.out.println(product.toString()); = vai aparecer o nome no console
		//OU se colocar System.out.println(product); vai retornar da mesma forma
		//o java entederá implicitamente que é um toString, por ser um contexto de .println\
		
		return name + ", $ " + price + ", " + quantity + " units, Total : $ " + totalValueInStock();
		// dessa forma aparece tudo (=
		
	}
}
