
class Exercise2
{
    public void checkAge(int age) throws ArithmeticException
    {
        if(age<18)
        {
            throw new ArithmeticException("Not eligble to vote");

        }
        else{
            System.out.println("Eligble to vote");
        }

    }
}


public class ExceptionHandling
{
    public static void main(String args[])
    {
        //  Scanner sc=new Scanner(System.in);
        //  System.out.println("Enter first no:");
        //  int x=sc.nextInt();
        //     System.out.println("Enter second no:");
        //     int y=sc.nextInt();
        //     try
        //     {
        //         int z=x/y;
        //         System.out.println("Result is:"+z);
        //     }
        //     catch(ArithmeticException e)
        //     {
        //         System.out.println("Denominator cannot be zero");
        //     }
        //     catch(InputMismatchException e)
        //     {
        //         System.out.println("Please enter valid integer");
        //     }
        //     finally
        //     {
        //         System.out.println("Finally block always executes");
        //     }

        Exercise2 e=new Exercise2();
        try{
            e.checkAge(20);

        }
        catch(ArithmeticException ex)
        {
            System.out.println("Exception occured:"+ex.getMessage());
        }



            
    }
}