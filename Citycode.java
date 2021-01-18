package hackerrank_solve;
import java.util.Scanner;
public class Citycode {
    public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
        System.out.println("Enter your size: ");
        int size = sc.nextInt();
        int[][] arr = new int[size][size];
        int sum1=0;
        
        for(int i=0; i<size; i++){
            for(int j=0; j<size; j++){
                arr[i][j] =sc.nextInt();
            }
        }
    
        int sum3=0,temp=0,sum2=0;
        temp = size/2;
        for(int i=0; i<size; i++){
            if(i==0 || i==(size-1)){
                    for(int j=0; j<size; j++){
                        sum1 = sum1+arr[i][j];
                    }
                }else{
                    for(int j=0; j<size; j++){
                    if(j==0 || j==(size-1)){
                        sum1= sum1+arr[i][j];
                    }
                }
            }
            
            for(int j=0; j<size; j++){                
                //center
                if(size%2==0){
                    break;
                }else if(j==temp && i==j){sum3 = arr[i][j];}
                
            }
        }
        
        for(int i=1; i<arr.length-1; i++){
            for(int j=1; j<size-1; j++){
                sum2 = sum2+arr[i][j];
            }
        }
        
        System.out.println(sum1);
        System.out.println(sum2-sum3);
        System.out.println(sum3);
    sc.close();
    }
}
