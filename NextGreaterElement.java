import java.util.*;
class Example1
{
    public int[] nextGreaterElement(int nums1[],int nums2[])
    {
        Stack<Integer> stack=new Stack<>();
        HashMap<Integer,Integer> hash=new HashMap<>();
        for(int i=nums2.length-1;i>=0;i--)
        {
            int num=nums2[i];
            if(!stack.isEmpty() && stack.peek()<=num )
            {
                stack.pop();
            }
            hash.put(num,stack.isEmpty()?-1:stack.peek());

            stack.push(num);
        }
        int result[]=new int[nums1.length];
        for(int i=0;i<nums1.length;i++)
        {
            result[i]=hash.get(nums1[i]);
        }
        return result;
    }

}


public class NextGreaterElement {
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);

        int x=sc.nextInt();
        int nums1[]=new int[x];
        for(int i=0;i<x;i++)
        {
            nums1[i]=sc.nextInt();
        }
        int y=sc.nextInt();
        int nums2[]=new int[y];
        for(int i=0;i<y;i++)
        {
            nums2[i]=sc.nextInt();
        }
        Example1 obj=new Example1();
        int result[]=obj.nextGreaterElement(nums1, nums2);

        for(int n:result)
        {
            System.out.print(n+" ");
        }

    }
}
