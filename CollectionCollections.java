import java.util.ArrayList;
import java.util.Collections;
public class CollectionCollections {
    public static void main(String args[])
    {
        //collection(Interface)

        ArrayList<Integer> arr=new ArrayList<>();
        arr.add(3);
        arr.add(9);
        arr.add(10);
        arr.add(30);
        arr.add(0);
        arr.add(1);

        //Collections sort for sorting the ArrayList 
        Collections.sort(arr);
        System.out.println(arr);//helper method 
       System.out.println( Collections.binarySearch(arr,30));
       
        



    }

}
