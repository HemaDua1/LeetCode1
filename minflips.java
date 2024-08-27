public class minflips {
   public static void main(String[] args) {
    int a=2,b=6,c=5;
    int ans=0;
   for(int i=0;i<30;i++){
    int x=a>>i&1;
    int y=b>>i&1;
    int z=c>>i&1;
    if((x|y)!=z){
        if(x==1&y==1)
        ans+=2;
        else
        ans+=1;
    }
}
System.out.println(ans);
   } 
}
