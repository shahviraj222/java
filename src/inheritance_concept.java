class parent {
    public
    int a=85;
    public void methode1()
    {
        int c=a+6;
        System.out.println("Methode 1 is resolved from parent");
    }
    public void methode1(int a)
    {
        System.out.println("methode 1 is called ");
    }
}
class child extends parent
{
    public void methode2()
    {
        System.out.println("Value of a which store in the parent class is \na="+a);
        System.out.println("methode 2 is called");
    }
}
public class inheritance_concept {
    public static void main(String[] args) {
    child c =new child();
    c.methode2();
//    here by creating the object of child we can call parent's function  also
    c.methode1();
    }

}
