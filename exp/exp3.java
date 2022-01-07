import java.util.Scanner;
public class exp3 {
    public static void main(String[] args) {
        Scanner a=new Scanner(System.in);
        System.out.print("Enter the length:");
        int n=a.nextInt();
        int sum=0;
        int []b=new int[n];
        System.out.print("Enter the element of arrays:");
        for (int i=0;i<n;i++)
        {
            b[i]=a.nextInt();
        }
//        caluting sum as per the question said
        int []d=new int[n];
        for(int i=0;i<n;i++)
        {
            sum+=b[i];
        }
        for (int i=0;i<n;i++)
        {
//            here d[i] becomes the sum-a[i] means the element at that index is deleted
            d[i]=sum-b[i];
        }

//        printing array
        System.out.print("Anwer is ");
        for (int c:d)
        {
            System.out.print(c+" ");
        }
    }
}
