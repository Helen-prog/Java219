package account;

import java.util.ArrayList;
//import java.util.List;

public class Bank {
    // Объявление закрытого списка для хранения учетных записей
    private ArrayList<Account> accounts;

    // Конструктор для инициализации списка учетных записей
    public Bank() {
        accounts = new ArrayList<>();
    }

    // Метод для добавления учетной записи в список учетных записей
    public void addAccount(Account account) {
        accounts.add(account);
    }


    // Метод для внесения указанной суммы на счет
    public void deposit(Account account, double amount) {
        account.deposit(amount);
    }

    // Метод для снятия указанной суммы со счета
    public void withdraw(Account account, double amount) {
        account.withdraw(amount);
    }

    // Метод для печати остатков по всем счетам в банке
    public void printAccountBalances() {
        for (Account account : accounts) {
            System.out.println("Баланс счета: " + account.getBalance());
        }
    }

    // Можно не делать (не используется)
    // Метод для удаления учетной записи из списка учетных записей
    public void removeAccount(Account account) {
        accounts.remove(account);
    }
}
