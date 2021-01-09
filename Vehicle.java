public abstract class Vehicle {
    int year_of_manufacture;

    Vehicle(){

    }
    Vehicle(int data){
        year_of_manufacture = data;
    }

    abstract int getData();
    abstract void putData(int data);

    
    public static void main(String args[]){
        MyTwoWheeler jeff = new MyTwoWheeler(2000);

        System.out.println(jeff.year_of_manufacture);
    }
}

class TwoWheeler extends Vehicle{

    TwoWheeler(int data){
        super(data);
    }

    int getData(){
        return this.year_of_manufacture;
    }
    
    void putData(int data){
        this.year_of_manufacture = data;
    }

}

final class FourWheeler extends Vehicle{

    int getData(){
        return this.year_of_manufacture;
    }
    
    void putData(int data){
        this.year_of_manufacture = data;
    }
}

class MyTwoWheeler extends TwoWheeler{
    MyTwoWheeler(int data){
        super(data);

    }
}