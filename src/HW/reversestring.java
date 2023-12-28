package HW;

public class reversestring {
    public static void main(String[] args) {
        String s ="ankit";
        String s2="";
        char ch;
         for(int i=s.length()-1;i>=0;i--){
             ch = s.charAt(i);

             s2 = s2+ch;
         }
        System.out.println(s2);
    }
}