import java.util.Scanner;

public class VowelOrConsonent
{
    public static void main(String[] args) {
        String s;
        System.out.println("enter the string:");
        Scanner sc = new Scanner(System.in);
        s = sc.nextLine();
        isVowel(s);
    }

    }
}
    public static void isVowel(String s)
    {
        for(int i=0;i<=s.length()-1;i++)
        {
            char c=s.charAt(i);
            if(c=='a' || c=='e' || c=='i' || c=='o' || c=='u' || c=='A' || c=='E' || c=='I' || c=='O' || c=='U' )
            {
                System.out.println("given input is a vowel:"+c);
            }
            else
            {
                System.out.println("given input is a consonent:"+c);
            }
        }

