import java.util.Scanner;
public class exp6c {
//    this is funtion overloading here name of function is same and the argument is diffrent
    static void area(int r)
    {
        System.out.println("Area of Square is"+r*r);
    }
    static void area(int l,int b)
    {
        System.out.println("Area of Rectangle is"+(l*b)/2);
    }
    public static void main(String[] args) {
        int s,l,b;
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the l,b of Rectangle:");
        l=sc.nextInt();
        b=sc.nextInt();
        System.out.println("Enter the side of Square:");
        s=sc.nextInt();
        area(s);
        area(l,b);
    }
}
