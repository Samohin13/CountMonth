package ru.netology.javaqa.WorkRest.service;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;


public class WorkRestServiceTest {

    @Test
    public void testWorkRestService() {
        WorkRestService service = new WorkRestService();

        int count = 3;
        int workRest = service.calculate(10_000, 3_000, 20_000);

        Assertions.assertEquals(count, workRest);
    }


}
