public class finalstate {
    private static final int MOD = 1000000007;
   public static void main(String[] args) {
    int[] nums={100000,2000};
    int m=1000000,k=2;
    for(int i=0;i<k;i++){
        int mini=min(nums);
       nums[mini]*=m;
          }
           for (int i = 0; i < nums.length; i++) {
                   nums[i] = nums[i] % MOD;
                   System.out.print(nums[i]+" "); 
               }   
           }
           public static int min(int[] arr){
               int min=Integer.MAX_VALUE;
               int j=0;
               for(int i=0;i<arr.length;i++){
           if(arr[i]<min){
               min=arr[i];
               j=i;
           }
               }
               return j;
           }
       }
