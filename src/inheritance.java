class base{
    int x=0;
//    here constructor don't write any return type of constrctor
    public base()
    {
        System.out.println("I am constructor of base class");

    }
    public int getX() {
        System.out.println("I am in base class X="+x);
        return x;
    }

    public void setX(int x) {
        this.x = x;
    }

}
//all the part inside base methode is now available in base methode
// but we can't say like all the material are accesable in derived class
class derived extends base{
    int y;
    public derived()
    {
        System.out.println("I am constructor of derived class");

    }
    public int getY() {
        System.out.println("I am in derived class y="+y);
        return y;
    }
//    accessing the variables inside the class base
    public void p()
    {
        System.out.println("I am in derived class X="+x);
    }

    public void setY(int y) {
        this.y = y;
    }
}
public class inheritance {
    public static void main(String[] args) {
//        we are calling the class 'derived' but it is inheritance of clas 'base' therefore by default the constructor of base is run
//        first run base constructor and then derived class constructor
        derived d =new derived();
        d.setX(5); //here i am calling the methode which is inside ht ebase methode
        d.p();



    }
}
