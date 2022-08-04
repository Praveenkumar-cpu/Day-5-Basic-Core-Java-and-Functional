package basicprograms;

import java.util.Scanner;

public class SwapNumber
{
    public static void main(String[] args)
    {
        int x, y, swap;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the value of X and Y");
        x = sc.nextInt();
        y = sc.nextInt();
        System.out.println("Before Swapping numbers: "+x +"  "+ y);
        swap = x;
        x = y;
        y = swap;
        System.out.println("After swapping: "+x +"   " + y);
    }
}
