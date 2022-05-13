package onlineShop;
import java.util.Scanner;

public class MainOnlineShop {
	public static void main(String[] args) {
		Product listProduct[];
		Product p = null;
		listProduct = new Product[100];
		listProduct[0] = new Product("RAM",10,100);
		listProduct[1] = new Product("Printer",5,50);
		listProduct[2] = new Product("Laptop",20,1000);
		listProduct[3] = new Product("Mouse",10,10);
		listProduct[4] = new Product("Keyboard",8,10);
		listProduct[5] = new Product("Monitor",9,60);
		listProduct[6] = new Product("VGA",5,70);
		listProduct[7] = new Product("CPU",10,100);
		listProduct[8] = new Product("Speaker",4,5);
		listProduct[9] = new Product("Headset",8,5);
		DebitCard dc = new DebitCard(1000);
		Customer cs = null;
		int choice,choice1,choice2,choice3;
		String nama,umur,email,uname,passwd;
		double duit;
		Scanner sc = new Scanner(System.in);
		Scanner sc1= new Scanner(System.in);
		do {
		System.out.println("Halo");
		System.out.println("1.Login");
		System.out.println("2.Register");
		System.out.println("3.Check Debit and Card Balance");
		System.out.println("0.Exit");
		System.out.println("Your choice : ");
		choice=sc.nextInt();

		switch (choice) {
		case 1:
			System.out.println("Login");
			System.out.print("Email     : ");
			uname=sc1.nextLine();
			System.out.print("Password  : ");
			passwd=sc1.nextLine();
			if (cs.loginCheck(uname,passwd)==true) {
				do {
				System.out.println("Welcome to Online Shop " + cs.getCustomerName());
				System.out.println("1. Start Shopping");
				System.out.println("2. Top Up Balance");
				System.out.println("3. Show Profile");
				System.out.println("0. Exit");
				System.out.println("Your choice : ");
				choice1=sc1.nextInt();

				switch (choice1) {
				case 1 :
					System.out.println("Choose your product :");
					System.out.println("-----------------------------------------------------------");
					System.out.println("| # | Product Name | Price ($) | Stock |");
					System.out.println("-----------------------------------------------------------");

					for (int i = 0; i < 9; i++) {
						System.out.printf("|%-3d|%-14s|$ %9.2f|%-7d|%n", i + 1,
								listProduct[i].getNama(),
								listProduct[i].getPrice(),
								listProduct[i].getStock()
						);
					}

					do {
					System.out.println("-----------------------------------------------------------");
					System.out.println("99. Show cart");
					System.out.println("0. Back to main menu");
					System.out.print("Your choice : ");
					choice2=sc1.nextInt();

					if (choice2 >= 1 && choice2 <= 10) {
						cs.addToCart(listProduct[choice2-1]);
					} else if (choice2==99) {
						cs.showFromCart();
					System.out.println("0. Checkout");
					System.out.println();
					System.out.println("Your Choice : " );
					choice3=sc1.nextInt();
						if (choice3==0) {
							cs.checkOutFromCart();
							System.out.println("Thank you for your order");
							System.out.println("Press Enter to Continue");
						}
					}
					}while (choice2!=0); 
					break;
				case 2 :
					System.out.println("Top up balance");
					System.out.print("Enter amount : ");
					duit = sc.nextDouble();
					cs.topUpBalance(dc, duit);
					System.out.println("Top up balance succesfully");
					break;
				case 3 :
					System.out.println("Hallo");
					cs.showProfile();
					break;
				default :
					break;
				}
				}while (choice1!=0);	
				System.out.println("Thank You for visiting us");
			}
			else
				System.out.println("Login gagal , password atau email salah");
			break;
		case 2:
			System.out.println("Register");
			System.out.print("Name  : ");
			nama=sc1.nextLine();
			System.out.print("Age   : ");
			umur=sc1.nextLine();
			System.out.print("Email : ");
			email=sc1.nextLine();
			cs = new Customer(nama,umur,email);
			break;
		case 3:
			System.out.println("Debit Card balance : $"+dc.getBalance());
			break;
		default:
			System.out.println("Inputan salah");
			break;
		
		} }while (choice!=0);
		
		
		
		
		
	

	
	
	}
	
}
