import java.util.Scanner;

class BankAccount {
    private String accNo;
    private double bal;

    public BankAccount(String accNo,double bal) {
        this.accNo=accNo;
        this.bal=bal;
    }

    public void deposit(double amt) {
        if(amt>0) {
            bal+=amt;
            System.out.println("Deposited:"+amt);
        }
    }

    public void withdraw(double amt) {
        if(amt>0&&amt<=bal) {
            bal-=amt;
            System.out.println("Withdrawn:"+amt);
        }else {
            System.out.println("Invalid amount or insufficient balance");
        }
    }

    public double getBalance() {
        return bal;
    }

    public String getAccNo() {
        return accNo;
    }
}

public class Bank {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);

        System.out.print("Enter Acc No:");
        String n=sc.next();
        System.out.print("Enter Initial Balance:");
        double b=sc.nextDouble();

        BankAccount ac=new BankAccount(n,b);

        System.out.print("Enter amount to deposit:");
        ac.deposit(sc.nextDouble());

        System.out.print("Enter amount to withdraw:");
        ac.withdraw(sc.nextDouble());

        System.out.println("Final Balance for "+ac.getAccNo()+":"+ac.getBalance());
        
        sc.close();
    }
}
