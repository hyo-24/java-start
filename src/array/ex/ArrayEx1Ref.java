package array.ex;

public class ArrayEx1Ref {
    public static void main(String[] args) {
        int[] student; // int[] = student 했었음...
        student = new int[]{90,80,70,60,50};

        int total = 0;
        for (int i = 0; i < student.length; i++) {
            total += student[i]; // 배열의 순서를 지정하는 수가 필요해서 i를 사용
        }

        double average = (double) total / student.length; // 갯수는 i가 아니고 length!! i는 for문 안에서 종료됨
        System.out.println("점수 총합: " + total);
        System.out.println("점수 평균: "+ average);
    }
} // 각각 점수를 하나씩 총합 변수에 대입해서 누적하는 걸 만들어야 한다. 평균은 실수로 지정하는거 까먹지 말고.
