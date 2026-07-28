
import java.util.Scanner;

public class Grade {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter your Score: ");
        int score = input.nextInt();

        if (score < 0 || score > 100) {
            System.out.println("Scorer has cheated on the Score");
        } else {
            String grade = (score >= 90) ? "A+"
                    : (score >= 80 && score <= 89) ? "A"
                            : (score >= 61 && score <= 79) ? "B" : (score <= 60 && score >= 50) ? "C" : "F";
            // System.out.println(grade);
            switch (grade) {
                case "A+":
                    System.out.println("Congartulations you have got A+");
                    break;
                case "A":
                    System.out.println("Congartulations you have got A");
                    break;
                case "B":
                    System.out.println("Congartulations you have got B");
                    break;
                case "C":
                    System.out.println("Congartulations you have got C");
                    break;
                case "F":
                    System.out.println("You have faild, Better luck next time");
                    break;
                default:
                    System.out.println("There is some problem to calculate your grade");
                    break;
            }
        }

        input.close();
    }
}
