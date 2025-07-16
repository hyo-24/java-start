package array;

public class ArrayDi3 {
    public static void main(String[] args) {
        int[][] arr = {
                {1,2,3}, // 2차원은 초기화를 구조화 시켜서 할 수도 있다.
                {4,5,6}
        }; // 표현형이라서 ; 붙여야 한다
        for (int row = 0; row < arr.length; row++) {
            for (int column = 0; column < arr[row].length; column++) {
                System.out.println(arr[row][column]+ "");
            } // [row][column] 이라고 숫자 2개 아님! 2차원 위치다
            System.out.println(); // 행 하나 끝나고 줄바꿈을 해야 두번째 행 시작
        }

    }
}
