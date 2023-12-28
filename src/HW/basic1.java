package HW;

import java.util.Scanner;

public class basic1 {
    public static void main(String[] args) {

        Scanner sc =new Scanner(System.in);
        System.out.println("Enter a number to check it is even or odd");
        int n=sc.nextInt();

        if(n%2 ==0){
            System.out.println("It is even");
        }else{
            System.out.println("Odd");
        }

    }
}
