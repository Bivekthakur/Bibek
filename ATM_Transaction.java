import java.util.Scanner;

public class ATM_Transaction {
    public static void main(String[] args) {

        int balance = 5000, withdraw, deposit;
        Scanner sc =new Scanner(System.in);
        while(true){
            System.out.println("Automated Teller mmachine");
            System.out.println("choose 1 for withdraw");
            System.out.println("choose 2 for Deposit");
            System.out.println("choose 3 for check balance");
            System.out.println("choose 4 for Exit");
            System.out.println("choose the operation you want to perform");
            int n = sc.nextInt();
            switch(n)
            {
                case 1:
                    System.out.println("Enter money to be withdrawn");
                    withdraw = sc.nextInt();
                    if(balance >= withdraw)
                    {
                        balance = balance - withdraw;
                        System.out.println("please collect your money");

                    }
                    else
                    {
                        System.out.println("Insufficent balance");

                    }
                    System.out.println("");
                    break;
                case 2:
                    System.out.println("Enter money to be Deposit");
                    deposit = sc.nextInt();
                    balance = balance + deposit;
                    System.out.println("your money has sucessfully deposited");
                    System.out.println("");
                    break;
                case 3:
                    System.out.println("balance :"+balance);
                    System.out.println("");
                    break;
                case 4:
                    System.exit(0);

            }

        }


    }

}