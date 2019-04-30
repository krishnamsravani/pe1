import java.util.Scanner;

public class ReverseString
{
    public static void main(String[] args) {

        System.out.println("enter the string:");
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        reverse(str);
    }
    public static void reverse(String str)
    {
        String rev = "";
        for (int i = str.length() - 1; i >= 0; i--) {

            rev = rev + str.charAt(i);

        }
        System.out.println("reverse of a string is:" + rev);

    }
}
