package HW;

import java.util.Scanner;

public class basic2 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int ex=5;

        if(n%ex==0 ){
            System.out.println(true);
        }else{
            System.out.println(false);
        }
    }
}
