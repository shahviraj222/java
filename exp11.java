import java.util.*;
import java.io.*;

public class exp11
{
    public static void main(String[] args) throws IOException {
        int[] arr=new int[5];
        DataInputStream ds=new DataInputStream(System.in);
        System.out.println("Enter numbers: ");
        for(int i=0;i<arr.length;i++)
        {
            arr[i]=Integer.parseInt(ds.readLine());
        }
        InvalidInteger m=new InvalidInteger();
        int even=0;
        int odd=0;
        for(int i=0;i<arr.length;i++){
            try{

                if(arr[i]%2!=0)
                {
                    throw m;
                }
                System.out.println("Even");
                even++;

            }
            catch(Exception e){
                odd++;
                System.out.println(e);
            }
            finally{

            }
        }
        System.out.println("Invalid: "+odd+"  "+"Valid: "+even);
    }
}

class InvalidInteger extends Exception
{

}