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

}
class b extends a
{
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
public class sup_this_key_word {
    public static void main(String[] args) {
     b a1=new b(4,5,5);
    }
}
