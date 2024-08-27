import java.util.*;
public class lcm{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        for(int i=0;i<t;i++){
            int n=sc.nextInt();
            int[] c=new int[2];
            print(n,c);
            System.out.println(c[0]+" "+c[1]);
        }
    }
    public static void print(int n,int[] c){
        int min=Integer.MAX_VALUE;
      for(int i=1;i<=n;i++){
int m=lcm(i,n-i);
if(m<min){
    min=m;
    c[0]=i;
    c[1]=n-i;
}
      }  
    }
    public static int lcm(int i,int j){
       return (i*j)/gcd(i,j);
    }
    public static int gcd(int a,int b){
while(a>0&&b>0){
    if(a>b)
    a=a%b;
    else
    b=b%a;
}
if(a==0)
return b;
return a;
    }
}