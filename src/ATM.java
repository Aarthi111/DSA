import java.util.Scanner;

public class ATM {
    static void Atm_process(String name,int pin) {
        int choice;
        int balance=2000;
        System.out.println("Welcome to PSR bank");
        if (name=="PSR" && pin == 89) {
            do {
                System.out.println("-------------------------------------------------");
                System.out.println("1.Deposit");
                System.out.println("2.Withdraw");
                System.out.println("3.Balance");
                System.out.println("4.Exit");
                System.out.println("Enter your choice :");
                Scanner sc = new Scanner(System.in);
                choice = sc.nextInt();
                if (choice ==1){
                    System.out.println("Enter amount to deposit");
                    int amount = sc.nextInt();
                    balance +=amount;
                }
                else if(choice==2){
                    System.out.println("Enter amount to withdraw");
                    int amount = sc.nextInt();
                    if(amount<=balance){
                        balance-=amount;
                        System.out.println(amount+" Withdrawn Successfully");
                    }
                    else{
                        System.out.println("Not sufficeent balance");
                    }
                }
                else if(choice==3){
                    System.out.println("Balance = "+balance);
                }
            } while (choice != 4);

        }
    }
    public static void main(String[] args) {
        String name="PSR";
        int pin = 89;
        Atm_process(name,pin);


    }

}
