import java.lang.*;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;
public class SetExample {
    public static void main(String args[])
    {
        Set<Integer> set=new HashSet<>();
        set.add(1);
        set.add(2);
        set.add(3);

        System.out.println(set.contains(2));
        System.out.println(set.size());
        System.out.println(set);
        
        LinkedHashSet<String> linkedHashSet = new LinkedHashSet<>();
        linkedHashSet.add("Apple");
        linkedHashSet.add("Banana");
        linkedHashSet.add("Orange");
        System.out.println(linkedHashSet);
        System.out.println(linkedHashSet.contains("Banana"));


        TreeSet<Integer> treeSet=new TreeSet<>();
        treeSet.add(5);
        treeSet.add(1);
        treeSet.add(3);
        System.out.println(treeSet);

        Iterator<Integer> it=treeSet.iterator();
        while(it.hasNext())
        {
            System.out.println(it.next());
        }
        
        



    }
}
