public class MultiplicationTable {
    public static void main(String[] args) {
        int table = 5;
        for (int i = table; i >= 1; i--) {
            // System.out.println("First " + i);
            for (int j = 1; j <= 10; j++) {
                System.out.println(i + " x " + j + " = " + i * j );
                // System.out.println("Multipclication " + i*j);
            }
            System.out.println("\b");
            // if (table == i)
            //     break;
        }
    }
}
