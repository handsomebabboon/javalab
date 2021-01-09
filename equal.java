import java.util.*;

public class equal {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);

        String str1 = sc.nextLine();
        String str2 = sc.nextLine();
    
        str1 = str1.toLowerCase();
        str2 = str2.toLowerCase();
    
        if(str1.equals(str2)){
            System.out.println("They are equal");
        }
        else{
            System.out.println("Not equal");
        }

        sc.close();
    }
}
