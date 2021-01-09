import java.lang.Math.*;
import java.util.*;
public class Circle {
    float radius;

    Circle(float radius){
        this.radius = radius;
    }

    float Area(){
        float area = (float)Math.PI * radius * radius;
        return area;
    }

    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter radius");
        int radius = sc.nextInt();

        System.out.println("Enter length of chord to find segment area");
        float length = sc.nextInt();

        System.out.println("Enter the sector angle to find sector area");
        float angle = sc.nextFloat();

        Circle c = new Circle(radius);
        System.out.println("area is:"+c.Area());

        Segment seg = new Segment(length,radius);

        System.out.println("segment area is:"+seg.area());

        Sector sect = new Sector(radius,angle);

        System.out.println("sector area is:"+sect.Area());
        sc.close();
    }
    
}
class Segment extends Circle{
    float length;

    Segment(float length,int radius){
        super(radius);
        this.length = length;
    }

    double area(){
        double area= (((radius*radius)*Math.acos((radius-length)/radius)) - ((radius-length)*Math.sqrt(((2*radius*length)-(length*length)))));
        return area;
    }
}

class Sector extends Circle{

    float angle;
    
    Sector(int radius,float angle){
        super(radius);
        this.angle = angle;
    }

    float Area(){
        float area = (angle*radius*radius)/2;
        return area;
    }
}
