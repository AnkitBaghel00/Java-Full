package HW;

import java.util.Scanner;

public class combineString {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter s1 :");
        String s1 = sc.next();
        System.out.println("Enter s2 :");
        String s2 = sc.next();

        String s3 = s1+s2;

        System.out.println("s1 ="+s1);
        System.out.println("s2 ="+s2);
        System.out.println("s3 ="+s3);

    }
}
