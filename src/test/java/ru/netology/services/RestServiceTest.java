package ru.netology.services;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class RestServiceTest {

    @Test
    public void test() {
    RestService service = new RestService();

    int expected = 2;
    int actual =  service.calculateRest(100_000, 60_000, 150_000);
    Assertions.assertEquals(expected, actual);
    }



}
