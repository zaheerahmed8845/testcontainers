package com.example.demo;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.springframework.test.context.junit.jupiter.SpringExtension;
import org.testcontainers.containers.MySQLContainer;

@ExtendWith(SpringExtension.class)
public class MySQLIT {

    static MySQLContainer MY_SQL_CONTAINER = new MySQLContainer("mysql:latest");

    @BeforeAll
    static void beforeAll() {
        MY_SQL_CONTAINER.start();
    }

    @AfterAll
    static void afterAll() {
        MY_SQL_CONTAINER.stop();
    }

    @Test
    public void test() {
        Assertions.assertTrue(MY_SQL_CONTAINER.isRunning());
    }

}
