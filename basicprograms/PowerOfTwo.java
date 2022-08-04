package basicprograms;

import java.util.Scanner;

public class PowerOfTwo
{

    public static void main(String[] args)
    {

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter value of N");

        int n = sc.nextInt();

        if (n > 0 && n < 31) {

            for (int i = 1; i <= n; i++) {

                System.out.println(i + " " + Math.pow(2, i));
            }
        } else {
            System.out.println("Reached max value please enter lower value");
        }
    }
}