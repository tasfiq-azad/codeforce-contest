public class CodeForcesC {
    
    public static void main(String[] args) {
        
        String str="abacaba";
         String newStr="";
        for(int i=0;i<str.length();i++){
           char ch=str.charAt(i);
           if((i+1)<=str.length() || (i+2)<=str.length()){
            char ch2=str.charAt(i+1);
            char ch3=str.charAt(i+2);
           }
           
             
        }
        System.out.println(newStr);
    }
}
