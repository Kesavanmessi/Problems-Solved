

import java.util.Scanner;
public class Next_Round{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int n = sc.nextInt();
        int k = sc.nextInt();

        int[] ar = new int[n];
        
      for(int i = 0 ; i < n ; i++)
         ar[i] = sc.nextInt();
            
    
       int score = ar[k - 1];
       
       int count = 0;
       
       for(int i : ar)
         if(i >= score)
           count++;

        System.out.println(count);
         
}
}