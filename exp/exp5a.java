import java.util.*;
public class Main
{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the first string:");
        String s=sc.next();
        System.out.print("Enter the second string:");
        String str=sc.next();
        boolean flag=false;
        boolean out=false;
        boolean f =false;
        char[] a = s.toCharArray();
        char[] b = str.toCharArray();
        char s1=a[0];
        char s2=b[0];
        for(int i=0;i<s.length();i++)
        {
            if(a[i]!=b[i])
            {
                if(flag==false)
                {
                    s1=a[i];
                    s2=b[i];
                    flag=true;

                }

                if(a[i]==s2 && b[i]==s1 && flag==true)
                {
                    out=true;
                }
                else
                {
                    out=false;

                }

            }
        }
        if(out==true)
        {
            System.out.println("right");
        }
        else
        {
            System.out.println("wrong");
        }
    }
}
