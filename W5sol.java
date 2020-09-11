
import javax.swing.*;

public class ExpenseManager {
	public static void main(String[] args) {
	    int numItems;
	    String inp = JOptionPane.showInputDialog("How many coffee prices?");
	    if (inp == null) {
		    return; // Stop running the program (method main)
	    }
	    numItems = Integer.parseInt(inp);// System.out.println(numItems);
	    double[] coffeePriceList = new double[numItems];
	    String[] coffeeNameList = new String[numItems];
	
	// Get inputs in to the array
	int i = 0;
	while (i < numItems && inp != null) {
		inp = JOptionPane.showInputDialog(null, "Enter name of coffee " + i);
		if (inp != null) {
			coffeeNameList[i] = inp;
		    inp = JOptionPane.showInputDialog(null, "Enter price of " + coffeeNameList[i]);
		    if (inp != null) {
		        coffeePriceList[i]=Double.parseDouble(inp);
		    }
		}
		i = i + 1;
	}
	
	if (inp == null) {
		return;
	}
    // calculate total cost of coffee (can be combined with the input taking step)
	double total=0;
	i = 0;
	while (i < numItems) {
	    total = total+ coffeePriceList[i];
		i = i + 1;	
	}

	// JOptionPane.showMessageDialog(null, "Total cost of coffee: " + total);
	
	// calculating the average
	double average= total/numItems;
	// JOptionPane.showMessageDialog(null, "Average cost of coffee: "+average);
	
	String msg="Total Cost of coffee: " +total+"\n"+"Average cost of coffee: " +average;
	JOptionPane.showMessageDialog(null, msg); 
	// JOptionPane.showMessageDialog(null, "Average cost of coffee: "+average);
	
	//Compare the prices of each coffee against the average price
	msg="";
	i = 0;
	while (i < numItems) {
		if((average - coffeePriceList[i]) > 0)
		{	
		    msg = msg + "Price of " + coffeeNameList[i] + " is " + (average - coffeePriceList[i]) + " cheaper than the average. \n";
		}
		else if ((average - coffeePriceList[i]) < 0)
		{
			msg = msg + "Price of " + coffeeNameList[i] + " is " + (coffeePriceList[i] - average) + " more than the average.\n";	
		}
		else 
		{
			msg = msg + coffeeNameList[i] + " is the same price as the average \n";					
		}
		i = i + 1;
	}
		
	// Finding the minimum and the maximum
	double min = coffeePriceList[0];
	double max = coffeePriceList[0];
	int minIndex = 0;
	int maxIndex = 0;
	i=0;
	while (i < numItems) {
		if (coffeePriceList[i] < coffeePriceList[minIndex])
		{
			minIndex = i;
		}
		if (coffeePriceList[i] > coffeePriceList[maxIndex])
		{
			maxIndex = i;
		}
		i = i + 1;
	}
	
	msg = msg + "\nCheapest coffee is " + coffeeNameList[minIndex] + "( " + coffeePriceList[minIndex]
              + ") and the maxmimum is " + coffeePriceList[maxIndex] + ").";
	 JOptionPane.showMessageDialog(null, msg);
	 
	 //searching for a coffee
	 String target = "";
	 msg = "";
	 while (msg.length() == 0 && target != null) {
		 target=JOptionPane.showInputDialog("Which coffee did you want to search for...");
	     if (target != null) {
		     i = 0;
		     while(i < numItems) {
			     if (coffeeNameList[i].contains(target)) {
				     msg = msg + coffeeNameList[i] + ": " + coffeePriceList[i] + "\n";
			     }
			     i = i + 1;
		     }
	     }
	     if (msg.length() > 0) {
		     JOptionPane.showMessageDialog(null, "Results found ...\n" + msg);;
	     } else {
	         JOptionPane.showMessageDialog(null, "No such coffee found!"); 
	     }
	 }
	}
}
	

