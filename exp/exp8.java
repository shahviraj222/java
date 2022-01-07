import java.util.*;
class Staff{
    String name;
    int code;
    void college(){
        System.out.println("D.J");
    }
}
class Teacher extends Staff{
    String subject;
    int experience;
    void read(){
        System.out.println("reading in teacher");
    }
    void display(){
        System.out.println("displaying in teacher");
    }

}
class Typist extends Staff {
    int speed , experience;
    Typist(){
        System.out.println("this is a Typist constructor");
    }


    void read(){
        System.out.println("reading in Typist");
    }
    void display(){
        System.out.println("displaying in Typist");
    }
}
class Officer {
    String department;
    char grade;

    void read(){
        System.out.println("reading in officer");
    }
    void display(){
        System.out.println("displaying in officer");
    }
}
class Regular extends Typist{
    float salary;
    Regular(){
        System.out.println("this is a Regular Typist constructor");
    }

    void read(){
        super.read();
        System.out.println("reading in Regular typist");
    }
    void display(){
        super.display();
        System.out.println("displaying in regular typist");
    }

}
class Casual extends Typist {
    float daily_wages;
    Casual(){
        System.out.println("this is a Casual Typist constructor");
    }
    void read(){
        System.out.println("reading in Casual Typist");
    }
    void display(){
        System.out.println("displaying in Casual Typist");
    }


}
public class exp8
{
    public static void main(String[] args) {
        Regular r = new Regular();
        r.read();
        r.display();
    }
}