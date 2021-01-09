import java.util.Scanner;

public class Stack {
    
    int top;
    int MAX;
    int stk[];

    Stack(int n){
        top = -1;
        MAX = n;
        stk = new int[MAX];
    }

    void push(int x){
        if(top == MAX -1){
            System.out.println("Satck is full");
            return;
        }
        stk[++top] = x;
    }

    void pop(){
        if(top == -1){
            System.out.println("Stack is empty");
            return;
        }
        top--;
    }

    void display(){

        if(top == -1){
            System.out.print("Empty!");return;
        }
        System.out.print("Top ->"+"\t");
        
        int temp = top;

        while(temp >=0){
            System.out.print(stk[temp]+"\t");
            temp--;
        }
    }

    public static void main(String args[]){
        
        Stack s = new Stack(5);

        int choice = 99;
        int ins;
        Scanner sc= new Scanner(System.in);
        while(choice != 4){
           
            System.out.println("Enter choice 1- push 2-pop 3-display 4-exit");
            choice = sc.nextInt();
            switch(choice){
                case 1:
                    System.out.println("Enter number to isert");
                    ins = sc.nextInt();
                    
                    s.push(ins);break;

                case 2:s.pop();break;

                case 3:s.display();break;

                case 4:return;



            }
        }
        sc.close();

    }
}
