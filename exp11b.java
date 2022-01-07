import java.io.*;
public class exp11b{
    public static void main(String[] args) throws IOException{
        int a;
        DataInputStream d = new DataInputStream(System.in);
        System.out.println("Enter the marks:");
        a = Integer.parseInt(d.readLine());

        try {
            if(a<0 || a>100){
                throw new MarksOutOfBoundsException();
            }
        } catch (Exception e) {
            a = 0;
            System.out.println(e);
        }finally{
            System.out.println("******");
        }

    }
}

class MarksOutOfBoundsException extends Exception{

}