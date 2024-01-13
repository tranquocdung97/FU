package Bai13;

class ReverseStringStack {
    private char[] stackArray;
    private int top;

    public ReverseStringStack(int strLength) {
        stackArray = new char[strLength];
        top = -1;
    }
    public void push (char ch) {
        if (top < stackArray.length - 1) {
            stackArray[++top] = ch;
        }
    }
    public char pop () {
        if (top >= 0) {
            return stackArray[top--];
        }
        return '\0';
    }
    public boolean isEmpty () {
        return top == -1;
    }

    public String reverseString(String initialStr) {
        for (char ch : initialStr.toCharArray()) {
            push(ch);
        }
        StringBuilder reverseString = new StringBuilder();
        while (!isEmpty()) {
            reverseString.append(pop());
        }
        return reverseString.toString();
    }
}
