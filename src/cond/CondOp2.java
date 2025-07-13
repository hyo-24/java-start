package cond;

public class CondOp2 {
    public static void main(String[] args) {
        int age = 15;
        String status = (age >= 18) ? "성인" : "미성년자"; // 변수 선언에 바로 조건, 참 표현식, 거짓 표현식 이 3가지 항이 나온다!
        System.out.println("age = " + age + " status = " + status);
    }
}
