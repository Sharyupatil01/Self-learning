import java.util.*;
public class CollectionsInterface {
    public static void main(String args[])
    {
        Collection<String> collection;
        //first the arraylist is created 
        //elements were added in the arraylist 
        collection=new ArrayList<>();
        collection.add("Java");
        collection.add("C++");
        collection.add("C#");
        collection.add("Python");
        collection.add("C++");
        collection.add("Java");
        collection.add("C++");
        
        //then it was switch to hashset 
        //elements were added in the hashset

        collection=new HashSet<>();
        collection.add("Java");
        collection.add("C++");
        collection.add("C#");
        collection.add("Python");
        collection.add("C++");
        collection.add("Java");
        collection.add("C++");


        collection=new TreeSet<>();
        collection.add("Java");
        collection.add("C++");
        collection.add("C#");
        collection.add("Python");
        collection.add("C++");
        collection.add("Java");
        collection.add("C++");


        for(String s:collection)
        {
            System.out.println(s);
        }


    }
    
}
