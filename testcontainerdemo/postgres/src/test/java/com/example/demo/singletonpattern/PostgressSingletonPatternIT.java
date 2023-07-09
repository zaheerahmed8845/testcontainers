package com.example.demo.singletonpattern;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.springframework.test.context.junit.jupiter.SpringExtension;

@ExtendWith(SpringExtension.class)
public class PostgressSingletonPatternIT extends AbstractContainerBaseTest {

    @Test
    public void test() {
        Assertions.assertTrue(postgres.isRunning());
    }

}
