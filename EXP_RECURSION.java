import java.util.Scanner;
public class EXP_RECURSION {
     static int superdigit(int n)
    {
        int temp=n;
        int t;
        int count=0;
        int sum=0;
        while(temp!=0)
        {   t=temp;
            t=t%10;
            sum=sum+t;
            count++;
            temp=temp/10;
        }
        if (count==1)
        {
            return n;
        }
        else
        {
            sum=superdigit(sum);
            return sum;
        }
    }
    public static void main(String[] args) {
         System.out.print("Enter the number:");
        Scanner sc=new Scanner(System.in);
    int n=sc.nextInt();
    int r=superdigit(n);
    System.out.println("super_digit("+n+")="+r);
    }
}