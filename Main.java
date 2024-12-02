import java.util.Scanner;

public class Main
{
	public static void main(String[] args) {
	    
	Scanner scan = new Scanner(System.in); 
    
    // everything you need to find where the names start and end
    System.out.println("What is your full name? You need to list a middle name.");
    String name = scan.nextLine();
    int space = name.indexOf(" ");
    
    // how to get the names and store them into variables
    String firstName = name.substring(0, space);
    String midName = name.substring(space++, name.indexOf(" ", space));
    String lastName = name.substring(name.indexOf(" ", space));
    
    // print it out
    System.out.println("|| First Name: " + firstName + " ||" + " Middle Name:" + midName + " || Last Name:" + lastName + " ||");
    
	}
}
