import java.util.Scanner;
public class exp2b {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter two interger numbers:");
        int a,b,c,i=1;
        a=sc.nextInt();
        b=sc.nextInt();
        System.out.println("Select number to perform operation");
        System.out.println("For '+' Select:1");
        System.out.println("For '-' Select:2");
        System.out.println("For '*' Select:3");
        System.out.println("For '/' Select:4");
        c=sc.nextInt();
        switch(c)
        {
            case 1:
                System.out.println("a+b="+(a+b));
                break;
            case 2:
                System.out.println("a-b="+(a-b));
                break;
            case 3:
                System.out.println("a*b="+(a*b));
                break;
            case 4:
                System.out.println("a/b="+(a/b));
                break;
            default:
                System.out.println("Invalid Choice");
                break;
        }
    }
}
