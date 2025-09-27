
import java.util.*;

public class Iterators {
    public static void main(String args[])
    {
        ArrayList<Integer> arr=new ArrayList<>();
        for (int i = 0; i < 10; i++) {
            arr.add(i);
        }
        
        Iterator<Integer> it=arr.iterator();
        while(it.hasNext())
        {
            System.out.println(it.next());
        }

    }
}
