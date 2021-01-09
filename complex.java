import java.util.Scanner;

public class complex {
    
    float real,imag,x1,x2,y1,y2;
    Scanner sc = new Scanner(System.in);
    complex(){
        System.out.println("Enter the value of x1");
        x1=sc.nextInt();
        System.out.println("Enter value of y1");
        y1 = sc.nextInt();
        System.out.println("Enter the value of x2");
        x2=sc.nextInt();
        System.out.println("Enter value of y2");
        y2 = sc.nextInt();
        
    }
    void add(){
        imag = y1+y2;
        real = x1+x2;

        System.out.println("sum is : "+real+" + "+imag+"i");
    }

    void subtract(){
        imag = y1-y2;
        real = x1-x2;

        System.out.println("Difference is:"+real+" + "+imag+"i");
    }

    void multiply(){
        imag = x1*y2 + x2*y1;
        real = x1*x2 - y1*y2;

        System.out.println("productis:"+real+" + "+imag+"i");
    }

    public static void main(String args[]){
        complex c = new complex();

        c.add();
        c.subtract();
        c.multiply();

    }

}
