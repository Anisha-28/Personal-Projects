import javax.swing.JOptionPane;

public class BankApp {
	
	private SavingsAccount []clients;
	private int ClientNumber;
	
	public BankApp() {
		ClientNumber = Integer.parseInt(JOptionPane.showInputDialog("Enter the number of clients: ")  );
		this.clients = new SavingsAccount[ClientNumber];

		int i = 0;
		while (i < ClientNumber) {
			addClients(i);
			i++;
		}
		
		String ChooseOption = JOptionPane.showInputDialog("Do you want to see Clients information?");
		if (ChooseOption.contains("yes")) {
			i = 0;
			while (i < ClientNumber) {
				displayClients(i);
				i++;
			}
		}
	}
	
	public void addClients(int i) {
		String ID = JOptionPane.showInputDialog("ID: ");
		String Name = JOptionPane.showInputDialog("Name: ");
		int Balance = Integer.parseInt(JOptionPane.showInputDialog("Balance: ") );
		
		clients[i] = new SavingsAccount(ID, Name, Balance);
	}
	
	public void displayClients(int i) {
		System.out.println("Client " + (i+1));
		System.out.println("ID: " + clients[i].getID());
		System.out.println("Name: " + clients[i].getName());
		System.out.println("Balance: " + clients[i].getBalance());
		System.out.print("\n");
	}
	
	public static void main(String args[]) {
		BankApp ba = new BankApp();
	}
	
}