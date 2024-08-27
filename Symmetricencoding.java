import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Scanner;

public class Symmetricencoding {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        while(t!=0){
            t--;
            int n=sc.nextInt();
            String b=sc.next();
           List<Character> l=new ArrayList<>();
            for(int i=0;i<b.length();i++)
            if(!l.contains(b.charAt(i)))
            l.add(b.charAt(i));
            Collections.sort(l);
       String r="";
       for(char ch:l)
       r+=ch;
       String ans=answer(b,r,n);
       System.out.println(ans);
        }
    }
    public static String answer(String b,String r,int n){
        String ans="";
        for(int i=0;i<n;i++){
            int in=index(r,b.charAt(i));
           ans+=r.charAt(r.length()-1-in); 
        }
        return ans;
    }
    public static int index(String r,char ch){
        for(int i=0;i<r.length();i++){
            if(r.charAt(i)==ch)
            return i;
        }
        return 0;
    }
}
