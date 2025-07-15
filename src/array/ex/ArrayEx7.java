package array.ex;

import java.util.Scanner;

public class ArrayEx7 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[][] scores = new int[4][3];
        String[] subjects = {"국어","영어","수학"};

        for (int i = 0; i < 4; i++) {
            System.out.println((i+1)+"번 학생의 성적을 입력하세요: ");
            for (int j = 0; j < 3; j++) {
                System.out.print(subjects[j]+" 점수: ");
                scores[i][j] = scanner.nextInt(); // 두 자리에 각각 넣는게 아니라 한 공간의 주소에 넣는 것!
            }
        }
        for (int i = 0; i < 4; i++) {
            int total = 0; // int total; 은 선언만 하는 거라서 안된다! 지역변수는 초기화 필수!
            for (int j = 0; j < 3; j++) {
                total += scores[i][j]; // += 는 대입연산자 일 뿐 초기화는 아니다!
            }
            double average = (double) total/ subjects.length;
            System.out.println((i+1)+"번의 학생의 총점: "+total+ ", 평균: "+ average);
        }

    }
}
