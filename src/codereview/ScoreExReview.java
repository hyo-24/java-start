package codereview;

public class ScoreExReview {
    public static void main(String[] args) {
        int scores = 5;

        String grade;

        if (scores >= 90) {
            grade = "A";
            System.out.println("학점은 "+ grade + " 입니다.");
        } else if (scores >= 80) {
            grade = "B";
            System.out.println("학점은 "+ grade + " 입니다.");
        } else if (scores >= 70) {
            grade = "C";
            System.out.println("학점은 "+ grade + " 입니다.");
        } else if (scores >= 60) {
            grade = "D";
            System.out.println("학점은 "+ grade + " 입니다.");
        } else {
            grade = "F";
            System.out.println("학점은 "+ grade + " 입니다.");
        }


    }
}
