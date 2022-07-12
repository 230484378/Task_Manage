package com.example.springboot06.Mappers;

import com.example.springboot06.Entry.Task;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

import java.util.List;

@Mapper
public interface Task_Mapper {
    @Select("select * from task")
    public  List<Task> FindAll();
}
