package oop1.ex;

public class Account {
    int balance;

    // 입금
    void deposit(int amount) {
        balance += amount;
    }
    // 출금
    void withdraw(int amount) {
        if (balance < amount) {
            System.out.println("잔액 부족");

        } else {
            balance -= amount;
        }
    }

    // 잔액 출력
    void showBalance() {
        System.out.println("잔고 : " + balance);
    }
}
