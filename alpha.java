import java.util.*;
public class alpha {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enteer a string to rearrange");
        String str=sc.nextLine();
        char arr[] = str.toCharArray();
        Arrays.sort(arr);
        String str1 = new String(arr);
        System.out.println(str1);
        

    }
}
