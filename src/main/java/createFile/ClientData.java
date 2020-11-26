package createFile;

import com.github.javafaker.Faker;

import java.util.Locale;

public class ClientData {

    Faker faker = new Faker(new Locale("pl"));
    String firstName = faker.name().firstName();
    String lastName = faker.name().lastName();
    String pesel = faker.phoneNumber().cellPhone();

}
