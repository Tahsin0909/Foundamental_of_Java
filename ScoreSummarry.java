public class ScoreSummarry {
    public static void main(String[] args) {
        int[] scores = { 85, 92, 78, 90, 65 };
        int highest = scores[0];
        int lowest = scores[0];
        int sum = 0;

        for (int score : scores) {
            if (score > highest) {
                highest = score;
            }
            if (lowest > score) {
                lowest = score;
            }
            sum += score;
        }
        System.out.println("Highest " + highest);
        System.out.println("Lowest " + lowest);
        System.out.println("Sum " + sum);

        double average = (double) sum / scores.length;
        System.out.println("avarage " + average);
    }
}
