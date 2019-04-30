import java.util.Scanner;

public class AddingIntegers
{
    public static void main(String[] args) {
        int  n;
        System.out.println("enter number of inputs:");
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();
        addIntegers(n);
    }
    public static void addIntegers(int n)
    {
        int sum=0;
        int[] a=new int[n];
        System.out.println("enter inputs:");
        Scanner s=new Scanner(System.in);
        for(int i=0;i<n;i++)
        {
            a[i]=s.nextInt();
            sum = sum+a[i];

        }
        System.out.println("output:" + sum);
    }
}
