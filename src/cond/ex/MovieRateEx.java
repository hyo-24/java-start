package cond.ex;

public class MovieRateEx {
    public static void main(String[] args) {
        double rating = 7;
        String m9 = "'어바웃타임'을 추천합니다.";
        String m8 = "'토이 스토리'를 추천합니다.";
        String m7 = "'고질라'를 추천합니다.";

        if (rating == 9) {
            System.out.println(m9);
        } else if (rating <= 8 && rating > 7) {
            System.out.println(m9);
            System.out.println(m8);
        } else if (rating <= 7) {
            System.out.println(m9); // 한 줄씩 다 나오게 하려고...ㅋㅋㅋ
            System.out.println(m8);
            System.out.println(m7);
        }

        double ratings = 7;

        if (ratings <= 9) {
            System.out.println("'어바웃타임'을 추천합니다.");
        }
        /* if 문이 연속적으로 나올 때 순서대로 하나하나 다 수행을 하는 점을 이용한 코드!
        하나 수행했으면 빠져나오는 건 else(아니면)이 있을 때 if의 조건이 참일 때다! */
        if (ratings <= 8) {
            System.out.println("'토이 스토리'를 추천합니다.");
        }
        if (ratings <= 7) {
            System.out.println("'고질라'를 추천합니다");
        }
    }
}
