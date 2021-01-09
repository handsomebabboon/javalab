package problem10;
import problem10.ISE.ISE_department;
import problem10.Faculty;
import java.util.*;
import problem10.Department;
public class MainClass {
   public static void main(String args[]){
    Faculty F[] = new Faculty[20]; 
    ISE_department ise = new ISE_department();
    int choice;
    boolean flag1=false;
    boolean flag2=false;
    int count=0;

    Scanner sc = new Scanner(System.in);
    while(true){
        System.out.println("1-enter details of faculty \n 2- print details of all faculty\n 3-print details of experience dfaculty \n4-exit");
        choice = sc.nextInt();

        switch(choice){
            case 1:
            F[count] = new Faculty();
            ise.readData(F[count]);
            count++;
            break;

            case 2:
            if(count == 0){
                System.out.println("no teacher entered");
                break;
            }
            for(int i=0;i<count;i++){
                ise.printData(F[i]);
            }
            break;

            case 3:
            if(count == 0){
                System.out.println("no teacher entered");
                break;
            }
            for(int i=0;i<count;i++){
                if(F[i].years_of_experience>=20){
                    ise.printData(F[i]);
                    flag1 = true;
                }

            }
            if(flag1 == false){
                System.out.println("No staff with more than 20 yoe");
            }
            break;

            case 4:return;

        }


    }


   }
}
