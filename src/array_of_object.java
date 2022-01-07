class Product
{
    int pId;
    String pName;

    public void pSet(int id, String name)
    {
        pId = id;
        pName = name;
    }

    public void display()
    {
        System.out.print("Product Id = " + pId + "   " + "Product Name = " + pName);
        System.out.println();
    }
}

public class array_of_object
{
    public static void main(String args[])
    {
        //create an array of object of Product class
        Product obj[] = new Product[3];

        int i;
        for(i=0;i<=2;i++)
        {
            obj[i] = new Product();
        }

        obj[0].pSet(101,"Dell");
        obj[1].pSet(102,"HP");
        obj[2].pSet(103,"LG");

        //display the product object data
        System.out.print("Product Object 1: ");
        obj[0].display();
        System.out.print("Product Object 2: ");
        obj[1].display();
        System.out.print("Product Object 3: ");
        obj[2].display();
    }
}