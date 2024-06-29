package ru.netology;

public class Employee {
    private int id;
    private String firstName;
    private String lastName;
    private String country;
    private int age;

    // Конструктор
    public Employee(int id, String firstName, String lastName, String country, int age) {
        this.id = id;
        this.firstName = firstName;
        this.lastName = lastName;
        this.country = country;
        this.age = age;
    }

    // Геттеры и сеттеры
    public int getId() { return id; }
    public String getFirstName() { return firstName; }
    public String getLastName() { return lastName; }
    public String getCountry() { return country; }
    public int getAge() { return age; }

    // Переопределение toString
    @Override
    public String toString() {
        return "Employee{id=" + id +
                ", firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", country='" + country + '\'' +
                ", age=" + age + '}';
    }
}





