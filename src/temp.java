import java.util.*;
public class temp


    {
        public static void main(String[] args) {
            Scanner sc=new Scanner(System.in);
            int n=sc.nextInt();
            int a[][]=new int[n][n];
            System.out.println("Enter elements of Array");
            for(int i=0;i<n;i++)
            {
                for(int j=0;j<n;j++)
                {
                    a[i][j]=sc.nextInt();
                }
            }
            int sumr=0;
            int sumc=0;
            for(int i=0;i<n;i++)
            { sumr=0;
                for(int j=0;j<n;j++)
                {
                    System.out.print(a[i][j]+" ");
                    sumr+=a[i][j];
                }

                System.out.print("| ");
                System.out.print(sumr);
                System.out.println();

            }
            int sumcol=0;
            System.out.println("----------------");
            for(int i=0;i<n;i++)
            { sumc=0;
                for(int j=0;j<n;j++)
                {
                    sumc+=a[j][i];
                }
                sumcol+=sumc;

                System.out.print(sumc+" ");

            }
            System.out.print("|");
            System.out.print(sumcol);
        }
    }


