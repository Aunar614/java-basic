package oop1.ex;

public class AccountMain {

    public static void main(String[] args) {
        Account ac = new Account();

        ac.deposit(10000);
        ac.withdraw(9000);
        ac.withdraw(2000);
        ac.showBalance();
    }
}
