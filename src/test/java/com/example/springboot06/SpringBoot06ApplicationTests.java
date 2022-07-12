package com.example.springboot06;

import com.example.springboot06.Mappers.Task_Mapper;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class SpringBoot06ApplicationTests {

    @Autowired
    Task_Mapper task_mapper;
    @Test
    void contextLoads() {

    }

}
