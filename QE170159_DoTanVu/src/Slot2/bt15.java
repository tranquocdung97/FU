
package Slot2;
import java.util.Scanner;
import java.util.Stack;

public class bt15{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        Stack<Character> st = new Stack<>();
        String ans = "";
        st.push(s.charAt(0));
        int count = 1;
        for (int i = 1; i < s.length(); i++){
            if (st.peek() == s.charAt(i)){
                count++;
            }else {
                ans += st.pop()+ "" + count;
                st.push(s.charAt(i));
                count = 1;
            }
        }
        ans += st.pop()+ "" + count;
        System.out.println(ans);
    }
}
