package HW;

import java.util.Scanner;

public class basic3 {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        int n=sc.nextInt();
        int m=5;

        boolean res = (n%m) ==0;
        System.out.println(res);
    }
}
