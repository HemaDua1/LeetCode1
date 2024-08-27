public class fibo{
    public static void main(String[] args) {
        int[] dp=new int[6];
        System.out.println(fib(5,dp));
    }
    public static int memoization(int n,int[] dp){
        if(n==0||n==1){
            return n;
        }
        if(dp[n]!=0){
            return dp[n];
        }
        int n_1=memoization(n-1,dp);
        int n_2=memoization(n-2,dp);
        return dp[n]=n_1+n_2;
    }
    public static int tabulation(int n){
int[] dp=new int[n+1];
dp[0]=0;
dp[1]=1;
for(int i=2;i<=n;i++){
    int n_1=dp[i-1];
    int n_2=dp[i-2];
    dp[i]=n_1+n_2;
}
return dp[n];
    }
}