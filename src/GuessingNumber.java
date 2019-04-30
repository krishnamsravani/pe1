import java.util.Scanner;

public class GuessingNumber
{
     static int num;

    public static void main(String[] args) {
        guessNumber(num);
    }
    public static void guessNumber(int num)
    {
        int original=30;
        while (true)
        {
            System.out.println("enter the guess number:");
            Scanner sc=new Scanner(System.in);
            num=sc.nextInt();

            if(num<original)
            {
                System.out.println("Number guessed is less than  the original number");

            }
            else if(num>original)
            {
                System.out.println("Number guessed is morethan the original number");

            }
            else {
                System.out.println("Number guessed matches the original string");
                break;
            }
        }


    }
}
