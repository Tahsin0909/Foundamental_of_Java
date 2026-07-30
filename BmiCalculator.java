public class BmiCalculator {
    public static void main(String[] args) {
        int weight = 75;
        double height = 1.56;
        // double bmi = weight / (height * height);
        double bmi = weight / Calculator.multiplyNumber(height, height);
        System.out.println(bmi);
        long roundedBmi = Math.round(bmi);
        System.out.println(roundedBmi);
        boolean isOverweight = roundedBmi > 25;
        System.out.println(isOverweight);
    }
}
