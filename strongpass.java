import java.util.Scanner;

public class strongpass {
    public static void main(String[] args) {
       Scanner sc=new Scanner(System.in);
       int t=sc.nextInt();
       while(t!=0){
        t--;
        String str=sc.next();
        String bestpass="";
        int bestime=-1;
        for(char c='a';c<='z';c++){
for(int i=0;i<str.length();i++){
    String newpass=str.substring(0,i)+c+str.substring(i);
  int time=Time(newpass) ;
if(time>bestime){
    bestpass=newpass;
    bestime=time;
}
}
        }
        System.out.println(bestpass);
       } 
    }
    public static int Time(String str){
        int t=2;
for(int i=1;i<str.length();i++){
    if(str.charAt(i)==str.charAt(i-1))
    t+=1;
    else
    t+=2;
}
return t;
    }
}
