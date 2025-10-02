import java.util.Stack;
public class ValidParenthesis {
    public static void main(String args[])
    {
        Stack<Character> stack=new Stack<>();
        String s="()[]{}";
        for(char c:s.toCharArray())
        {
            if(c=='(' || c=='{' || c=='[')
            {
                stack.push(c);
            }
            else
            {
                if(stack.isEmpty())
                {
                    System.out.println("Not Valid");
                    return;
                }
                char top=stack.pop();
                if(top !='(' && c==')' || (top !='{' && c=='}') || (top !='[' && c==']'))
                {
                    System.out.println("Not Valid");
                    return;
                }
            }
        }
        if(stack.isEmpty())
        {
            System.out.println("Valid");
        }
        else
        {
            System.out.println("Not Valid");
        }

    }
}