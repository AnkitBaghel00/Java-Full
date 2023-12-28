package HW;

import java.util.Scanner;

public class basic4 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int inn = 0;


        while (inn < 10) {
            System.out.println("Enter any number to check :");
            int n = sc.nextInt();

            if ((n >= 65 && n <= 90) || (n >= 97 && n <= 122)) {
                System.out.println("Alphabet");
            } else if (n >= 48 && n <= 57) {
                System.out.println("Digit");
            } else {
                System.out.println("Special Character ");
            }

            inn++;
        }
    }
}
