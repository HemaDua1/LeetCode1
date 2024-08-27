public class closestplai {
 public static void main(String[] args) {
  String n="123";
        int rp=Integer.parseInt(n)-1;
        while(!ispalin(String.valueOf(rp)))
        rp--;
        int sp=Integer.parseInt(n)+1;
         while(!ispalin(String.valueOf(sp)))
        sp++;
        if(Math.abs(Integer.parseInt(n)-sp)<Math.abs(Integer.parseInt(n)-rp))
        System.out.println(sp);
        else
        System.out.println(rp);
      }
      public static boolean ispalin(String str){
  int s=0;
  int e=str.length()-1;
  while(s<=e){
      if(str.charAt(s)!=str.charAt(e))
      return false;
      s++;
      e--;
  }
  return true;
 }   
}
// public String nearestPalindromic(String n) {
//     int l = n.length();
//     if (n.equals("1")) 
//         return "0";
//     if (n.equals("0")) 
//         return "1";
//     long num = Long.parseLong(n);
//     if (num <= 10)
//         return String.valueOf(num - 1);
//     if (num == 11)
//         return "9";
//     long[] can = new long[5];
//     long prefix = Long.parseLong(n.substring(0, (l + 1) / 2));
//     can[0] = gen(prefix, l);       
//     can[1] = gen(prefix + 1, l); 
//     can[2] = gen(prefix - 1, l); 
//     can[3] = (long) Math.pow(10, l - 1) - 1; 
//     can[4] = (long) Math.pow(10, l) + 1;
//     long near = -1;
//     for (long c : can) {
//         if (c != num) {
//             if (near == -1 || Math.abs(c - num) < Math.abs(near - num) || 
//                 (Math.abs(c - num) == Math.abs(near - num) && c < near)) {
//                 near = c;
//             }
//         }
//     }

//     return String.valueOf(near);
// }
// public long gen(long prefix, int l) {
//     StringBuilder sb = new StringBuilder(String.valueOf(prefix));
//     String str = sb.append(new StringBuilder(String.valueOf(prefix)).reverse().substring(l % 2)).toString();
//     return Long.parseLong(str);
// }
// }
