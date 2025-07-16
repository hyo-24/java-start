package array.ex;

import java.util.Scanner;

public class ArrayEx8 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int total = 0;
        double average;

        System.out.print("학생 수를 입력하세요: ");
        int row = scanner.nextInt();
        int[][] students = new int[row][3];
        String[] subjects = {"국어","영어","수학"};

        for (int i = 0; i < row; i++) {
            System.out.println((i+1)+"번 학생의 성적을 입력하세요: ");
            for (int j = 0; j < subjects.length; j++) {
                System.out.print(subjects[j]+" 점수: "); // 가져올게 문자니까 (j+1) 하면 안된다
                total += scanner.nextInt();
            }
        }
        average = (double) total / subjects.length;

        for (int i = 0; i < students.length; i++) {
            System.out.println((i+1)+"번 학생의 총점: "+total+", 평균: "+average);
        }
    }
}
