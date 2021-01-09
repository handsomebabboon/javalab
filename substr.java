import java.util.*;
public class substr {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        String str1 = sc.nextLine();
    
        System.out.println("Enter the insedex to extract from");
        int ind = sc.nextInt();
        System.out.println("Enter the number of characters to extract");
        int n = sc.nextInt();
        String str2 = str1.substring(ind,ind + n);
    
        System.out.println(str2);
        sc.close();
    }
}
