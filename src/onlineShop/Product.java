package onlineShop;

public class Product {
	private String nama;
	private int stock;
	private double price;
	public Product(String nama, int stock, double price) {
		this.nama = nama;
		this.stock = stock;
		this.price = price;
	}
	public String getNama() {
		return nama;
	}
	public void setNama(String nama) {
		this.nama = nama;
	}
	public int getStock() {
		return stock;
	}
	public void setStock(int stock) {
		this.stock = stock;
	}
	public double getPrice() {
		return price;
	}
	public void setPrice(double price) {
		this.price = price;
	}
	
	
}
