public class fractionaddition {
   public static void main(String[] args) {
    String e="-1/2+1/2+1/3";
    int n=0,d=1;
    if(Character.isDigit(e.charAt(0)))
    e='+'+e;
    int i=0;
    while(i<e.length()){
     int s=e.charAt(i)=='+'?1:-1;
      i++;
      int ns=i;
      while(e.charAt(i)!='/')
      i++;
int cn=Integer.parseInt(e.substring(ns,i))*s;
i++;
int ds=i;
while(i<e.length()&&Character.isDigit(e.charAt(i)))
i++;
int cd=Integer.parseInt(e.substring(ds,i));
n=n*cd+cn*d;
d=d*cd;
int gcd=gcd(Math.abs(n),Math.abs(d));
n=n/gcd;
d=d/gcd;
    }
    if(d<0){
        n=-n;
        d=-d;
    }
    System.out.println(n+"/"+d);
   }
   public static int gcd(int a,int b)
   {
    if(b==0)
    return a;
    return gcd(b,a%b);
   } 
}
