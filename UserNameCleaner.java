    // public class UserNameCleaner {
    //     public static void main(String args[]) {
    //         String name = " Tahsin Dev";
    //         String cleaner = name.trim().toLowerCase().replace(" ","_");
    //         Boolean contain = cleaner.contains("a");
    //         System.out.println(name);
    //         System.out.println(cleaner);
    //         System.out.println(contain);
    //     }
    // }
// Result 9.5/10 
// Posilshed Version 
public class UserNameCleaner {
    public static void main(String[] args) {
        String name = " Tahsin Dev ";
        String cleanedName = name.trim().toLowerCase().replace(" ", "_");
        boolean contain = cleanedName.contains("a");

        System.out.println("Original: " + name);
        System.out.println("Cleaned: " + cleanedName);
        System.out.println("Contains 'a': " + contain);
    }
}