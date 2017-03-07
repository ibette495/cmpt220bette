import java.util.Date;
class Account{
			private int id;
			private double balance;
			private double annualIntrestRate;
			private Date dateCreated;
		Account(){
			id = 0;
			balance = 0;
			annualIntrestRate = 0;
			dateCreated = new Date();
			
		}
		Account(int ID, double BALANCE){
			id = ID;
			balance = BALANCE;
			dateCreated = new Date();
			
		}
		public int getID(){
			return id;
		}
		public double getBalance(){
			return balance;
		}
		public double getAnnualIntrestRate(){
			return annualIntrestRate;
		}
		public void setId(int id){
			this.id = id;
		}
		public void setBalance(double balance){
			this.balance = balance;
		}
		public void setAnnualIntrestRate(double annualIntrestRate){
			this.annualIntrestRate = annualIntrestRate;
		}
		public Date getDateCreated(){
			return dateCreated;
		}
		public double getMonthlyIntrestRate(){
			return annualIntrestRate/12.0;
		}
		public void withdraw(double amount){
			balance = balance - amount;
		}
		public void deposit(int x){
			
		}
}

