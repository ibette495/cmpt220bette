import java.text.DecimalFormat;
	public class q {
		public static void main(String[] args){
			DecimalFormat df = new DecimalFormat("##.##");
			Account account = new Account(1122, 20000);
			account.setAnnualIntrestRate(4.5);
			account.withdraw(2500);
			account.deposit(3000);
			
			System.out.println("Balance is " + df.format(account.getBalance()));
			System.out.println("Monthly intrst is " + df.format(account.getMonthlyIntrestRate()));
			System.out.println("Accont created on " + account.getDateCreated().toString());
			
					
			
		}
	

	}




