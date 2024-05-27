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
    }


    public void deposit(double amount) {
        if (amount > 0) {
            balance = balance + amount;
        }
    }

    public void withdraw(double amount) {
        if (amount > 0) {
            if (balance >= amount && balance > 0) {
                balance = balance - amount;

            }
        }

    }

    public double getBalance() {
        return balance;
    }

    public String getOwner() {
        return user.toString();
    }

    public void setOwner(String firstname, String lastname, String address) {
        this.user = new User(firstname, lastname, address);
    }


}
