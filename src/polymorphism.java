//here we defiend interfaces
interface function_of_mobile
{
    void calling();
    void ringing();
    void camera();
    void gps();
    default void printmyscreen()
    {
        System.out.println("print my screen called ");
    }
}
//here to implement the class we write 'implement' same as 'extend' for class used

//we have to declare all the class which is defined in function_of_mobile
interface wifi
{
    void function1();
    void function2();
}
interface network extends wifi
{
    void function3();
    void function4();
}

//here we only implement network but we can use the wifi also
class myadvance_function implements network
{
    @Override
    public void function1() {

    }

    @Override
    public void function2() {

    }

    @Override
    public void function4() {

    }

    @Override
    public void function3() {

    }
}
class mysamsung implements function_of_mobile
{
    public void calling()
    {
        System.out.println("Calling implemented");
    }
    public void ringing()
    {
        System.out.println("Calling implemented");
    }
    public void camera()
    {
        System.out.println("Calling implemented");
    }
    public void gps()
    {
        System.out.println("!!!GPS!!!");
    }
//    this class is not used by the object of above interface
    public void only_for_samsung_useres()
    {
        System.out.println("This feature only for paid with samsung users");
    }
}
public class polymorphism {

   // if we want to reduce access of function then polymorphism
   public static void main(String[] args) {
       function_of_mobile g =new mysamsung();
       g.camera();
       g.printmyscreen();
   }

}
