
public class Grade {
    public static void main(String[] args) {
        int score = -110;
        if (score < 0 || score > 100) {
            System.out.println("Scorer has cheated on the Score");
        } else {
            String grade = (score >= 90) ? "A+"
                    : (score >= 80 && score <= 89) ? "A"
                            : (score >= 61 && score <= 79) ? "B" : (score <= 60 && score >= 50) ? "C" : "D";
            System.out.println(grade);
        }
    }
}
