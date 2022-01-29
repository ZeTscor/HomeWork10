package ru.zets.data;
import com.github.javafaker.Faker;

public class DataGen {
    Faker faker = new Faker();
    public String firstName = faker.name().firstName();
    public String lastName = faker.name().lastName();
    public String email = faker.internet().emailAddress();
    public String phone = faker.number().digits(10);
    public String address = faker.address().streetAddress();
}
