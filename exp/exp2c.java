import java.util.Scanner;
public class exp2c{
    public static void main(String args[]){

        int low,up,temp;
        Scanner sc= new Scanner(System.in);

        System.out.print("Enter the lower bound:");
        low=sc.nextInt();
        System.out.print("Enter the upper bound:");
        up=sc.nextInt();



        //odd numbers
        System.out.println("the odd numbers are");
        for(int i=low;i<=up;i++){
            if(i%2!=0)
                System.out.print(i+" ");
        }

        //prime numbers
        System.out.println("\nthe prime numbers are");
        for(int i=low;i<=up;i++){
            if(i==0 ||i==1)
                continue;

            temp=1;
            for(int j=2;j<=i/2;j++){
                if(i%j==0){
                    temp=0;
                    break;
                }
            }

            if(temp==1)
                System.out.print(i+" ");

        }

    }
}