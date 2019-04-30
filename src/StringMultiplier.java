import java.util.Scanner;

public class StringMultiplier
{
    public static void main(String[] args) {
        String str;

        Scanner in = new Scanner(System.in);
        System.out.println("Enter string");
        str = in.next();
        repeat(str);
    }
    public static void repeat(String str)
    {
        String new_word;
        int valueMulti, i, len;
        new_word=str;
        System.out.println("enter multiplier value");
        Scanner sc = new Scanner(System.in);
        valueMulti=sc.nextInt();
        len=str.length();
        System.out.println(len);
        for(i=0 ; i<valueMulti ;i++){
            new_word= new_word+ str.substring(len - valueMulti,len);
        }
        System.out.println(new_word);

    }
}
