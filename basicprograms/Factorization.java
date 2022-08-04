package basicprograms;

import java.util.Scanner;

public class Factorization
{
    public static void main(String[] args)
    {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a Number");
        int num = sc.nextInt();
        System.out.println("Prime factors for the given numbers:");
        for(int i=2; i<=num; i++)
        {
            while(num % i==0)

            {
                num=num/i;
                System.out.println(i+"");
            }
        }

    }
}
