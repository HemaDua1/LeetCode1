import java.util.HashMap;
import java.util.HashSet;

public class uniquenoofsequence {
   public static void main(String[] args) {
    int arr[]={1,2,2,1,1,3};
  HashMap<Integer,Integer> h=new HashMap<Integer,Integer>();
  HashSet<Integer> s=new HashSet<>();
for(int i=0;i<arr.length;i++){
    if(h.containsKey(arr[i]))
    h.put(arr[i],h.get(arr[i])+1);
    else
    h.put(arr[i],1);
}
System.out.println(h);
boolean ans=true;
for(int c:h.values()){
    if(!s.add(c)){
        ans=false;
        break;
    }
}
System.out.println(ans);
    }
   } 
