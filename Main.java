import java.util.*;
class Student{
    String name;
    long id;
    Scanner sc= new Scanner(System.in);
    void input(){
        System.out.print("Enter the name :\t");
        name = sc.nextLine();
        System.out.print("Enter ID :\t");
        id = sc.nextInt();
    }
}
public class Main {
    void addStudent(int n) {
        Student[] a = new Student[n];
        for (int i = 0; i < n; i++) {
            a[i] = new Student();
            a[i].input();
        }
        pickWinner(a);
    }

    void pickWinner(Student a[]) {
        Random r = new Random();
        int m = r.nextInt(a.length);
        System.out.println("Winner name: " + a[m].name + "\n" + "Winner id:" + a[m].id);

    }

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int n;
        System.out.print("Enter number of Students\t");
        n = sc.nextInt();
        Main p = new Main();
        p.addStudent(n);
    }
}