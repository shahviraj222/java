public class exp7a{
    public static void main(String args[]){
        Hello h1 = new Hello();
        Hello h2 = new Hello();
        Hello h3 = new Hello();
        Hello h4 = new Hello();

        h1.display();
    }
}
class Hello{
    static int counter;
    Hello(){
        System.out.println("Hello World");
        counter++;
    }
    void display(){
        System.out.println("numbe of objects created = "+counter);
    }
}