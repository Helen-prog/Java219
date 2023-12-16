package account;

// Объявляем класс CurrentAccount, который реализует интерфейс учетной записи
public class CurrentAccount implements Account {
    // Объявление закрытой переменной экземпляра для хранения баланса и лимита овердрафта
    /* Овердрафт — это краткосрочный заем, который позволяет быстро получить недостающую сумму
    без предварительного согласования с банком. По сути, это просто возможность потратить больше денег,
    чем в текущий момент находится на вашем счете, а затем вернуть банку занятую у него сумму.
    Однако за пользование деньгами банка придется заплатить небольшую комиссию либо проценты от задолженности.*/
    private double balance;
    private double overdraftLimit;

    // Конструктор для инициализации баланса и лимита овердрафта
    public CurrentAccount(double initialDeposit, double overdraftLimit) {
        this.balance = initialDeposit;
        this.overdraftLimit = overdraftLimit;
    }

    // Реализуйте метод "getBalance" для получения текущего баланса
    @Override
    public double getBalance() {
        return balance;
    }

    // Метод получения лимита овердрафта для текущего счета
    public double getOverdraftLimit() {
        return overdraftLimit;
    }

    // Реализация метода "пополнения счета", чтобы добавить указанную сумму к балансу
    @Override
    public void deposit(double amount) {
        balance += amount;
    }

    // Реализация метода "вывести", чтобы вычесть указанную сумму из баланса
    @Override
    public void withdraw(double amount) {
        // Проверяем, достаточен ли баланс плюс лимит овердрафта для покрытия снятия средств
        if (balance + overdraftLimit >= amount) {
            balance -= amount;
        }
    }
}
