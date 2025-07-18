package method;

public class Overloading1 {
    public static void main(String[] args) {
        System.out.println("1: " + add(1, 2));
        System.out.println("2: " + add(1, 2, 3));
    }

    public static int add(int a, int b) { // 이름은 같은 메서드지만 안의 정보(기능)이 다른 메서드 (메서드 오버로딩)
        System.out.println("1번 호출");
        return  a + b;
    }

    public static int add(int a, int b, int c) {
        System.out.println("2번 호출");
        return a + b + c;
    }
}
