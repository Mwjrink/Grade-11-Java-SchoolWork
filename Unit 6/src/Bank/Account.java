package Bank;
import java.text.NumberFormat; 

public class Account {
		private double balance; 
		private Customer cust; 

		public Account(double bal, String aName, String bName,String str, String city, String st, String zip) 
		{ 
			balance = bal; 
			cust = new Customer(aName, bName, str, city, st, zip); 
		}

		public double getBalance() 
		{
			return(balance); 
		}

 
		public void deposit(double amt) 
		{ 	
			balance += amt; 
		}

		public void withdrawal(double amt) 
		{ 
			if (amt <= balance) { 
				balance -= amt; 
			}
				else { 
					System.out.println("Not enough money in account."); 
			}
		}
		
		public void changeAddress(String str, String city, String st, String zip)
		{
			cust.changeStreet(str);
			cust.changeCity(city);
			cust.changeState(st);
			cust.changeZip(zip);
		}
		
		public String toString() 
		{
		String accountString; 
		NumberFormat money = NumberFormat.getCurrencyInstance(); 

		accountString = cust.toString(); 
		accountString += "Current balance is " + money.format(balance); 
		return (accountString); 
			}
}
