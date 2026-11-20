public class Q3 {
    public static void main(String[] args) {
        if (args.length < 1) {
            System.out.println("Veuillez fournir un nombre N.");
            return;
        }
        try {
            int n = Integer.parseInt(args[0]);
            for (int i = n; i >= 1; i--) {
                System.out.print(i + " ");
            }
            System.out.println();
        } catch (NumberFormatException e) {
            System.out.println("Argument invalide.");
        }
    }
}
