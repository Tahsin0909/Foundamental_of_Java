public class ReportCard {
    public static void main(String[] arg){
        String studentName = "Tahsin";
        int math = 70, english = 80, bangla = 40;
        int totalMark = math + english + bangla;
        double avgMark = totalMark / 3;

        System.out.println("Student Name is "+ studentName + "\nEnglish " + english + "\nmath "+ math+ "\nbangla " + bangla + "\nHis total Mark: "+totalMark+" and avg. mark: "+avgMark );
    }
}
