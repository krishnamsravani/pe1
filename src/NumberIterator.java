import java.util.Scanner;

public class NumberIterator
{
    public static void main(String[] args) {
        System.out.println("enter the number:");
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        iteration(num);
    }
    public static void iteration(int num)
    {
        for(int i=1;i<=num;i++)
        {
            for(int j=1;j<=i;j++)
            {
                System.out.print(i);

            }

        }

    }
}
