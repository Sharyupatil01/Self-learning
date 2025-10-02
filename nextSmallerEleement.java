import java.util.*;
class nextSmallerEleement{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int a=sc.nextInt();
        int arr[]=new int[a];
        for(int i=0;i<a;i++)
        {
            arr[i]=sc.nextInt();
        }

        Stack<Integer> stack=new Stack<>();
        int result[]=new int[arr.length];
        for(int i=arr.length-1;i>=0;i--)
        {
            int num=arr[i];
            while(!stack.isEmpty() && stack.peek()>=num)
            {
                stack.pop();
            }
            if(!stack.isEmpty())
            {
                result[i]= (stack.isEmpty()? -1:stack.peek());
            }
           

            stack.push(num);
            
        }
        for(int n:result)
        {
            System.out.print(n+" ");
        }

    }
}