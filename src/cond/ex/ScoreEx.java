package cond.ex;

public class ScoreEx {
    public static void main(String[] args) {
        int score = 90;

        if (score >= 90) {
            System.out.println("학점은 A입니다."); // 중괄호 {}를 안 닫았다!!!!!!! 조건 달 때마다 닫아야 함!!!
        } else if (score >= 80 && score < 90) {
                System.out.println("학점은 B입니다.");
            } else if (score >= 70 && score < 80) {
                System.out.println("학점은 C입니다.");
            } else if (score >= 60 && score < 70) {
                System.out.println("학점은 D입니다.");
            }  else {
                System.out.println("학점은 F입니다.");
            }

        }
    }

