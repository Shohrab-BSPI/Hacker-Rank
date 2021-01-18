package hackerrank_solve;
import java.util.Scanner;
public class Number_Line_Jumps {
    
    int k1=0, k2=0,k1_j=0,k2_j=0;
    void location(int x1, int v1, int x2, int v2){
        k1 = x1;
        k2 = x2;
        k1_j = v1;
        k2_j = v2;
        boolean b = false;
        if((0<=k1 || k1<=10000) && (k1<k2 || k2<=10000)){
            for(int i=0; i<=10000; i++){
                k1 = k1+k1_j;
                k2 = k2+k2_j;
                
                if(k1==k2){
                    b = true;
                    break;
                }
            }
            if(b==true){
                System.out.println("YES");
            }else{
                System.out.println("NO");
            }
        }
    }
    
    
    public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    Number_Line_Jumps obj = new Number_Line_Jumps();
    int k1_x = sc.nextInt();
    int k1_v = sc.nextInt();
    int k2_x = sc.nextInt();
    int k2_v= sc.nextInt();
    
    obj.location(k1_x, k1_v, k2_x, k2_v);
    sc.close();   
    }
}
