import java.util.*;

public class q {
    
    static ArrayList<String> queue = new ArrayList<>();

    static void enqueue(String x){
        queue.add(x);
    }

    static void dequeue(){
        if(queue.isEmpty()){
            System.out.println("queue is rmpty");
            return;
        }
        queue.remove(0);
    }

    static void print(){
        if(queue.isEmpty()){
            System.out.println("queue is rmpty");
            return;
        }
        for(int i=0;i<queue.size();i++){
            System.out.println(queue.get(i));
        }
    }

        
    public static void main(String args[]){
        enqueue("Hello");
        enqueue("there");
        enqueue("Hello");
        enqueue("there");
        dequeue();
        print();
    }
}
