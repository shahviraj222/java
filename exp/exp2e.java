public class exp2e {

    public static void main(String[] args) {
//      PATTERN 1
//        this is use to taking integer from cmd
        int n=Integer.parseInt(args[0]);
        for(int i=0;i<n;i++)
        {   int temp=i+1;
            for(int j=0;j<i+1;j++,temp--)
            {
                if(i%2==0)
                {
                    System.out.print((j+1)+" ");
                }
                else
                {
                    System.out.print(temp+" ");
                }
            }
            System.out.print("\n");
        }

//    PATTERN 2
        int a='A';
        int temp=65,temp1=1;
        for(int i=0;i<n;i++)
        {
            a=temp;          //here i am modify a
            for(int j=0;j<n;j++)
            {
              if (j>=n-1-i)
              {
                  System.out.print((char)(a));
                  a--;
              }
              else
              {
                  System.out.print(" ");
              }
            }
            temp=temp+(++temp1);    // this is my game changer
            System.out.print("\n");
        }

    }
}
