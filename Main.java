
import java.util.Scanner;
class BankAccount
{
    //Fields (State)
    private String accountHolder;
    private int accountNumber;
    private double balance;

    public BankAccount(String accountHolder,int accountNumber)
    {
        this.accountHolder=accountHolder;
        this.accountNumber=accountNumber;
        this.balance=0.0;
    }

    //public method depoist 
    public void deposit(double amount)
    {
        if(amount>0)
        {
            balance+=amount;
            System.out.println("Depoisted" + amount);
        }
        else
        {
            System.out.println("invalid deposit amount");
        }


    }

    //withdraw 
    public void withdraw(double amount)
    {
        if(amount>0 && amount <=balance)
        {
            balance-=amount;
            System.out.println("withdraw" + amount);
        }
        else{
            System.out.println("invalid withdraw amount");
        }
    }

    public void checkbalance()
    {
        System.out.println("Current balance"+ balance);
    }

    public void showAccountInfo()
    {
        System.out.println("Account holder" +accountHolder);
    }



}
public class Main {
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter Account Holder name:");
        String name=sc.nextLine();
        System.out.println("Enter Account Number:");
        int accNum=sc.nextInt();
        BankAccount ac=new BankAccount(name,accNum);
        
        int choice;
        do {
            System.out.println("1.depoist");
            System.out.println("2.Withdraw");
            System.out.println("3.check balance");
            System.out.println("4.Exit");

            System.out.println("Enter your choice");
            choice=sc.nextInt();

            switch(choice)
            {
                case 1:
                    System.out.println("Enter amount of deposit:");
                    double depoistAmount=sc.nextDouble();
                    ac.deposit(depoistAmount);
                    break;
                case 2:
                    System.out.println("Enter amount to withdrawal:");
                    double withdraw=sc.nextDouble();
                    ac.withdraw(withdraw);
                    break;
                case 3:
                    ac.showAccountInfo();
                    break;
                case 4: 
                   System.out.println("thank you for banking with us");
                   break;
                default:
                   System.out.println("invalid case");

            }


        

        }
        while(choice!=4);

    }
}