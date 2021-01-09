import java.util.*;
public class L{

    public static void main(String args[]){
        LinkedList<String> ll = new LinkedList<>();
        int choice;
        Scanner sc = new Scanner(System.in);
        while(true){
            System.out.println("Enter an option 1-add string \n 2-print all \n 3-print all with less than 5 characters\n");
            choice = sc.nextInt();
            sc.nextLine();
            switch(choice){
                case 1:
                System.out.println("Enter string to isnert");
                String x = sc.nextLine();
                ll.add(x);
                break;
            
                case 2:
                Iterator<String> itr = ll.iterator();

                while(itr.hasNext()){
                    System.out.println(itr.next());
                }
                break;

                case 3:
                Iterator<String> itr2 = ll.iterator();
                String str ="";

                while(itr2.hasNext()){
                    str=itr2.next();
                    if(str.length()<5){
                        System.out.println(str);
                    }
                }
                break;

                case 4:return;
            }
        }
    }
}