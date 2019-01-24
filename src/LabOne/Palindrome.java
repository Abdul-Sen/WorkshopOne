package LabOne;

public class Palindrome {

    public static void main(String [] args)
    {
        Stack myStack = new Stack(args[0].length());

        args[0] = args[0].toUpperCase();
        System.out.print(args[0]);

        //pushing elements into the stack
        for(int i = 0 ; i < args[0].length(); i++)
        {
            myStack.push(args[0].charAt(i));
        }

        int index = 0;
        while ( !myStack.isEmpty()) //while stack is not empty
        {
            if(myStack.peek() != args[0].charAt(index))
            {
                System.out.print("FALSE");
                return;
            }
            myStack.pop();
            index++;
        }
        System.out.print("TRUE");
    }
}
