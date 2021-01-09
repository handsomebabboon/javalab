import java.util.Scanner;

public class bubsort {
    
    int[] sort(int arr[]){
        int temp;
        int n = arr.length;
        for(int i=0;i<n;i++){
            for(int j=0;j<n-i-1;j++){
                if(arr[j] > arr[j+1]){
                    temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                }
            }
        }

        return arr;

    }

    void display(int arr[]){
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+"\t");
        }
    }

    public static void main(String args[]){
        bubsort ob = new bubsort();
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number of elements of the array");
        int size = sc.nextInt();
        int arr[] = new int[size];
        for(int i=0;i<size;i++){
            System.out.print("enter element at position"+(i+1)+":");
            arr[i] = sc.nextInt();
        }
        ob.sort(arr);
        System.out.println("Sorted array");
        ob.display(arr);


        sc.close();
    }
}
