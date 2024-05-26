package org.example._hw._hw2;

public class Main {
    public static void main(String[] args) {
        BankAccount owner1 = new BankAccount("Name1", 1000);
        BankAccount owner2 = new BankAccount("Name2", 50);
        BankAccount owner3 = new BankAccount("Name3", 70);
        owner1.deposit(1000);
        owner1.withdraw(456);
        owner1.deposit(56);
        System.out.println(owner1.getBalance());
        owner2.deposit(500);
        owner2.withdraw(1999);
        System.out.println(owner2.getBalance());
        owner3.withdraw(65);
        owner3.deposit(456);
        System.out.println(owner3.getBalance());


        owner1.setOwner("Inna");
        System.out.println(owner1.getOwner());

    }
}
