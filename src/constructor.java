class Emplyoees
{
   private int id;
   private String name;
//   it works on the argument like funvtion over loading
//    only one function run
   public Emplyoees(int i)
   {
       this.id=i;
       System.out.println(id);
   }
   public Emplyoees(String n)
    {
        this.name=n;
        System.out.println(name);
    }
}
public class constructor {
    public static void main(String[] args) {
       //creating object of class Emplyoees
        Emplyoees p1=new Emplyoees("Viraj");

    }
}
