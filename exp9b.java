import java.util.*;
class Student {
    int rollno;
    Scanner sc = new Scanner(System.in);
    Student(){
        System.out.print("Enter the roll no. = \t");
        rollno = sc.nextInt();
    }
}
class Test extends Student{
    int sem1_marks,sem2_marks;
    Scanner sc = new Scanner(System.in);
    Test(){
        System.out.print("enter sem 1 marks :\t");
        sem1_marks=sc.nextInt();
        System.out.print("enter sem2 marks :\t");
        sem2_marks = sc.nextInt();
    }
}
interface Sports{
    public void score();
    public void toDisplay();
}
class Result extends Test implements Sports {
    int total,score;
    public void score(){
        System.out.print("Enter the marks in sports :\t");
        score = sc.nextInt();
        total = sem1_marks + sem2_marks + score;
    }
    public void toDisplay(){
        System.out.print("the result is \t"+total);
    }
}
public class exp9b
{
    public static void main(String[] args) {

        Result r = new Result();
        r.score();
        r.toDisplay();
    }
}