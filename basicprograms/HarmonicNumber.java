package basicprograms;

import java.util.Scanner;

public class HarmonicNumber
{
    static double harmonic(int n)
    {
        float harNum = 1;
        for (int i = 2; i <= n; i++)
        {
            harNum += (float)1 / i;
        }

        return harNum;
    }

    public static void main(String[] args)
    {

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the value of N");

        int n = sc.nextInt();

        System.out.println(harmonic(n));
    }

}
