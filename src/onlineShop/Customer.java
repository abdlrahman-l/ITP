package onlineShop;

public class Customer {
	private String nama;
	private String age;
	private String email;
	private Account acc;
	private ShoppingCart sc;

	public Customer(String nama, String age, String email) {
		
		this.nama = nama;
		this.age = age;
		this.email = email;
		acc = new Account(email,"123",0);
		sc = new ShoppingCart();
	}
	
	public void showProfile() {
		System.out.println("Hi " + this.nama);
		System.out.println("Email	: "+ this.email);
		System.out.println("Age		: "+ this.age);
		System.out.println("Username: "+ acc.getUsername());
		System.out.println("Your account balance : $"+acc.getBalance());
	}

	protected String getCustomerName() {
		return this.nama;
	}
	
	public void addToCart(Product p) {
		System.out.println(p.getNama());
		sc.addToCartProcess(p);
	}
	
	public void showFromCart() {
		sc.displayAllProduct();
		System.out.println("Order Subtotal : "+sc.calculateTotal());
		System.out.println(sc.getProductCount()+" items in your cart");
	}
	public void checkOutFromCart() {
		if (acc.getBalance()>=sc.calculateTotal()) {
			acc.setBalance(acc.getBalance()-sc.calculateTotal());
		}
		else 
			System.out.println("Maaf saldo anda tidak mencukupi");
		sc = new ShoppingCart();
	}
	public boolean loginCheck(String uname,String passwd) {
		if (uname.equals(acc.getUsername()) && passwd.equals(acc.getPassword()))
			return true;
		else 
			return false;
	}
	
	public void topUpBalance(DebitCard dc,double topup) {
		dc.setBalance(dc.getBalance()-topup);
		acc.setBalance(acc.getBalance()+topup);
		
	}
}
