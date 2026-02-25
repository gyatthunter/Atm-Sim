import java.util.Scanner; // for user input
public class ATM {

    public static void main(String [] args){
        System.out.print("Welcome to the Atm");
        
        double balance = 1000;                      //Balance variable
        System.out.println("Your Balance Is: " +balance);
        System.out.println("How Much Would You Like To Add");
        Scanner input = new Scanner(System.in);
        int Add = input.nextInt(); 
        balance = balance + Add;
        System.out.println("Your new balance is: " +balance);
    }
}