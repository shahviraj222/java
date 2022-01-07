import java.util.*;
public class exp5
{

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter Number Of Students: ");
        int n=sc.nextInt();
        Student[] a=new Student[n];
        for(int i=0;i<n;i++)
        {
            a[i]=new Student();
            a[i].input();
        }
        for(int i=0;i<n-1;i++)
        {
            for(int j=0;j<n-i-1;j++)
            {
                if(a[j].tmarks<a[j+1].tmarks)
                {
                    Student temp;
                    temp=a[j];
                    a[j]=a[j+1];
                    a[j+1]=temp;
                }
            }

        }
        System.out.println("Name\tid\tMath\tPhy\tChem\tTotal");
        for(int i=0;i<n;i++)
        {

            a[i].display(n);
        }


    }
}

class Student{

    String stud;
    long id;
    int math,physics,chemistry;
    float tmarks;
    Scanner sc=new Scanner(System.in);


    void input()
    {

        System.out.println("Enter Student Name: ");
        stud=sc.next();
        System.out.println("Enter Student ID: ");
        id=sc.nextLong();
        System.out.println("Enter Math Marks: ");
        math=sc.nextInt();
        System.out.println("Enter Physics Marks: ");
        physics=sc.nextInt();
        System.out.println("Enter Chemistry Marks: ");
        chemistry=sc.nextInt();
        tmarks=(float)(math+physics+chemistry);
    }

    void display(int n)
    {
        System.out.println(stud + "\t" + id + "\t" + math + "\t" + physics + "\t" + chemistry+ "\t" + tmarks);
    }
}
