package org.example._hw._hw2;

//Создайте класс Address со следующими свойствами:
//
//city (строка): город
//country (строка): страна
//zipCode (строка): почтовый индекс
//street (строка): улица
//house (строка): номер дома
//Реализуйте следующий метод в классе Address:
//
//getFullAddress(): возвращает полный адрес в формате "Улица, Дом, Город, Страна, Индекс"
public class Address {
    String city;
    String country;
    String zipCode;
    String street;
    String house;

    public Address(String city, String country, String zipCode, String street, String house) {
        if (city==null || country==null ||zipCode==null || street==null ||house==null){
            throw new IllegalArgumentException("Не все поля заполнены!");
        }
        this.city = city;
        this.country = country;
        this.zipCode = zipCode;
        this.street = street;
        this.house = house;
    }


    public String getFullAddress() {
        return "Address{" +
                " Индекс:'" + zipCode + '\'' +
                ", Страна:'" + country + '\'' +
                ", Город:'" + city + '\'' +
                ", Улица:'" + street + '\'' +
                ", Дом:'" + house + '\'' +
                '}';
    }


    @Override
    public String toString() {
        return getFullAddress();
    }
}
