package codereview;

public class ArrayEx1R {
    public static void main(String[] args) {
        int [] student;
        student = new int[]{90,80,70,60,50};
        int total = 0;

        for (int i = 0; i < student.length; i++) {
            total += student[i];
        }
        double average = (double) total / student.length;
        System.out.println("점수 총합: " + total);
        System.out.println("점수 평균: " + average);
    }
}
