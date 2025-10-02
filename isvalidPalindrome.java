import java.util.Stack;

class solution
{
    public boolean isValidPalindrome(String s)
    {
        if(s.length()==0)
        {
            return true;
        }
        Stack<Character> stk=new Stack<>();
        for(char c:s.toCharArray())
        {
            if(c=='(' || c=='{' || c=='[')
            {
                stk.push(c);
            }
            else{
                if(stk.isEmpty())
                {
                    return false;
                }
                char top=stk.pop();
                if((c==')' && top!='(') || (c=='}' && top!='{') || (c==']' && top!='['))
                {
                    return false;

            }
        }
        
    }
    return stk.isEmpty();
}
}





public class isvalidPalindrome {
    public static void main(String args[])
    {
        solution object =new solution();
        object.isValidPalindrome("()[]{}");
        System.out.println(object.isValidPalindrome("()[]{}"));

    }
}
