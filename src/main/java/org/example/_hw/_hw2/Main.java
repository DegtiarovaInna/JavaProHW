package org.example._hw._hw2;

public class Main {
    public static void main(String[] args) {

        User user1 = new User("Inna", "Degtiarova", "Germany");
        User user2 = new User("Inna", "Degtiarova", "Germany");
        User user3 = new User("Inna", "Degtiarova", "Germany");
        BankAccount owner1 = new BankAccount(user1, 1000);
        BankAccount owner2 = new BankAccount(user2, 50);
        BankAccount owner3 = new BankAccount(user3, 70);
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


        owner1.setOwner("Anna", "He", "UA");
        System.out.println(owner1.getOwner());

    }
}
