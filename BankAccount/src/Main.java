import java.util.Scanner;

public class Main {
    public static void main(String[] args)
    {
        int inputInteger = -1;
        String inputString="";

        Scanner scanner = new Scanner(System.in);
        BankAccount account = new BankAccount();

        System.out.println("What do you want to do? -withdraw fund = press 0 - deposit fund = press 1");
        inputString = scanner.nextLine();
        inputInteger = Integer.parseInt(inputString);
        if(inputInteger == 0)
        {
            String withdrawAmount_String="";
            int withdrawAmount_Integer=0;
            System.out.println("Enter amount of withdraw?");
            withdrawAmount_String = scanner.nextLine();
            withdrawAmount_Integer = Integer.parseInt(withdrawAmount_String);
            account.withdrawFund(withdrawAmount_Integer);
        }
        else if(inputInteger == 1)
        {
            String depositAmount_String="";
            int depositAmount_Integer=0;
            System.out.println("Enter amount of deposit?");
            depositAmount_String = scanner.nextLine();
            depositAmount_Integer = Integer.parseInt(depositAmount_String);
            account.depositFund(depositAmount_Integer);
        }
        else //if(inputInteger == -1 or ...);
            System.out.print("Invalid type. Please try again.");
    }
}