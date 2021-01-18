package hackerrank_solve;
import java.util.Scanner;
public class Disible_sum_pair {
  
    int pair(int[] n, int k){
        int count = 0;
        if((2<=n.length && n.length<=100)&&(1<=k && k<=100)){
            for(int i=0; i<n.length-1; i++){
            for(int j=i+1; j<n.length; j++){
                if((n[i]+n[j])%k==0){
                    count = count+1;
                }
            }
        }
        }
        return count;
    }
    
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int size = sc.nextInt();
        int key = sc.nextInt();
        
        int[] arr = new int[size];
        for(int i=0; i<arr.length; i++){
            arr[i] = sc.nextInt();
        }
        Disible_sum_pair obj = new Disible_sum_pair();
        obj.pair(arr, key);
        int result = obj.pair(arr, key);
        System.out.println(result);
        
     }
}
