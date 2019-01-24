package LabOne;

public class Stack {
    char[] charArray;

    Stack(int fixedSize)
    {
        charArray = new char[fixedSize];
    }

    //adds a character to the array
    public boolean push(char c)
    {
        for(int i = charArray.length -1; i >= 0 ; i--)
        {
            if (charArray[i] == 0) // \u0000 equalvlent
            {
                charArray[i] = c;
                return true; //successfully added element
            }
        }
        return false; //failed to add element
    }

    // removes the last element
    public char pop()
    {
        char temp;
        for(int i = 0; i != charArray.length; i++)
        {
            if(charArray[i] != '\u0000') //not null or 0 <- more accurate
            {
                temp = charArray[i];
                charArray[i] = 0;
                return temp;
            }
        }
        return 0;
    }

    //checks if array is empty
    public boolean isEmpty() {
        for(char current : charArray)
        {
            if(current != 0){ return false;}
        }
        return true;
    }

    //returns POSITION (not index) of the first element that matches in stack
    public int search(char c)
    {
        for(int i =0; i<charArray.length; i++)
        {
            if(charArray[i] ==  c){ return i + 1; } //return
        }
        return -1; //could not find
    }

    //shows obj at the top. DOES NOT REMOVE IT FROM ARRAY!
    public char peek() {
        for(char current: charArray)
        {
            if(current != 0) { return current;}
        }
        return 0;
    }

}

