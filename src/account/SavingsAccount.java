package account;

// Объявляем класс SavingsAccount, который реализует интерфейс учетной записи
public class SavingsAccount implements Account{
    // Объявление закрытых переменных экземпляров для хранения баланса и процентной ставки
    private double balance;
    private double interestRate;

    // Конструктор для инициализации баланса и процентной ставки
    public SavingsAccount(double initialDeposit, double interestRate) {
        this.balance = initialDeposit;
        this.interestRate = interestRate;
    }

    // Реализация метода "getBalance" для получения текущего баланса
    @Override
    public double getBalance() {
        return balance;
    }

    public double getInterestRate() {
        return interestRate;
    }

    // Реализация метода "пополнения счета", чтобы добавить указанную сумму к балансу
    @Override
    public void deposit(double amount) {
        balance += amount;
    }

    // Реализация метода "вывести", чтобы вычесть указанную сумму из баланса
    @Override
    public void withdraw(double amount) {
        balance -= amount;
    }

    // Способ начисления процентов на остаток
    public void applyInterest() {
        // Применение процентной ставки (в процентах) к остатку на 1 год
        balance += balance * interestRate / 100;
    }
}
