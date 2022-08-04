package basicprograms;

import java.util.Scanner;

public class LargestAmongThree
{
    public static void main(String[] args)
    {
        int a, b, c, largest1,largest2;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the first number:");
        a = sc.nextInt();
        System.out.println("Enter the second number:");
        b = sc.nextInt();
        System.out.println("Enter the third number:");
        c = sc.nextInt();

        largest1 = a>b?a:b;   // largest of a & b
        largest2 = c > (a > b ? a : b) ? c : ((a > b) ? a : b);
        System.out.println("The largest number is: "+largest2);
    }

}

