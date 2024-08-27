import java.util.Stack;

public class decodestring {
    public static void main(String[] args) {
                String str = "3[a]2[bc]";
                Stack<Character> st = new Stack<>();
                String ans = ""; 
                for (int i = 0; i < str.length(); i++) {
                    char ch = str.charAt(i);
                    if (ch == ']') {
                        String temp = "";
                        while (st.peek() != '[') {
                            temp = st.pop() + temp;
                        }
                        st.pop();
                        String num = "";
                        while (!st.isEmpty() && Character.isDigit(st.peek())) {
                            num = st.pop() + num;
                        }
                        int repeatCount = Integer.parseInt(num);
                        String repeatedString = "";
                        for (int k = 0; k < repeatCount; k++) {
                            repeatedString += temp;
                        }
                        for (char c : repeatedString.toCharArray()) {
                            st.push(c);
                        }
        
                    } else {
                        st.push(ch);
                    }
                }
                while (!st.isEmpty()) {
                    ans = st.pop() + ans;
                }
                System.out.println(ans);
            }
        }
        