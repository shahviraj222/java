
public class varag {
//    here i am taking the array as many number you want you don't need to intialize size
    static int sum(int ...arr)
    {
        int result=0;
//        special type for loop it run till the arr is present
        for (int a:arr)
        {
            result=result+a;
        }
        return result;
    }
//    here x is take as compulsary
    static int avg(int x,int ...a)
    {
        int result=x;
        for (int b:a)
        {
            result=result + b;
        }
        result= result / (a.length+1);
        return result;
    }
    public static void main(String[] args) {
//        it take multivalue
        System.out.println("Sum="+sum(1,5,5));
        System.out.println("Sum="+sum(1,5));
        System.out.println("Sum="+avg(5,5,5)); //it is still run
    }
}
