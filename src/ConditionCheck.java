import java.util.Scanner;

public class ConditionCheck
{
    public static void main(String[] args) {
        System.out.println("enter the number");
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        conditionalChecker(num);
    }
        public static void conditionalChecker(int num)
        {

        if(num>=20 && num<=30)
        {
            if(num%2!=0)
            {
                System.out.println("Tom");


            }
            else{
                System.out.println("Jerry");

            }


        }
        else{
            System.out.println("neither Tom nor Jerry");
        }


    }
}
