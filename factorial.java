import java.util.Scanner;
public class factorial {
    static int fac(int n)
    {
        if(n==1||n==0)
        {
            return 1;
        }
        else
        {
            return n*fac(n-1);
        }
    }
    public static void main(String[] args) {
        int i=1;
        while(i==1) {
            i=0;
            Scanner scw = new Scanner(System.in);
            System.out.print("Enter the number:");
            int n = scw.nextInt();
            System.out.println(n + "!=" + fac(n));
            System.out.println("To run again Enter 1:");
            i=scw.nextInt();
        }
    }
}
