public class countalmostequal {
 public static void main(String[] args) {
    int arr[]={1,1,1,1,1};
    int ans=0;
    for(int i=0;i<arr.length;i++){
        for(int j=i+1;j<arr.length;j++){
            if(check(arr[i],arr[j]))
            ans++;
        }
    }
    System.out.println(ans);
 }  
 public static boolean check(int a,int b){
String str1=Integer.toString(a);
String str2=Integer.toString(b);
if(str1.equals(str2))
return true;
for(int i=0;i<str1.length();i++){
    for(int j=i+1;j<str1.length();j++){
        String swappedStr1 = swapDigits(str1, i, j);
        if (swappedStr1.equals(str2) || Integer.parseInt(swappedStr1) ==b)
            return true;
    }
}
for(int i=0;i<str2.length();i++){
    for(int j=i+1;j<str2.length();j++){
        String swappedStr2 = swapDigits(str2, i, j);
        if (swappedStr2.equals(str1) || Integer.parseInt(swappedStr2) ==a)
            return true;
    }
}
return  false;
 } 
 public static String swapDigits(String str,int i,int j){
    char[] charArray = str.toCharArray();
    char temp = charArray[i];
    charArray[i] = charArray[j];
    charArray[j] = temp;
    return new String(charArray);
 }
}
