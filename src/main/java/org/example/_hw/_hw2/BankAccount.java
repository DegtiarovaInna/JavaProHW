package org.example._hw._hw2;

//Создайте класс BankAccount со следующими свойствами:
//
//owner (строка): имя владельца счета
//balance (число с плавающей точкой): текущий баланс счета
//Реализуйте следующие методы в классе BankAccount:
//
//deposit(amount): добавляет указанную сумму amount к текущему балансу счета
//withdraw(amount): вычитает указанную сумму amount из текущего баланса счета, но только если на счету достаточно средств
//getBalance(): возвращает текущий баланс счета
//Примените принцип инкапсуляции, сделав свойства owner и balance приватными (private) и предоставив публичные (public) методы для доступа и изменения этих свойств.
//
//Создайте несколько экземпляров класса BankAccount и протестируйте работу методов deposit, withdraw и getBalance.
public class BankAccount {
    //   private String owner;
    private double balance;
    User user;


    public BankAccount(User user, double balance) {
        this.user = user;
        this.balance = balance;
        if (user == null) {
            throw new IllegalArgumentException("Пользователь не может быть null");
        }
        if (balance < 0) {
            throw new IllegalArgumentException("Баланс не может быть отрицательным");
        }
    }


    public void deposit(double amount) {
        if (amount > 0) {
            balance = balance + amount;
        } else {
            throw new IllegalArgumentException("Сумма должна быть положительная");
        }
    }

    public void withdraw(double amount) {
        if (amount > 0) {
            if (balance >= amount ) {
                balance = balance - amount;

            }
        } else {
            throw new IllegalArgumentException("Убедитесь, что сумма снятия меньше суммы на счету");
        }

    }

    public void addInterest(double rate) {
        if (rate > 0) {
            balance = balance + balance * rate/100;
        } else {
            throw new IllegalArgumentException("Годовая процентная ставка должна быть положительным числом");
        }
    }

    public String getBalance() {
        return "Баланс счета " + user.getFullName() + ": " + balance;
    }

    public String getOwner() {
        return user.getFullName();
    }

    public void setOwner(String firstname, String lastname, Address address) {
        this.user = new User(firstname, lastname, address);
    }

    @Override
    public String toString() {
        return "BankAccount{" +
                "balance=" + balance +
                ", user=" + user.getFullName() +
                '}';
    }
}
