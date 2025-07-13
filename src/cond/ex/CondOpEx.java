package cond.ex;

public class CondOpEx {
    public static void main(String[] args) {
        int a,b;
        a = 10;
        b = 20; // 여기까지만 작성하고 밑은 못했다....ㅠㅠ 삼항연산자 형식이 기억이 안났음

        int max = (a > b) ? a : b; //삼항연산자가 switch 문에서 쓰이는 건줄 알았다. 아님!!
        // 변수에다가 조건이 맞는 값을 넣는 것

        System.out.println("더 큰 숫자는 " + max + "입니다.");
        }
    }

