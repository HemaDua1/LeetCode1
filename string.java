import java.util.Scanner;

public class string {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        while(t!=0){
            t--;
            int n=sc.nextInt();
            int k=sc.nextInt();
            String s=sc.next();
            int currentBCount = 0;
            for (char ch : s.toCharArray()) {
                if (ch == 'B') currentBCount++;
            }
            if (currentBCount == k) {
                System.out.println(0);
                continue;
            }
            int operationsCount = 0;
            StringBuilder operations = new StringBuilder();
            if (currentBCount < k) {
                int requiredBCount = k - currentBCount;
                int i = 0;
                while (requiredBCount > 0 && i < n) {
                    if (s.charAt(i) == 'A') {
                        operations.append((i + 1)).append(" B\n");
                        operationsCount++;
                        requiredBCount -= (i + 1) - currentBCount;
                        break;
                    }
                    i++;
                }
            }
            if (currentBCount > k) {
                int extraBCount = currentBCount - k;
                int i = n - 1;
                while (extraBCount > 0 && i >= 0) {
                    if (s.charAt(i) == 'B') {
                        operations.append((i + 1)).append(" A\n");
                        operationsCount++;
                        extraBCount -= (i + 1) - currentBCount;
                        break;
                    }
                    i--;
                }
            }
            System.out.println(operationsCount);
            System.out.print(operations);
        }
    }
}
