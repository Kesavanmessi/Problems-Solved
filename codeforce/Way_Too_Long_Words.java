import java.util.Scanner;

public class Way_Too_Long_Words {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        
        for (int i = 0; i < n; i++) {
            String word = sc.next();

            if (word.length() > 10) {
                String shortened = word.charAt(0) + String.valueOf(word.length() - 2) + word.charAt(word.length() - 1);
                System.out.println(shortened);
            }           
            else {  
                System.out.println(word);
            }   
    
        }
    }
    
}
