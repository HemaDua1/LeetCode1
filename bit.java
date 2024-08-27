public class bit{
public static void main(String[] args) {
    int num=5;
    String str=Integer.toBinaryString(num);
    String gtr="";
    for(int i=0;i<str.length();i++){
      char ch=str.charAt(i);
      if(ch=='1')
      gtr+='0';
      else
      gtr+='1';
    }  
    System.out.println(Integer.parseInt(gtr,2));
    // int number_of_bits = (int)(Math.floor(Math.log(n) / Math.log(2)))+ 1;
    //           return ((1 << number_of_bits) - 1) ^ n;
  }   
}