public class patternFive {
    public static void main(String[] args) {
        pattern5(5);
    }
    static void pattern5(int n){
        for (int row = 1; row < 2*n; row++) {
            int c;
            if (row > n) {
                c = 2*n - row;
            }
            else{
                c = row;
            }
            for (int col = 1; col <= c; col++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}
