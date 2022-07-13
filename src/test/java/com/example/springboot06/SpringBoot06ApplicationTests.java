package com.example.springboot06;

import com.example.springboot06.Entry.Task;
import com.example.springboot06.Mappers.Task_Mapper;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.List;

@SpringBootTest
class SpringBoot06ApplicationTests {

    @Autowired
    Task_Mapper task_mapper;

    @Test
    void contextLoads() {
        List<Task> tasks = task_mapper.FindAll();

        while (task_mapper.MaxId() !=null)
            task_mapper.Delete(task_mapper.MaxId());
    }

}
