package array.ex;

import java.util.Scanner;

public class ArrayEx7 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int [][] students = new int[4][3];
        String[] subjects = {"국어","영어","수학"};
        int scores = 0;
        double average;

        for (int i = 0; i < students.length; i++) {
                System.out.println((i+1)+"번 학생의 성적을 입력하세요: ");
            for (int j = 0; j < subjects.length; j++) {
                System.out.print(subjects[j]+" 점수: ");
                scores = scanner.nextInt();
            }
        }
        average = (double) scores / subjects.length;

        for (int i = 0; i < students.length; i++) {
            System.out.println((i+1)+"번 학생의 총점: "+ scores+ ", 평균: "+ average);
        }

    }
}
