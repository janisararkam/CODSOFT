import java.util.*;

class BankAccount 
{
 private double balance;
 public BankAccount(double initialBalance)
  {
    this.balance = initialBalance;
  }

 public double getBalance()
  {
   return balance;
 }

public void deposit(double amount) 
{
 balance =balance+amount;
 }

 public boolean withdraw(double amount)
  {
    if (amount <= balance)
     {
    balance=balance-amount;
    return true;
    }
     else
      {
            return false;
      }
}}

class ATM {
    private BankAccount account;

    public ATM(BankAccount account) 
    {
        this.account = account;
    }

    public void withdraw(double amount)
     {
        if (account.withdraw(amount))
         {
            System.out.println("Withdrawal has been done successful !!THANKS FOR CHOOSING OURS BANK!!. Remaining balance: " + account.getBalance());
        } else 
        {
            System.out.println("Insufficient Money. Withdrawal failed.");
        }
    }

    public void deposit(double amount) {
        account.deposit(amount);
        System.out.println("Money Deposit has been done successful. Updated balance: " + account.getBalance());
    }

    public void checkBalance() {
        System.out.println("your Current balance: " + account.getBalance());
    }
}

public class ATMInterface
 {
 public static void main(String[] args) 
 {
 Scanner scanner = new Scanner(System.in);
 BankAccount bankAccount = new BankAccount(1000); 
 ATM atm = new ATM(bankAccount);

 boolean exit = false;

while (!exit) 
 {
  System.out.println("\nAvailable Transaction:");
  System.out.println("\nSelect your transaction:");
  System.out.println("1. Withdraw");
  System.out.println("2. Deposit");
  System.out.println("3. Balance enquiry");
  System.out.println("4. Exit");
  System.out.print("Choose an options: ");

 int choice = scanner.nextInt();

switch (choice) 
{
 case 1:
 System.out.print("Enter Withdrawal Amount: ");
 double withdrawAmount = scanner.nextDouble();
 atm.withdraw(withdrawAmount);
 break;
 case 2:
 System.out.print("Enter Deposit Amount: ");
 double depositAmount = scanner.nextDouble();
atm.deposit(depositAmount);
 break;
 case 3:
atm.checkBalance();
 break;
 case 4:
 exit = true;
System.out.println("Have a nice day !thank you!");
break;
 default:
 System.out.println("Invalid option. Choose Again.");
 }}
scanner.close();
}}
