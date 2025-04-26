package utils;

import com.github.javafaker.Faker;
import models.User;

public class TestDataGenerator {
    private static final Faker faker = new Faker();

    public static User generateRandomUser() {
        return new User(
                faker.internet().emailAddress(),
                faker.internet().password(8, 16, true, true, true),
                faker.name().fullName()
        );
    }

    public static String randomEmail() {
        return faker.internet().emailAddress();
    }

    public static String randomPassword() {
        return faker.internet().password(8, 16, true, true, true);
    }
}