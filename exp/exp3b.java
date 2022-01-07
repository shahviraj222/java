import java.util.Scanner;
public class exp3b {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int m,n;
        System.out.print("Enter the no of rows and columns:");
        m=sc.nextInt();
        n=sc.nextInt();
//        m for number of rows and n for number of columns
        int a[][]=new int[m][n];
        for(int j=0;j<m;j++) {
            System.out.print("Enter the array element of " +(j+1)+" row:");
            for (int i = 0; i < n; i++) {
                a[j][i] = sc.nextInt();
            }
        }
        int sum=0;
        int c[]=new int [n];
        int r[]=new int [m];
        for (int j=0;j<m;j++) {
            sum=0;
            for (int i = 0; i < n; i++)
            {
                sum=a[j][i]+sum;
            }
            r[j]=sum;
        }
        sum=0;
        for (int i=0;i<n;i++)
        {   sum=0;
            for (int j = 0; j< m; j++)
            {
                sum=a[j][i] + sum;
            }
            c[i]=sum;
        }
        for(int i=0;i<m;i++) {
            for (int j = 0; j < n; j++) {
                System.out.print(a[i][j] + " ");
            }
            System.out.print("|");
            System.out.print(r[i]);
            System.out.print("\n");
        }
        for(int i=0;i<n;i++)
        {
            System.out.print("--");
        }
        System.out.print("\n");
        for(int i=0;i<n;i++)
        {
            System.out.print(c[i]+" ");
        }
    }
}
