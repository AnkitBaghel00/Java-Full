package HW;

import java.util.Scanner;

public class basic6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter value1 : ");
        int n1=sc.nextInt();
        System.out.println("Enter value2 : ");
        int n2=sc.nextInt();
        int inn=0;


        while(inn<10) {
            System.out.println("*************************");
            System.out.println("Enter 1 for Add");
            System.out.println("Enter 2 for Sub");
            System.out.println("Enter 3 for Div");
            System.out.println("Enter 4 for Multi");
            int usr =sc.nextInt();
            System.out.println("*************************");


            if (usr == 1) {
                int n3 = n1 + n2;
                System.out.println("The Addition of given :" + n3);
            }
            if (usr == 2) {
                int n3 = n1 - n2;
                System.out.println("The Subtraction of given :" + n3);
            }
            if (usr == 3) {
                int n3 = n1 / n2;
                System.out.println("The Division of given :" + n3);
            }
            if (usr == 4) {
                int n3 = n1 * n2;
                System.out.println("The Multiplication of given :" + n3);
            }
            if(usr <1 || usr>=5){
                System.out.println("Wrong chose ");
            }


            inn++;
        }




    }
}
