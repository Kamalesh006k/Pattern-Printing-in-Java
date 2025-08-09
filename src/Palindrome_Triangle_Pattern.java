import java.util.Scanner;
public class Palindrome_Triangle_Pattern {
        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
            System.out.print("Enter the Value of n:");
            int n = sc.nextInt();

            for(int i=1; i<=n; i++) {
                for (int j = 1; j <= n - i; j++) {
                    System.out.print(" ");
                }
                for (int j = 1; j <= i; j++) {
                    System.out.print(i - j + 1);
                }
                if(i>1) {
                    for(int j=2; j<=i; j++){
                        System.out.print(j);
                    }
                }
                System.out.println();

            }
        }

}
