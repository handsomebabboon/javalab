package p10.ISE;
import p10.Department;
import p10.Faculty;
import java.util.Scanner;
public class ISE_Department implements Department{
    Scanner sc = new Scanner(System.in);
    class myException extends Exception{
       
    }
    
        public void readData(Faculty f){
            try{
            System.out.println("Enter the name of faculty");
            f.name = sc.nextLine();
            System.out.println("Enter the designation of faculty");
            f.designation = sc.nextLine();
            System.out.println("Enter the join data of facutly");
            f.join_date = sc.nextLine();
            System.out.println("Enter the subjects taught");
            f.subjects_handled = sc.nextLine();
            System.out.println("Enter the number of research consultancy projects");
            f.number_of_resseasrch_consultancy_projs = sc.nextInt();
            System.out.println("Entrer the number of years of experience");
            f.years_of_experience = sc.nextInt();
            System.out.println("Enter the number of designations");
            f.number_of_designations= sc.nextInt();
            System.out.println("Enter the age of faculty");
            int tempage=sc.nextInt();
            sc.nextLine();
            if(tempage <58){
                f.age = tempage;
            }else{
                throw new myException();
            }}catch(myException e){
            int t;
        do{
            System.out.println("Invalid input!");
            t=sc.nextInt();
        }while(t>= 58);
    } 
}
        
        public void printData(Faculty f){
            System.out.println("Enter the name of faculty");
         
            System.out.println("Enter the designation of faculty");
            
            System.out.println("Enter the join data of facutly");
           
            System.out.println("Enter the subjects taught");
            
            print_number_designations(f);
            number_research_constultancy_projs(f);
            System.out.println("Entrer the number of years of experience");
           
            System.out.println("Enter the number of designations");
          
            System.out.println("Enter the age of faculty");
          
        }
        public void print_number_designations(Faculty f){
            System.out.println("Nmber of designations is :"+f.number_of_designations)
        }
        public void number_research_constultancy_projs(Faculty f){
            System.out.println("Enter the number of research consultancy projects:"+f.number_of_resseasrch_consultancy_projs);
        }
    
}