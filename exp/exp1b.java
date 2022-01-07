public class exp1b {
    public static void main(String[] args) {
        int a= Integer.parseInt(args[0]);
        int count = 0;
        while(a > 0)
        {
            a /= 10;
            count++;
        }
        if(count==0)
        {
            System.out.println("Your number is not valid");
        }
        else{
            System.out.println("Number of digits: " + count);
        }
    }

}

