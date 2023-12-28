package HW;

public class palindromString {
    public static void main(String[] args) {
        String str ="racecar";
        int n=str.length()/2;
        int count=0;
        for(int i=0;i<n;i++){
            if(str.charAt(i) != str.charAt(str.length()-(i+1))){
                System.out.println("Not Palindrome");
                count ++;
                break;
            }
        }
        if(count ==0 ){
            System.out.println("Palindrome");
        }
    }
}
