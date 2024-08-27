import java.util.Scanner;

public class verifypass {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        while(t!=0){
            t--;
            int n=sc.nextInt();
            String str=sc.next();
            System.out.println(check(str,n)?"YES":"NO");
        }
    }
    public static boolean check(String str,int n){
        StringBuilder d=new StringBuilder();
        StringBuilder a=new StringBuilder();
        for(int i=0;i<n;i++){
            char ch=str.charAt(i);
            if(Character.isDigit(ch))
            d.append(ch);
            else
            a.append(ch);
        }
        if(!issort(d))
        return false;
        if(!issort(a))
        return false;
        for(int i=d.length();i<n;i++){
            if(Character.isDigit(str.charAt(i)))
return false;
        }
        return true;
    }
    public static boolean issort(StringBuilder d){
        for(int i=1;i<d.length();i++){
if(d.charAt(i)<d.charAt(i-1))
return false;
        }
        return true;
    }
}
