public class IndexString {
    public static void main(String[] args) {
        String txt = "Please locate where 'locate' occurs!";
        System.out.println(txt.indexOf("locate")); // Outputs 7
        System.out.println(txt.charAt(10));

        String txt1 = "Hello";
        String txt2 = "Hello";

        String txt3 = "Greetings";
        String txt4 = "Great things";
        System.out.println(txt1 == txt3);
        System.out.println(txt1.equals(txt2));
        System.out.println(txt3.equals(txt4));

        System.out.println("Before: [" + txt + "]");
        System.out.println("After:  [" + txt.trim() + "]");

        String spacedString = "    hi! how are you   ";
        System.out.println("Before: " + spacedString);
        System.out.println("After: " + spacedString.trim());

        // index of "e"

        String name = "Mehedi";
        System.out.println(name.indexOf("e"));

        // concatination
        int age = 25;
        System.out.println("My name is " + name + " and I am " + age + " years old.");
        System.out.println(txt1.concat(name));
    }
}