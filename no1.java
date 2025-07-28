public class no1 {
    public static void main(String[] args) {
        System.out.println(paijo(7));
    }

    public static int paijo(int x) {
        if (x == 0)
            return 0;
        return 2 * paijo(x - 1) + x * x;
    }
}