
package problem10.ISE;
import java.util.*;
import problem10.Department;
import problem10.Faculty;
public class ISE_department implements Department{
    Scanner sc = new Scanner(System.in);

    class myException extends Exception{

    }
    public void readData(Faculty F){
       
        try{
            System.out.println("Enter the name of faculty");
            F.name = sc.nextLine();
            System.out.println("Enter the designation of faculty");
            F.designation = sc.nextLine();
            System.out.println("Enter the join data of facutly");
            F.join_date = sc.nextLine();
            System.out.println("Enter the subjects taught");
            F.subjects_handled = sc.nextLine();
            System.out.println("Enter the number of research consultancy projects");
            F.num_of_reasearchconsultancyprojs = sc.nextInt();
            System.out.println("Entrer the number of years of experience");
            F.years_of_experience = sc.nextInt();
            System.out.println("Enter the number of designations");
            F.num_of_designations = sc.nextInt();
            System.out.println("Enter the age of faculty");
            int tempage=sc.nextInt();
            sc.nextLine();
            if(tempage >= 58){
                throw new myException();
            }
        }catch(myException e){
            int t;
            do{
                System.out.println("Age is greater athan 58!enter age once again!!!!!!");
                t=sc.nextInt();
            }while(t>=58);
            F.age = t;
        }
    }
    public void printData(Faculty F){
        System.out.println(" name of faculty"+F.name);
        
        System.out.println("designation of faculty"+F.designation);
       
        System.out.println("join data of facutly"+F.join_date);
        
        System.out.println("subjects taught"+F.subjects_handled);
        
        
       
        System.out.println("number of years of experience"+F.years_of_experience );
       
        printNumberdesignations(F);
        printnumber_research_consultancy_projects(F);
        System.out.println(" age of faculty"+F.age);


        
    }
    public void printNumberdesignations(Faculty F){
        System.out.println(" number of designations"+F.num_of_designations);
    }
    public void printnumber_research_consultancy_projects(Faculty F){
        System.out.println(" number of research consultancy projects"+F.num_of_reasearchconsultancyprojs);
    }
}
