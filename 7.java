
public class SavingsAccount {
	private String ID;
    private String Name;
    private double Balance;
    
	public SavingsAccount(String ID, String Name , double Balance) {
		this.ID=ID;
		this.Name=Name;
		this.Balance=Balance;
		
	}

	public String getName() {
		// TODO Auto-generated method stub
		return this.Name;
	}

	public String getID() {
		
		// TODO Auto-generated method stub
		return this.ID;
	}

	public boolean withdraw(int i) {
		// TODO Auto-generated method stub
		if(i < this.Balance) {
			this.Balance = this.Balance - i;
			return true;
		}
		else {
			return false;
		}
		
	}

	public void deposit(int i) {
		if (this.Balance > 0) {
			this.Balance= this.Balance+i;
		}
		
		// TODO Auto-generated method stub
		
	}

	public boolean transfer(SavingsAccount person0, int i) {
		// TODO Auto-generated method stub
		if (i < this.Balance) {
			this.Balance = this.Balance - i;
			person0.Balance = person0.Balance + i;
			return true;
		}
		else {
			return false;
		}
		
		
	}

	public double getBalance() {
		// TODO Auto-generated method stub
		return this.Balance;
	}



	
}
