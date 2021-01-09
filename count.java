import java.util.Scanner;

public class count{

    public static void main(String args[]){

        System.out.println("Enter the string");
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        str = str.replaceAll("\\W"," ");
        String arr[] = str.split(" ");
        System.out.println("Entr the string count");
        String str2 = sc.nextLine();
        int count = 0;
        for(String s:arr){
            if(s.equals(str2)){
                count++;
            }
        }

        System.out.println(count);
    }
}