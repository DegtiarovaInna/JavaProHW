package org.example._hw._hw2;

//## Задание со звездочкой: Создание класса "Пользователь"
//Для усложнения задания и практики дополнительных концепций ООП, мы создадим отдельный класс
// "Пользователь" и свяжем его с классом "Банковский счет".
//### Требования
//1. Создайте класс `User` со следующими свойствами:
//   - `firstName` (строка): имя пользователя
//   - `lastName` (строка): фамилия пользователя
//   - `address` (строка): домашний адрес пользователя
//Это расширенное задание позволит вам практиковать создание связанных классов,
// работу с объектами и их свойствами, а также композицию классов в ООП. Вы научитесь
// создавать более сложные и реалистичные модели данных, что пригодится при разработке более крупных приложений.
//Добавьте возможность хранения нескольких банковских счетов для одного пользователя, создав массив или список счетов в классе User.
//Реализуйте метод updateAddress(newAddress) в классе User, который обновляет адрес пользователя,
// присваивая новый объект Address свойству userAddress.

//Добавьте возможность хранения нескольких адресов для одного пользователя, создав массив или список адресов в классе User.
public class User {

    private String firstName;
    private String lastName;

    private Address userAddress;
   private int countAccounts = 0;
    private BankAccount[] bankAccounts = new BankAccount[10];

    private int countAddress;
    private Address[] addresses = new Address[10];


    public void addAddress(Address address){
        if (countAccounts< addresses.length){
            addresses[countAddress]=address;
            countAddress++;
        }else {
            throw new IllegalArgumentException("Добавлено максимальное колличество адресов");
        }
    }

    public void addBankAccounts(BankAccount bankAccount) {

        if (countAccounts< bankAccounts.length){
            bankAccounts[countAccounts]= bankAccount;
            countAccounts++;
        } else {
            throw new IllegalArgumentException("Добавлено максимально колличество аккаунтов");
        }
    }

    public void getAllAddresses(){
        for (int i = 0; i < addresses.length; i++) {
            if(addresses[i]!=null){
                System.out.println(addresses[i]);
            }
        }
    }

    public void getBankAccounts(){
        for (int i = 0; i < bankAccounts.length; i++) {
            if (bankAccounts[i]!=null){
                System.out.println(bankAccounts[i]);
            }
        }
    }


//    public String getFirstName() {
//        return firstName;
//    }
//
//    public String getLastName() {
//        return lastName;
//    }

    public Address getAddress() {
        return userAddress;
    }

    public String getFullName() {
        return firstName + " " + lastName +" Адрес: "+userAddress.getFullAddress();
    }

    public void setAddress(Address newAddress) {
        this.userAddress = newAddress;
        if (userAddress == null) {
            throw new IllegalArgumentException("Адрес не может быть null");
        }
    }

    public User(String firstName, String lastName, Address address) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.userAddress = address;
        if (firstName == null || lastName == null || address == null) {
            throw new IllegalArgumentException("Все поля должны быть заполнены");
        }
    }

    @Override
    public String toString() {
        return getFullName();

    }

    public void updateAddress(Address newAddress){
        if (newAddress != null) {
            this.userAddress = newAddress;
        } else {
            throw new IllegalArgumentException("Адрес не может быть null");
        }
    }
}
