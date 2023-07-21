import java.util.Scanner;

public class CodeForces1 {
    
    public static void main(String[] args) {
         Scanner scn=new Scanner(System.in);
          int n=scn.nextInt();
          String love="codeforces";
          int count=0;
            
          for(int i=0;i<n;i++){
            String s=scn.next();
            count=0;
            for(int j=0;j<s.length();j++){
                if(s.charAt(j)!=love.charAt(j)){
                    count++;
                }
              
               
              }
              System.out.println(count);
            //   System.out.println(rev);
          }
        
          
         
    }
}
