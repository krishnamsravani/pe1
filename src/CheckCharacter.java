import java.util.Scanner;

public class CheckCharacter
{
    public static void main(String[] args) {
        System.out.println("enter the character:");
        Scanner sc = new Scanner(System.in);
        char c = sc.next().charAt(0);
        character(c);
    }
    public static void character(char c)
    {
        int castchar = (int)c;
        if(c>=65 && c<=90)
            System.out.println("capital letter");
        else if(c>=97 && c<=122)
            System.out.println("small case letter");
        else if(c>=48 && c<=57)
            System.out.println("digit");
        else
            System.out.println("special character");

    }
}
