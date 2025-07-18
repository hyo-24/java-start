package method.ex;

public class MethodEx3 {
    public static void main(String[] args) {

        int balance = 10000;

        balance = deposit(balance, 1000);
        balance = withdraw(balance, 2000);

        System.out.println("최종 잔액: " + balance + "원");
    }

    public static int deposit(int balance, int amount){ // 나는 요청할 때랑 매개변수 모양이 같아야 하는 줄 알았다...
        balance += amount;
        System.out.println(amount + "원을 입금하였습니다. 현재 잔액: " + balance + "원");
        return balance;
    }

    public static int withdraw(int balance, int amount) { // 자리가 중요하지 같아야하는게 아니다. 요청의 값을 변수에 넣을 수 있다.
        if (balance >= amount) { // 출금액이 잔액보다 크지 않으면 출금이 되도록 만든다.
            balance -= amount;
            System.out.println(amount + "원을 출금하였습니다. 현재 잔액: " + balance + "원");
        } else {
            System.out.println(amount + "원을 출금하려 했으나 잔액이 부족합니다.");
        }
        return balance;
    }
}
