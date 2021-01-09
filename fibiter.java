import java.util.*;

public class fibiter{


    public static void main(String args[]){

        Scanner sc = new Scanner(System.in);
        int t1 = 0, t2 = 1,sum,num;

        System.out.println("enter the number to terms you want");
        
        num = sc.nextInt();

        for(int i=0;i<num;i++){
            System.out.print(t1+"\t");

            sum = t1+t2;
            t1 = t2;
            t2 = sum;

        }

        sc.close();


    }
}