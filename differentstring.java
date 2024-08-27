import java.util.Arrays;
import java.util.Scanner;

public class differentstring {
   public static void main(String[] args) {
    Scanner sc=new Scanner(System.in);
    int t=sc.nextInt();
    while(t!=0){
        t--;
        String str=sc.next();
      if(can(str))
      {
        System.out.println("YES");
        System.out.println(rear(str));
      }
      else
      System.out.println("NO");
    }
   } 
   public static boolean can(String s){
    if(s.length()==1)
    return false;
    for (int i = 1; i < s.length(); i++) {
        if (s.charAt(i) != s.charAt(0)) {
            return true;
        }
    }
    return false;
   }
   public static String rear(String s){
    char[] arr = s.toCharArray();
        Arrays.sort(arr);
        String sortedString = new String(arr);
        if (!sortedString.equals(s)) {
            return sortedString;
        }
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] != arr[0]) {
                char temp = arr[i];
                arr[i] = arr[0];
                arr[0] = temp;
                break;
            }
        }

        return new String(arr);
    }
   }
