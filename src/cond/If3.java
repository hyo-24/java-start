package cond;

public class If3 {
    public static void main(String[] args) {
        int age = 25;

        if (age < 7) {
            System.out.println("미취학");
        } else {
            if (age <= 13) {
                System.out.println("초등학생");
            } else {
                if (age <= 16) {
                    System.out.println("중학생");
                } else {
                    if (age <= 19) {
                        System.out.println("고등학생");
                    } else {
                        System.out.println("성인");
                    }
                }
            }
        }

        int age2 = 56;

        if(age2 < 7) {
            System.out.println("미취학");
        }
        if(age2 >= 8 && age2 <= 13) {
            System.out.println("초등학생");
        }
        if(age2 >= 14 && age2 <= 16) {
            System.out.println("중학생");
        }
        if(age2 >=17 && age2 <= 19) {
            System.out.println("고등학생");
        }
        if(age2 >= 20) {
            System.out.println("성인");
        }
    }
}



