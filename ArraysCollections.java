import java.util.ArrayList;

class ArraysCollections{
    public static void main(String args[])
    {
        //Arrays - fixed size 
        int a[]=new int[4];
        a[0]=1;
        a[2]=3;
        a[1]=0;
        a[3]=9;
        //a[4]=10; ArrayIndexOutOfBoundException 
        for(int i=0;i<a.length;i++)
        {
            System.out.print(a[i]+",");
        }
        ArrayList<Integer> arr=new ArrayList<>();
        arr.add(1);
        arr.add(2);
        arr.add(9);
        arr.add(10);
        for(int i=5;i<10;i++)
        {
            arr.add(i);
        }
        System.out.println("Collections");
        for(int i=0;i<arr.size();i++)
        {
            System.out.print(arr.get(i)+",");
        }

    }

    
}