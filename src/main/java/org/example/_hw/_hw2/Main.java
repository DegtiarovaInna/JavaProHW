package org.example._hw._hw2;

public class Main {
    public static void main(String[] args) {
        Address address1 = new Address("Dus", "Germany", "41876", "Derbish", "23");
        Address address2 = new Address("Ber", "Germany", "42846", "Alss", "54");
        Address address3 = new Address("Gamb", "Germany", "46806", "Rubb", "198");
        User user1 = new User("Inna", "Degtiarova", address1);
        User user2 = new User("Anna", "Kalin", address2);
        User user3 = new User("Kate", "Bib", address3);
        BankAccount account1 = new BankAccount(user1, 1000);
        BankAccount account2 = new BankAccount(user2, 50);
        BankAccount account3 = new BankAccount(user3, 70);
        account1.deposit(1000);
        account1.withdraw(456);
        account1.deposit(56);
        System.out.println(account1.getBalance());

        account2.withdraw(1999);
        System.out.println(account2.getBalance());

        account3.deposit(456);
        System.out.println(account3.getBalance());


        account1.setOwner("Anna", "He", address1);
        System.out.println(account1.getOwner());

        System.out.println(user2.getFullName());

        user2.setAddress(address2);
        System.out.println(user2.getAddress());


        account1.addInterest(5);
        System.out.println(account1.getBalance());


        user1.addBankAccounts(account1);
        user2.addBankAccounts(account3);
        user1.addBankAccounts(account2);
        System.out.println("Банковские счета первого пользователя:");
        user1.getBankAccounts();
        System.out.println("Банковские счета второго пользователя:");
        user2.getBankAccounts();


        user2.updateAddress(address3);
        System.out.println(user2.getAddress());


        user1.addAddress(address1);
        user1.addAddress(address2);
        System.out.println("Все адреса первого пользователя: ");
        user1.getAllAddresses();

    }
}
