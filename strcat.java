import java.util.*;



public class strcat {
    public static void  main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter first string");
        String str1 = sc.nextLine();

        System.out.println("Enter second string");

        String str2 = sc.nextLine();

        str1+=str2;

        System.out.println(str1);

    }
}
