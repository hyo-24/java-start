package codereview;

public class GradeSwitchExReview {
    public static void main(String[] args) {
        String grade = "A";

        switch (grade) {
            case "A":
                System.out.println("탁월한 성과입니다!"); // switch문에서는 각각 비교해서 같은 부분만 코드 실행하는게 아니라 break를 걸어줘야 한다.
                break; // case는 우리가 보기엔 각각 따로 블록처럼 보이지만 실제로는 자바가 그렇게 묶어주지 않기 때문에 붙여야한다.
            case "B":
                System.out.println("좋은 성과입니다!");
                break;
            case "C":
                System.out.println("준수한 성과입니다.");
                break;
            case "D":
                System.out.println("향상이 필요합니다.");
                break;
            case "F":
                System.out.println("불합격입니다.");
                break;
            default:
                System.out.println("잘못된 학점입니다.");
        }
    }
}
