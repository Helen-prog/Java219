package account;

public class Main {
    public static void main(String[] args) {
        System.out.println("Напишите программу на Java для создания банковской системы с тремя классами - Bank, Account, Savings Account и CurrentAccount. \nУ банка должен быть список счетов и методы их добавления. Счета должны представлять собой интерфейс с методами внесения депозитов, \nснятия средств, расчета процентов и просмотра остатков. Сберегательный счет и текущий счет должны реализовывать интерфейс учетной \nзаписи и иметь свои собственные уникальные методы.\n");

        // Создаем экземпляр класса Bank
        Bank bank = new Bank();

        // Создаем сберегательный счет с первоначальным взносом и процентной ставкой
        SavingsAccount savingsAccount = new SavingsAccount(1000.0, 1.25);
        System.out.println("===== Сберегательный счет =====\nПервоначальный депозит: $" + savingsAccount.getBalance() + "\nПроцентная ставка: " + savingsAccount.getInterestRate() + "%");

        // Создаем текущий счет с первоначальным депозитом и лимитом овердрафта
        CurrentAccount currentAccount = new CurrentAccount(5000.0, 1000.0);
        System.out.println("\n===== Текущий счет =====\nПервоначальный депозит: $" + currentAccount.getBalance() + "\nЛимит овердрафта: $" + currentAccount.getOverdraftLimit());


        // Добавим сберегательный счет и текущий счет в банке
        bank.addAccount(savingsAccount);
        bank.addAccount(currentAccount);

        System.out.println("\nВносим 100 долларов на сберегательный счет.");
        // Вносим 100 долларов на сберегательный счет
        bank.deposit(savingsAccount, 100.0);
        System.out.println("Вносим 500 долларов на текущий счет.");
        // Вносим 500 долларов на текущий счет
        bank.deposit(currentAccount, 500.0);

        System.out.println("Снимаем 150 долларов со сберегательного счета.\n");
        // Снимите 150 долларов со сберегательного счета
        bank.withdraw(savingsAccount, 150.0);
        System.out.println("\n===== Сберегательный счет и текущий счет =====");

        // Распечатаем остатки по всем счетам в банке
        bank.printAccountBalances();

        // Начислим проценты на Сберегательный счет
        savingsAccount.applyInterest();
        System.out.println("\nПосле начисления процентов на сберегательный счет в течение 1 года:");
        System.out.println("===== Сберегательный счет и текущий счет =====");

        // Распечатаем остатки по всем счетам в банке после начисления процентов
        bank.printAccountBalances();

    }
}
