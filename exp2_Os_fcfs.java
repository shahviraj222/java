import java.util.Scanner;
class calculation{
    Scanner s= new Scanner(System.in);
    int[] a=new int[500];
    void taking_wait(int n)
    {
        for (int i=0;i<n;i++) {
            System.out.println("Enter the wait time of " + (i + 1));
            a[i]=s.nextInt();
        }
    }
}
public class exp2_Os_fcfs {
    public static void main(String[] args) {
        System.out.println("Enter the number of process:");
        Scanner sc= new Scanner(System.in);
        int n=sc.nextInt();
        calculation w = new calculation();
        w.taking_wait(n);
    }
}
