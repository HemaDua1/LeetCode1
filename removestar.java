import java.util.Stack;

public class removestar {
    public static void main(String[] args) {
String s="leet**cod*e";
     Stack<Character> st=new Stack<>();
     for(int i=0;i<s.length();i++){
        char ch=s.charAt(i);
     if(ch=='*')
     st.pop();
     else
     st.push(ch);
     }
     System.out.println(st.toString());
     StringBuilder sb = new StringBuilder();
        String result;
        while (!st.isEmpty()) {
                sb.append(st.pop());
            }
            System.out.println(sb.reverse().toString()); 
    }
}
