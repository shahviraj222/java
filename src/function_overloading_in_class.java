class a
{
    a()
    {
        System.out.println("Here default constructor a is called.");
    }
    a(int a,int b)
    {
        System.out.println("inside the class A this constructor is called");
        System.out.println("A="+a+"B="+b);
    }
   public void metho()
    {
        System.out.println("Methode is called inside the class a");
    }

}
class b extends a
{
    @Override
    public void metho()
    {
//        we can modify inside this methode but we can't modify the argument which is taken and also retrun type
        System.out.println("Methode is called inside the class b");
    }
    b()
    {
        System.out.println("Here default constructor b is called.");
    }
    b(int a,int b,int c)
    {
//        this statement always comes at first line of methode
        super(a,b); //if you don't write this then default constructor is called
        System.out.println("inside the class B this constructor is called");
        System.out.println("A="+a+"B="+b+"C="+c);

    }
}
public class function_overloading_in_class {
    public static void main(String[] args) {
//        here methode one is object is created and the function is called from class b
        b b1=new b();
        b1.metho();

//         here methode one is object is created and the function is called from class a
        a a2=new a();
        a2.metho();
    }
}
