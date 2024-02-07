public class BankAccount {
    private int accountBalance=10000;
    private int accountNumber=0012;
    private String customerName="Tony";
    private String email="tony.0012@outlook.com";
    private String phoneNumber="+905547895214";

    public int getAccountBalance() {
        return accountBalance;
    }

    public int getAccountNumber() {
        return accountNumber;
    }

    public String getCustomerName() {
        return customerName;
    }

    public String getEmail() {
        return email;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setAccountBalance(int accountBalance)
    {
        this.accountBalance = accountBalance;
    }

    public void setAccountNumber(int accountNumber)
    {
        this.accountNumber = accountNumber;
    }

    public void setCustomerName(String customerName) {
        this.customerName = customerName;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    // Deposit funds function
    // Withdraw funds function
    //BOTH WİLL EFFECT ACCOUNT BALANCE

    public void withdrawFund(int amount)
    {
        if(amount > this.accountBalance) {
            System.out.println("Not enough balance. Please try again.");
        }
        else if (amount<0) {
            System.out.println("Please enter a valid balance.");
        }
        else {
            this.accountBalance -= amount;
            System.out.println("Withdraw successful!");
            System.out.println("New bank balance = " +this.accountBalance);
        }
    }

    public void depositFund(int amount)
    {
        if(amount<0) {
            System.out.println("Please enter a valid balance.");
        }
        else {
            this.accountBalance += amount;
            System.out.println("Deposit successful!");
            System.out.println("New bank balance = " + this.accountBalance);
        }
    }
}

























