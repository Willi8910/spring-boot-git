package com.technical.git.service;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.io.IOException;

import static org.assertj.core.api.Assertions.assertThat;

@SpringBootTest
@RunWith(SpringRunner.class)
public class GeneratorServiceTest {

    @Autowired
    GeneratorService generatorService;

    @Test
    public void generateFile() throws IOException {
        String result = generatorService.generateFile(2);
        assertThat(result).isInstanceOf(String.class);
    }
}