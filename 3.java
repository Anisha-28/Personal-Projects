package week3tute;
import java.util.Scanner; 
public class Exercise2week3 {
	
	
   public static void main(String[] args) { 
	   
	       Scanner myObj = new Scanner(System.in); 
	       System.out.println("Enter username");

	       String userName = myObj.nextLine();  
	       System.out.println("Username is: " + userName); 
	  // Reference - https://www.w3schools.com/java/java_user_input.asp

	   
	String str = "Java String";
	char ch = 'v';
	char ch2 = 'S';
	
	String subStr = "ing";
	int posOfv = str.indexOf(ch);
	int posOfS = str.indexOf(ch2);
	int posOfSubstr = str.indexOf(subStr);
	System.out.println(posOfv);
	System.out.println(posOfS);
	System.out.println(posOfSubstr);
	
	if (ch == ch2) {
		System.out.println("You are wrong.");
	}
	else { 
		System.out.println("You are correct.");
	}
	// Reference - https://beginnersbook.com/2013/12/java-string-indexof-method-example/
   }  
}
