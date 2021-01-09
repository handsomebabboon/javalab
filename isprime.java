import java.util.*;

public class isprime {
    


    public static void main(String args[]){

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the number to check prime");

        int num = sc.nextInt();

        if(num == 1){
            System.out.println("Number is neither prime no r composite");
        }
        else{
            boolean flag = false;

            for(int i=2;i<=num/2;i++){
                if(num % i == 0){
                    flag = true;
                    break;
                }
            }
            if(flag){
                System.out.println("Number is not prime");
            }
            else{
                System.out.println("Number is prime");
            }
        }
    }
}
