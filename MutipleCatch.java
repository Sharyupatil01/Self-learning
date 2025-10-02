

import java.util.*;
public class MutipleCatch {
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        try{
            System.out.println("Enter numerator:");
            int x=sc.nextInt();
            System.out.println("Enter denominator:");
            int y=sc.nextInt();
            int result=x/y;
            System.out.println("Result is:"+result);

            int arr[]=new int[5];
            arr[10]=50; // This will throw ArrayIndexOutOfBoundsException


        }
        catch(ArithmeticException e)
        {
            System.out.println("Denominator cannot be zero");
        }
        catch(ArrayIndexOutOfBoundsException e)
        {
            System.out.println("Array index is out of bounds");
        }
        catch(InputMismatchException e)
        {
            System.out.println("Please enter valid integer");
        }
        catch(Exception e)
        {
            System.out.println("Some other exception occured");
        }
        finally
        {
            System.out.println("Finally block always executes");
        }

    }
}
