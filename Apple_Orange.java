package hackerrank_solve;
import java.util.Scanner;
public class Apple_Orange {
    public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    int hs, he, ap, op, na, no,d=100000,md=-100000, count_apple=0, count_orang=0;
    
    hs = sc.nextInt();
    he = sc.nextInt();
    ap = sc.nextInt();
    op = sc.nextInt();
    na = sc.nextInt();
    no = sc.nextInt();
    
    int[] apple = new int[na];
    int[] orang = new int[no];
    
    if(hs<=d && hs>=1 && he<=d && he>=1 && ap<=d && ap>=1 && op<=d && op>=1 && na<=d && na>=1 && no<=d && no>=1 && ap<hs && ap<he && ap<op && hs<he && hs<op && he<op){
        for(int i=0; i<na; i++){
            apple[i] = sc.nextInt();
            if(apple[i]<=d || apple[i]<=md){apple[i] = apple[i]+ap;}else{break;}
        }
        
        for(int i=0; i<no; i++){
            orang[i] = sc.nextInt();
            if(orang[i]<=d || orang[i]<=md){orang[i] = orang[i]+op;}else{break;}
        }
        
        for(int i=0; i<na; i++){
            if(apple[i]>=hs && apple[i]<=he){count_apple++;}
        }
        
        for(int i=0; i<no; i++){
            if(orang[i]>=hs && orang[i]<=he){
                count_orang++;
            }
        }
        
        System.out.println(count_apple);
        System.out.println(count_orang);    
    }
    
    sc.close();
    }
}
