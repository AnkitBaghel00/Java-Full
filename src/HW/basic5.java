package HW;

import java.util.Scanner;

public class basic5 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);

        int size=0;

        while(size<5){
            System.out.println("Enter num");
            int n=sc.nextInt();
            switch (n){
                case 1:
                    System.out.println("One");
                    break;
                case 2:
                    System.out.println("Two");
                    break;
                case 3:
                    System.out.println("Three");
                    break;
                case 4:
                    System.out.println("Four");
                    break;
                case 5:
                    System.out.println("FIve");
                    break;
                case 6:
                    System.out.println("Six");
                    break;
                case 7:
                    System.out.println("Seven");
                    break;
                case 8:
                    System.out.println("Eight");
                    break;
                case 9:
                    System.out.println("Nine");
                    break;
                case 10:
                    System.out.println("Ten");
                    break;
                default:
                    System.out.println("ReEnter between 0-10 number");
            }
            size++;
        }
    }
}
