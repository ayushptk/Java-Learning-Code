class Bank {
    int balance = 1000;

    synchronized void withdraw(int amount) {
        if (balance >= amount) {
            System.out.println(Thread.currentThread().getName() + " is withdrawing...");
            balance -= amount;
            System.out.println("Remaining balance: " + balance);
        } else {
            System.out.println("Not enough balance for " + Thread.currentThread().getName());
        }
    }
}

public class WithSync {
    public static void main(String[] args) {
        Bank bank = new Bank();

        Thread t1 = new Thread(() -> bank.withdraw(700), "User1");
        Thread t2 = new Thread(() -> bank.withdraw(700), "User2");

        t1.start();
        t2.start();
    }
}
