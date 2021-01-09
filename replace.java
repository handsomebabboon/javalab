import java.util.Scanner;
public class replace{

    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the string");
        String str = sc.nextLine();
        System.out.println("Enter the string to replace");
        String rep = sc.nextLine();
        System.out.println("Enter the string to repalce it with");
        String nu = sc.nextLine();
        str = str.replace(rep,nu);

        System.out.println("The new string is"+str);
    }
}