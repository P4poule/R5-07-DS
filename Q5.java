public class Q5 {
    public static void main(String[] args) {
        if (args.length < 1) return;
        int n = Integer.parseInt(args[0]);
        // Issue 1 : triangle inversé (de 1 à n)
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= i; j++) {
                // Issue 2 : afficher 'x' au lieu du chiffre
                System.out.print("x ");
            }
            System.out.println();
        }
    }
}
