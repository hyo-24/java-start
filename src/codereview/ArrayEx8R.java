package codereview;

import java.util.Scanner;

public class ArrayEx8R {
    public static void main(String[] args) { // 학생 여러명의 여러 과목 점수를 계산해서 출력 = 2차원 배열 활용
        double average;
        Scanner scanner = new Scanner(System.in);

        System.out.print("학생수를 입력하세요: ");
        int count = scanner.nextInt();
        int[][] scores = new int[count][3]; // 점수가 들어가는 배열이니까
        String[] subject = new String[]{"국어","영어","수학"}; // 따로 질문할 때 쓸 문자들 배열 만들기


        for (int i = 0; i < count; i++) {
            System.out.println((i+1)+"번 학생의 성적을 입력하세요: ");
            for (int j = 0; j < 3; j++) {
                System.out.print(subject[j] + " 점수: ");
                scores[i][j] = scanner.nextInt(); // 배열에 각각 저장
            }
        }

        for (int i = 0; i < count; i++) {
            int total = 0;
            for (int j = 0; j < 3; j++) {
                total += scores[i][j]; // 저장된 점수 과목들 누적합
            }
            average = (double) total / 3;
            System.out.println((i+1)+"번 학생의 총점: "+total+", 평균: "+average); // 한 학생 당 출력되야 하니까 행 안에서 출력
        }

    }
}
