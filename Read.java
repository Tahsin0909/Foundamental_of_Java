import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class Read {
    public static void main(String[] args) {

        String htmlContent =
        "<!DOCTYPE html>\n" +
        "<html lang=\"en\">\n" +
        "<head>\n" +
        "    <meta charset=\"UTF-8\">\n" +
        "    <meta name=\"viewport\" content=\"width=device-width, initial-scale=1.0\">\n" +
        "    <title>Document</title>\n" +
        "</head>\n" +
        "<body>\n" +
        "    \n" +
        "</body>\n" +
        "</html>";

        try {
            File file1 = new File("one.html");
            File file2 = new File("two.html");

            File fileToCreate;

            if (file1.exists()) {
                fileToCreate = file2;
            } else {
                fileToCreate = file1;
            }

            if (fileToCreate.createNewFile()) {
                FileWriter writer = new FileWriter(fileToCreate);
                writer.write(htmlContent);
                writer.close();

                System.out.println(fileToCreate.getName() + " created with HTML content");
            } else {
                System.out.println(fileToCreate.getName() + " already exists");
            }

        } catch (IOException e) {
            System.out.println("Error while creating file");
        }
    }
}