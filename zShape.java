import java.util.*;
public class zShape {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        pattern6(n);
        sc.close();
    }
    static void pattern6(int n){
        for (int row = 1; row <= n; row++) {
            if (n == 1 || n == row) {
                System.out.print("* ".repeat(n));
            }
            else{
                System.out.println(" ".repeat(n - row) + "*");
            }
        }
    }
}
