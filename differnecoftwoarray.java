import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class differnecoftwoarray {
   public static void main(String[] args) {
    int nums1[]={1,2,3};
    int nums2[]={2,4,6};
    // Set<Integer> s=new HashSet<>();
    // Set<Integer> s1=new HashSet<>();
    // for(int i:nums1){
    //     boolean f=true;
    //     for(int j:nums2){
    //     if(i==j){
    //   f=false;
    //   break;
    //     }
    //     }  
    //     if(f)
    //       s.add(i); 
    // }
    //  for(int i:nums2){
    //     boolean f=true;
    //     for(int j:nums1){
    //     if(i==j)
    //   f=false;
    //     }  
    //     if(f)
    //       s1.add(i); 
    // }
    // List<List<Integer>> l=new ArrayList<>();
    // l.add(new ArrayList<>(s));
    // l.add(new ArrayList<>(s1));
    // System.out.println(l);
    Set<Integer> set1= new HashSet<>();
        Set<Integer> set2 = new HashSet<>();
        ArrayList<Integer> ans1 = new ArrayList<>();
        ArrayList<Integer> ans2 = new ArrayList<>();
        List<List<Integer>> ans = new ArrayList<>();
        for(int i : nums1){
            set1.add(i);
        }
        for(int i : nums2){
            set2.add(i);
        }
        for(int i : set1){
            if(!set2.contains(i)){
                ans1.add(i);
            }
        }
        for(int i : set2){
            if(!set1.contains(i)){
                ans2.add(i);
            }
        }
        ans.add(ans1);
        ans.add(ans2);
         System.out.println(ans);
    }
}
