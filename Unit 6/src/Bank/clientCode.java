package Bank;
import java.util.Scanner; 
import java.text.NumberFormat; 

	public class clientCode {
	public static void main(String[] args) 
	{ 
		Account munozAccount = new Account(250, "Maria", "Munoz", "110 Glades Road", "My town", "FL", "33445"); 
		Scanner input = new Scanner(System.in); 
		double data; 
		NumberFormat money = NumberFormat.getCurrencyInstance(); 

		System.out.println(munozAccount);

		System.out.print("Enter deposit amount: "); 
		data = input.nextDouble(); 
		munozAccount.deposit(data); 
		System.out.println("Balance is: " + money.format(munozAccount. getBalance ())); 
		System.out.print("Enter withdrawal amount: ");
		data = input.nextDouble(); 
		munozAccount.withdrawal(data); 
		System.out.println("Balance is: " + money.format(munozAccount.getBalance())); 
		String str, city, st, zip;
		System.out.print("Please enter your street name: ");
		str = input.next();
		System.out.print("Please enter your city: ");
		city = input.next();
		System.out.print("Please enter your state: ");
		st = input.next();
		System.out.print("Please enter your zip code: ");
		zip = input.next();
		input.close();
		munozAccount.changeAddress(str, city, st, zip);
		System.out.print(munozAccount);
	}
}
	