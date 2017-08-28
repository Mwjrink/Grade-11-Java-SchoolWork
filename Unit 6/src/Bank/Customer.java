package Bank;

public class Customer {
		private String firstName, lastName, street, city, state, zip; 

		public Customer(String aName, String bName, String str, 
		String c, String s, String z) 
		{ 	
			firstName = aName; 
			lastName = bName; 
			street = str; 
			city = c; 
			state = s; 
			zip = z; 
			}
		public void changeStreet(String a)
		{
			street = a;
		}
		public void changeCity(String a)
		{
			city = a;
		}
		public void changeState(String a)
		{
			state = a;
		}
		public void changeZip(String a)
		{
			zip = a;
		}


			public String toString() 
			{
				String custString; 

				custString = firstName + " " + lastName +  "\n";
				custString += street +  "\n";
				custString += city + ",  " + state + "   " + zip +  "\n";
				return(custString); 
		}
}
