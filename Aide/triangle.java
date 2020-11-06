public class Triangle {
    public static void main(String[] args) {
        triangle(Integer.parseInt(args[0]));
    }
    public static void triangle(int n) {
        for (int i=0; i<n; i++) {
            System.out.println("*".repeat(n-i));
        }
    }
}
