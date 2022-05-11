package onlineShop;

public class ShoppingCart {
	private Product listProduct[];
	private int productCount;
	
	public ShoppingCart() {
	listProduct = new Product[100];
	productCount=0;
	}
	
	public void addToCartProcess(Product pd ) {
		listProduct[productCount]= pd;
		productCount++;
	}
	
	public double calculateTotal(){
		double total=0;
		for (int i=0;i<productCount;i++) {
		total=total+ listProduct[i].getPrice();
		}
		return total;
	}

	
	public void displayAllProduct() {
		System.out.println("-----------------------------------------------------------");
		System.out.println("| # | Product Name | Price ($) | Stock |");
		System.out.println("-----------------------------------------------------------");
		for (int i=0;i<productCount;i++)
		{
			System.out.printf("|%-3d|%-14s|$ %9.2f|%-7d|%n", i + 1,
					listProduct[i].getNama(),
					listProduct[i].getPrice(),
					listProduct[i].getStock()
			);
		}
		System.out.println("-----------------------------------------------------------");

	}
	
	
	public int getProductCount() {
		return productCount;
	}
	
	
}
