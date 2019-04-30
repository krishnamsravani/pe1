import java.util.Scanner;

public class OrderAndSum
{
    public static void main(String[] args) {
        int n;
        Scanner s = new Scanner(System.in);
        System.out.print("Enter no. of elements you want in array:");
        n = s.nextInt();
        Descending(n);
    }
    public static void Descending(int n)
    {
        int sum=0,temp;
        int a[] = new int[n];
        System.out.println("Enter all the elements:");
        Scanner sc = new Scanner(System.in);
        for (int i = 0; i < n; i++)
        {
            a[i] = sc.nextInt();
            if( (a[i] % 2 ) == 0) {
                sum  = sum + a[i];
        }
        }

        for (int i = 0; i < n; i++)
        {
            for (int j = i + 1; j < n; j++)
            {
                if (a[i] < a[j])
                {
                    temp = a[i];
                    a[i] = a[j];
                    a[j] = temp;
                }
            }
        }
        System.out.print("Descending Order:");
        for (int i = 0; i < n-1 ; i++)
        {
            System.out.print(a[i] + ",");
        }
        System.out.println(a[n-1]);
        System.out.println("sum of even numbers is:"+sum);

                if(sum>15)
                {
                    System.out.println("true");
                }
                else{
                    System.out.println("false");
                }
            }

        }



