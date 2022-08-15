import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;  // Import the Scanner class

public class main {

    public static void main(String[] args) throws FileNotFoundException { //Start of the program
        //create our scanner
        Scanner scanner = new Scanner(System.in);

        //Prompt the user
        System.out.println("Hello what would you like to do? Your options are 'Deposit' 'Check Amount' 'Withdraw' 'Transfer' Enter 1 for Deposit, 2 for Check Amount, 3 for Withdraw and 4 for Transfer");

        //Creating a new string variable called input, and using the scanner variable .nextLine() methond
        int input = scanner.nextInt();

        //Initialize some variables for use later
        double accountTotal = 0;
        double checkAmount = 0;
        double withdraw = 0;
        double transfer = 0;

        //create a path to the file we want to read.
        //We are just reading their "Last statement" and telling them how much they had during their last statement.
        File file = new File("C:\\Users\\xbrrobbi\\Documents\\statement.txt");

        Scanner sc = new Scanner(file);

        StringBuffer fileContents  = new StringBuffer();

        //converts string to double from the file
        while (sc.hasNext()) {
            fileContents.append(" " + sc.nextLine());
        }

        //If else statement to check what the user inputs and decide what action to take next.
        if (input == 1) {
            System.out.println("How much would you like to deposit?");
            double depositAmount = scanner.nextDouble();
            System.out.println("You have depostied: " + depositAmount);
            accountTotal = depositAmount;

        } else if (input == 2){
            System.out.println("Your checking balance is: " + accountTotal);
            
        } else if (input == 3) {
            System.out.println("How much cash you need for your Hoes? you pimp");
            double withdrawAmount = scanner.nextDouble();
            withdraw = withdrawAmount;
            accountTotal = accountTotal - withdraw;

        } else {
            System.out.println("How much would you like to transfer");
            double userTransfer = scanner.nextDouble();
            accountTotal = accountTotal - userTransfer;
            System.out.println("You have transerred " + userTransfer);
        }
        System.out.println("New account total = " + accountTotal);
        System.out.print("Your most recent statement had a balance of" + fileContents);
    }
}