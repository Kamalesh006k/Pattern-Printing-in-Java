import java.util.Scanner;
public class Square_Fill_Pattern {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the Value of n:");
        int n = sc.nextInt();

//        Square pattern
        for(int i=1; i<=n; i++){
            for(int j=1; j<=n; j++){
                System.out.print("*");
            }System.out.println();
        }
    }
}