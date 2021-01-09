
import java.util.*;
public class account {
    
    int account_num;
    String Name;
    long phone_num;
    float balance;
    static Scanner sc = new Scanner(System.in);

    void getInput(){
         
        System.out.println("Enter the name");
        Name = sc.nextLine();
        System.out.println("Enter the phone number");
        phone_num = sc.nextLong();
        System.out.println("Enter the account number");
        account_num = sc.nextInt();
        System.out.println("Enter the current balance in acoount");
        balance = sc.nextInt();

      
        
      


    }

    void Deposit(){
           
        
        System.out.println("Enter the amoutn you would like to deposit");
       
        int deposit;
        deposit = sc.nextInt();
        System.out.println("Old balance is"+balance);
        balance += deposit;
        System.out.println("new balance is"+ balance);
        
    }

    void Withdraw(){
        System.out.println("Enter the amount to withdraw");
        int with =sc.nextInt();
        if(with > balance){
            System.out.println("invalid withdraw");
            
            return;
        }
        System.out.println("Old balance is "+balance);
        balance -= with;
        System.out.println("New balance is"+balance);
        
    }

    
    public static void main(String args[]){
        account a = new account();

        a.getInput();

        a.Deposit();

        a.Withdraw();


    }
}
