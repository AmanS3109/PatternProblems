public class inverseTraingle {
    public static void main(String[] args) {
        pattern3Optimized(5);
    }
    static void pattern3(int n){
        for (int row = 1; row <= n; row++){
            for (int col = 1; col <= n-row+1; col++){
                System.out.print("* ");
            }
            System.out.println(); //O(N^2)
        }
    }
    static void pattern3Optimized(int n){
        for (int row = n; row > 0; row--) {
            System.out.println("* ".repeat(row));
        }
    }
} 




