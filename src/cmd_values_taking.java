public class cmd_values_taking {
    public static void main(String[] x) {
        System.out.println("NAME:"+x[0]);
        System.out.println("AGE:"+x[1]);
        System.out.println("Increamented AGE:"+x[1]+1);//this satement is not run directly
//        because above one is string not integer
        int a= Integer.parseInt(x[1]);
        System.out.println("Increamented AGE:"+(a+1));
    }
}
