package hackerrank_solve;
import java.util.Scanner;
public class Squar {
    public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    
        System.out.println("enter array size: ");
        int size = sc.nextInt();
        int[][] arr = new int[size][size];
        
        for(int i=0; i<size; i++){
            for(int j=0; j<size; j++){
                arr[i][j]= sc.nextInt();
            }
        }
        
        int sum1=0,sum2=0,sum3=0,temp;
        for(int i=0; i<size; i++){
            if(i==0 || i==(size-1)){
                for(int j=0; j<size; j++){
                  sum1 = sum1+arr[i][j];  
                }
            }else{
                for(int j=0; j<size; j++){
                    if(j==0 || j==(size-1)){
                        sum1 = sum1+arr[i][j];
                    }else{
                        if(j==1 || j<(size-2)){
                            sum2 = sum2+arr[i][j];
                        }
                    }
                }
            }
        }
        
            System.out.println(sum1);
            System.out.println(sum2);
            System.out.println(sum3);
        
    sc.close();
    }
}
