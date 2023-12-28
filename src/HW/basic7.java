package HW;

import java.util.Scanner;

public class basic7 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number to print the multiplication table : ");
        int n1=sc.nextInt();
        int inn=1;

        while(inn<=10){
            System.out.println(n1+"*"+inn+" = "+n1*inn);
            inn++;
        }
    }
}
