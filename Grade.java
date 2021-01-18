package hackerrank_solve;
import java.util.Scanner;
public class Grade {
    public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
        System.out.println("Enter your array size: ");
        int size = sc.nextInt();
        int num;
        if(size>=1 || size<=60){
            //for input element
        int[] farr = new int[size];
        int[] sarr = new int[size];
        
        for(int i=0; i<size; i++){
            farr[i] = sc.nextInt();
        }
    
        for(int i=0; i<size; i++){
            if(farr[i]>=0 || farr[i]<=100){
                if(farr[i]>37){
                if(farr[i]%5==0){
                    sarr[i] = farr[i];
                }else{
                    for(int s=1; s<3; s++){
                        num = farr[i]+s;                                               
                        if(num%5==0){
                        sarr[i] = num;
                        break;
                        }else{sarr[i]=farr[i];}
                    }                  
                }
            }else{sarr[i]=farr[i];}
            }            
        }
       
        for(int i=0; i<size; i++){
            System.out.println(sarr[i]+" ");
            }
        }       
    sc.close();
    }
}
