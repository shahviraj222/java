import java.util.Scanner;
class calculation{
    Scanner s=new Scanner(System.in);
    //    run sorting by arrival time
    void sort(int []a,int []b,int []id,int n)
    {
        int temp;
        for (int i=0;i<n-1;i++)
        {
            for (int j=0;j<n-1;j++)
            {
                if(a[j]>a[j+1])
                {
                    temp=a[j];
                    a[j]=a[j+1];
                    a[j+1]=temp;

                    temp=b[j];
                    b[j]=b[j+1];
                    b[j+1]=temp;

                    temp=id[j];
                    id[j]=id[j+1];
                    id[j+1]=temp;
                }
                if (a[j]==a[j+1])
                {
                    if(b[j]>b[j+1])
                    {
                        temp=b[j];
                        b[j]=b[j+1];
                        b[j+1]=temp;

                        temp=id[j];
                        id[j]=id[j+1];
                        id[j+1]=temp;
                    }
                }
            }
        }
    }

    //this function return average wait time
    float wait(int []a,int []b,int []w,int n)
    {
        int i;
        w[0]=0;
        for (i = 1; i<n; i++) {
            w[i]=b[i-1]+w[i-1]-a[i];
            if (w[i]<0)
            {
                w[i]=0;
            }
        }
        int sum=0;
        for (i = 0; i<n; i++) {
            sum=sum+w[i];
        }
        return (float)sum/n;
    }
    float tat(int []t,int []b,int []w,int n)
    {
        int i;
        for (i = 0; i<n; i++) {
            t[i]=w[i]+b[i];
        }
        int sum=0;
        for (i = 0; i<n; i++) {
            sum=sum+t[i];
        }
        return (float)sum/n;
    }
}
class sjf {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter the total number of process:");
        int n=sc.nextInt();
        int[] a=new int[n]; //arrival time
        int[] b=new int[n];// burst time
        int[] w=new int[n];//waiting time
        int[] tat=new int[n];//turn around time
        int[] id=new int[n];//id
        int i;
//        this logic works only on non preemptive SJF
        for (i = 0; i<n; i++) {
            System.out.println("Enter the arrival time of " + (i + 1));
            a[i] = sc.nextInt();
            System.out.println("Enter the burst time of " + (i + 1));
            b[i] = sc.nextInt();
            id[i]=i+1;
        }
        calculation v=new calculation();
        v.sort(a,b,id,n);
        float rw=v.wait(a,b,w,n);
        float rt=v.tat(tat,b,w,n);
        System.out.println("************************************************************************************************");
        System.out.println("Process Execution in this manor");
        System.out.println("************************************************************************************************");
        System.out.format("Pid  BurstTime  ArrivalTime  WaitingTime  TATTime\n");
        for (i = 0; i<n; i++) {
            System.out.format(+(id[i])+"       "+b[i]+"         "+a[i]+"             "+w[i]+"            "+tat[i]+"\n");
        }
        System.out.println("************************************************************************************************");
        System.out.println("Total average waiting time="+rw);
        System.out.println("Total average Turn around time="+rt);

    }
}