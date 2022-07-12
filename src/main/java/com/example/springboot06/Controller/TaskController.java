package com.example.springboot06.Controller;

import com.example.springboot06.Entry.Task;
import com.example.springboot06.Mappers.Task_Mapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

@Controller
public class TaskController {
    @Autowired
    Task_Mapper task_mapper;
    @ResponseBody
    @RequestMapping("/Test")
    public String Test(){
        List<Task> tasks =task_mapper.FindAll();
        tasks.forEach(System.out::println);
        return tasks.toString();
//        return "Hello";
    }
}
