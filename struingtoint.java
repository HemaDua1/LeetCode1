public class struingtoint {
    public static void main(String[] args) {
        String s="1337c0d3";
        long ans=0;
        s=s.trim();  
        int i=0,sign=1;
        if(s.charAt(i)=='+'||s.charAt(i)=='-'){
          sign=s.charAt(i)=='-'?-1:1;
          i++;
        }
        for(;i<s.length();i++){
          char ch=s.charAt(i);
          if(!Character.isDigit(ch)){
              break;
          }
          ans=ans*10+ch-'0';
          if(sign==1&&ans>Integer.MAX_VALUE)
              ans=Integer.MAX_VALUE;
           if(sign==-1&&-ans<Integer.MIN_VALUE)
  ans=Integer.MIN_VALUE;
        }
        ans*=sign;
  System.out.println((int)ans);
    }
}
