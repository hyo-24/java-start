package cond.ex;

public class DistanceEx {
    public static void main(String[] args) {
        int distance = 3;

        if (distance <= 1) {
            System.out.println("도보를 이용하세요.");
        } else if (distance <= 10) {
            System.out.println("자전거를 이용하세요.");
        } else if (distance <= 100) {
            System.out.println("자동차를 이용하세요.");
        } else { // else 는 ()안에 조건을 넣지 않는다. 그냥 나머지는 이렇게 해라 라는 조건문이기 때문!
            System.out.println("비행기를 이용하세요.");
        }
    }
}
