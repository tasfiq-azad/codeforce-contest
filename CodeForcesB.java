import java.util.Scanner;

public class CodeForcesB {
    
    public static void main(String[] args) {
        
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
       int m=0;
       int bi=0;
       
        for(int i=0;i<n;i++){
            int b=sc.nextInt();
            
            for(int j=0;j<b;j++ ){
                int c=sc.nextInt();
                if(c%2==0){
                    m+=c;
                }
                else{
                    bi+=c;
                }
            }
             if(m<=bi){
                System.out.println("NO");
             }
             else{
                System.out.println("YES");
             }
             m=0;
             bi=0;
        }
        
        
    }
}
