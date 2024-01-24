
import java.util.Scanner;
import java.util.Stack;

public class exe15 {
    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);
        String s = input.nextLine().trim().toLowerCase();
        Stack<Character> st = new Stack<>();
        String str = "";
        s+="!";
        for(int i =0;i < s.length(); i++ ){
            if(st.isEmpty() || st.peek()==s.charAt(i)){
                st.push(s.charAt(i));
            }else{
                int count=0;
                str = str +st.peek();
                while(!st.empty()){
                count+=1;
                st.pop();
            }
                str = str +ToSring(count);
                st.push(s.charAt(i));
            }
        }
        System.out.println(str);
    }
    public static String ToSring(long Count){
        String s="";
        while(Count > 0){
            s = (char) (Count%10 + '0')+ s ;
            Count /=10;
        }
        return s;
    }
}
  