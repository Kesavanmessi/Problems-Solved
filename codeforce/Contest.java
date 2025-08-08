

import java.util.Scanner;
public class Contest{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int n = sc.nextInt();
        
        int count = 0;

        while(n-- > 0)
        {
         int sum = sc.nextInt() + sc.nextInt() + sc.nextInt();
         
         if(sum > 1)
           count++;
            
        }

        System.out.println(count);
         
}
}
