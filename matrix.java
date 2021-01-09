import java.util.*;

public class matrix{

    static void display(int A[][],int row_count,int col_count){
        for(int i=0;i<row_count;i++){
            for(int j=0;j<col_count;j++){
                System.out.print(A[i][j] + "\t");
            }
            System.out.println();
        }
    }

    static void multiply(int arr1[][],int row_count1,int col_count1,int arr2[][],int row_count2,int col_count2){

        if(row_count2 != col_count1){
            System.out.println("Multiplication not possible");
            return;
        }

        int res[][] = new int[row_count1][col_count2];

        for(int i=0;i<row_count1;i++){
            for(int j=0;j<col_count2;j++){
                for(int k=0;k<col_count1;k++){
                    res[i][j] += arr1[i][k] * arr2[k][j];
                }
            }
        }

        display(res,row_count1,col_count2);

    }

    public static void main(String args[]){
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter the number of rows in matrix 1");
        int row_count1 = sc.nextInt();
        System.out.println("Enter the number of columns in matrix 1");
        int col_count1 = sc.nextInt();
        System.out.println("Enter the number of rows in matrix 2");
        int row_count2 = sc.nextInt();
        System.out.println("Enter the number of columns in matrix 2");
        int col_count2 = sc.nextInt();
        
        int arr1[][] = new int[row_count1][col_count1];
        int arr2[][] = new int[row_count2][col_count2];

        if(row_count2 != col_count1){
            System.out.println("Not posiible");
            return;
        }
        System.out.println("Enter the elements of matrix 1");
            for(int i=0;i<row_count1;i++){
                for(int j=0;j<col_count1;j++){
                    System.out.println("Enter the element at index:"+"["+(i)+"]"+ "["+(j)+"]");
                    arr1[i][j] = sc.nextInt();
                }
            }

       
        System.out.println("Enter the elements of matrix 2");
            for(int i=0;i<row_count2;i++){
                for(int j=0;j<col_count2;j++){
                    System.out.println("Enter the element at index:"+"["+(i)+"]"+ "["+(j)+"]");
                    arr2[i][j] = sc.nextInt();
                }
            }

        multiply(arr1,row_count1,col_count1,arr2,row_count2,col_count2);
        sc.close();

    }


}