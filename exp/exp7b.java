import java.util.*;
public class Main
{

    float size(Object z){
        if(z instanceof Rectangle)
            return Rectangle.area();
        else if(z instanceof Cube)
            return Cube.volume();
        else
            return -1;
    }


    public static void main(String[] args) {

        float l,b,side;
        Scanner sc = new Scanner(System.in);
        System.out.println("values from default constructors");
        Rectangle r =new Rectangle();
        Cube c = new Cube();
        Main s = new Main();
        System.out.println("Passing objects of Rectangle : "+s.size(r));
        System.out.println("Passing objects of Cube : "+s.size(c));
        System.out.println("Passing objects of other classes : "+s.size(s));
        System.out.println();

        System.out.println("Testing Paramatrised constructors");
        System.out.print("Enter the length : ");
        l=sc.nextFloat();
        System.out.print("Enter the breadth : ");
        b=sc.nextFloat();
        System.out.print("Enter the side : ");
        side=sc.nextFloat();
        Rectangle r1 = new Rectangle(l,b);
        Cube c1 = new Cube(side);
        Main s1 = new Main();
        System.out.println("Passing objects of Rectangle : "+s.size(r1));
        System.out.println("Passing objects of Cube : "+s.size(c1));
        System.out.println("Passing objects of other classes : "+s.size(s1));

    }
}
class Rectangle{
    static float length,breadth;
    Rectangle(){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the length = \t");
        length = sc.nextFloat();
        System.out.print("Enter the breadth = \t");
        breadth = sc.nextFloat();
    }

    Rectangle(float l,float b){
        length =l;
        breadth=b;
    }

    static float area(){

        float a=length*breadth;
        return a;
    }

}
class Cube{
    static float side;
    Cube(){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the side =");
        side = sc.nextFloat();
    }
    Cube(float s){
        side = s;
    }
    static float volume(){
        float v = side*side*side;
        return v;
    }
}
