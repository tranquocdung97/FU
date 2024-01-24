
import java.util.Scanner;
import java.util.Stack;

public class exe13 {
    
    public static void reverseString(String s){
        Stack<Character> stack = new Stack<>();
        for (int i = 0; i < s.length(); i++) {
            stack.add(s.charAt(i));
        }while(!stack.isEmpty()){
            System.out.println(stack.pop());
        }
        
    }
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String s = input.nextLine();
        reverseString(s);
        input.close();
    }
}
