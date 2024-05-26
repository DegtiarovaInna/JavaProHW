package org.example._hw._hw2;

import java.lang.invoke.LambdaMetafactory;

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
    private String owner;
    private double balance;

    public BankAccount(String owner, double balance) {
        this.owner = owner;
        this.balance = balance;
    }


    public void deposit(double amount) {
        if (amount > 0) {
            balance = balance + amount;
            System.out.println("На вашем счету: " + balance);
        } else {
            System.out.println("Сумма должна быть положительной");
        }
    }

    public void withdraw(double amount) {
        if (amount > 0) {
            if (balance >= amount) {
                balance = balance - amount;
                System.out.println("На вашем счету осталось: " + balance);
            } else {
                System.out.println("На вашем счету недостаточно средств");
            }
        } else {
            System.out.println("Сумма должна быть положительной");
        }
    }

    public double getBalance() {
        return balance;
    }
    public String getOwner(){
        return owner;
    }
    public void setOwner(String owner) {
        this.owner = owner;
    }

}
