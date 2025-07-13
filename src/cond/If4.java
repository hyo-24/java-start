package cond;

public class If4 {
    public static void main(String[] args) {
        int age = 9;

        if(age < 7) {
            System.out.println("미취학");
        } else if (age >= 8 && age <= 13) {
            System.out.println("초등학생");
        } else if (age >= 14 && age <= 16) {
            System.out.println("중학생");
        } else if (age >= 17 && age <= 19) {
            System.out.println("고등학생");
        } else {
            System.out.println("성인");
        } // 범위를 일일이 다 넣을 필요 없다!!!!

        int age2 = 3;

        if(age2 <7) {
            System.out.println("미취학");
        } else if (age2 <=14) {
            System.out.println("초등학생");
        } else if (age2 <= 16) {
            System.out.println("중학생");
        } else if (age2 <= 19) {
            System.out.println("고등학생");
        } else {
            System.out.println("성인");
        } // else if 쓸 때는 위에 조건에 만족하지 않는 값은 버린다. 일일이 쓸 필요 없음.
    }
}
