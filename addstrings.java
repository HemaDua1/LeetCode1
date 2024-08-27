public class addstrings {
    public static void main(String[] args) {
      String num1="456";
      String num2="77";
      StringBuilder sb=new StringBuilder();
      int i=num1.length()-1;
      int j=num2.length()-1;
      int c=0;
      while(i>=0||j>=0||c>0){
      int n=(i>=0)?num1.charAt(i)-'0':0;
      int m=(j>=0)?num2.charAt(j)-'0':0;
      int s=n+m+c;
       c=s/10;
       sb.append(s%10);
       i--;
       j--;
      }
      System.out.println(sb.reverse().toString());  
    }
}
