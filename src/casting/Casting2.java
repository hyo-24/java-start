package casting;

public class Casting2 {
    public static void main(String[] args) {
        double doubleValue = 1.5;
        int intValue = 0;

        //intValue = doubleValue; ->  큰 범위를 작은 범위 안에 넣을 수 없다! 컴파일 오류!!
        intValue = (int) doubleValue; // 형 변환 (단, 손실이 일어날 수 있음)
        System.out.println(intValue);
    }
}
