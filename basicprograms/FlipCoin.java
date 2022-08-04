package basicprograms;

import java.util.Scanner;

public class FlipCoin
{

    public static void main(String[] Args)
    {

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter An Integer Number to flip a coin to flip ");

        int flip = sc.nextInt();

        int heads = 0, tails = 0;

        for (int i = 0; i < flip; i++) {

            double flipcoin = Math.random();

            if (flipcoin < 0.5) {
                heads++;
                System.out.println("Heads");
            } else {
                tails++;
                System.out.println("Tails");

            }
        }
        int Head = (heads * 100) / flip;
        int Tail = (tails * 100) / flip;
        System.out.println("Percentage Head:" + Head);
        System.out.println("Percentage Tail:" + Tail);
    }
}