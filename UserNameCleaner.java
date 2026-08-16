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