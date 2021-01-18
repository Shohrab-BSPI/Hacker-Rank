package hackerrank_solve;
import java.util.Scanner;
public class Triangle { 
    public static void main(String[] args){
     Scanner sc = new Scanner(System.in);
        System.out.println("Enter the numbers of line: ");
        int n=sc.nextInt();
        
        for(int i=0; i<n; n++){
            for(int k=0; k<i-1; k++){
                System.out.println(" ");
            }
            
            for(int j=0; j<=i+1;){
                System.out.println(" ");
            }
        }
     
        
        
    }
}
