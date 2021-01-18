package hackerrank_solve;
import java.util.Scanner;
public class Kangaru {
    int k1j;
    int k2j;
    
    int k1s;
    int k2s;
    
    boolean b = false;
    int temp;
   
    public void jump(int jk1, int jk2){
       k1j = jk1;
       k2j = jk2;
   }
   
   public void start(int k1s, int k2s){} 
   boolean lcm(){
       if(k1j==k2j){
         b = true;
       }else if(k1j<k2j){
           for(int i=1; i<=10000; i++){
               temp = k2j*i;
               if(temp%k1j==0){b=true;break;}
           }
       }else{
           for(int i=1; i<=10000; i++){
               temp = k1j*i;
               if(temp%k2j==0){b=true;break;}
           }
       }
       return b;
   }
   
   public static void main(String[] args){
       Scanner sc = new Scanner(System.in);
       int kang1 = sc.nextInt();
       int kang2 = sc.nextInt();
       Kangaru k = new Kangaru();
       k.jump(kang1, kang2);
       boolean bb = k.lcm();
       if(bb==true){
           System.out.println("YES");
       }else{System.out.println("NO");}
       
   }
}
