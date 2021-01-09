import java.util.*;
public class fibrec {

    static int fib(int n){
        if(n == 0){
            return 0;
        }
        if(n == 1 || n == 2){
            return 1;
        }
        return fib(n-2) + fib(n-1);

    }

    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Enter the numer of terms you want");
        int num = sc.nextInt();
        for(int  i=0;i<num;i++){
            System.out.println(fib(i)+"\t");
        }
        sc.close();
    }
}
