import java.util.*;
public class ArrayListExample {
    public static void main(String args[])
    {
            ArrayList<Integer> arr=new ArrayList<>();
            for (int i = 0; i < 10; i++) {
                arr.add(i);
            }
            System.out.println(arr.get(1));

            arr.add(1,10);
            arr.remove(7);
            System.out.println("");

            for(Integer a: arr)
            {
                System.out.print(a+ " , ");
            }
            System.out.println(arr.contains(1));

    }
}
