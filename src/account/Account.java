package account;

public interface Account {
    // Объявление абстрактного метода "депозит" для внесения указанной суммы
    void deposit(double amount);

    // Объявление абстрактного метода "вывести", чтобы вывести указанную сумму
    void withdraw(double amount);

    // Объявление абстрактного метода "получить баланс" для получения текущего баланса
    double getBalance();
}
