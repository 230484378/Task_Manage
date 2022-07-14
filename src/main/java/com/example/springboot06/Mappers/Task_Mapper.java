package com.example.springboot06.Mappers;

import com.example.springboot06.Entry.Task;
import org.apache.ibatis.annotations.*;

import java.util.List;

@Mapper
public interface Task_Mapper {
    @Select("select * from task")
    public List<Task> FindAll();

    @Select("select * from task where task_type=#{id}")
    public List<Task> FindoneType(@Param("id") int id);

    @Select("Select Max(task_id) from task")
    public Integer MaxId();

    @Update("Update task set task_name=\'${task.task_name}\'," +
            "task_message=\'${task.task_message}\'," +
            "task_state=${task.task_state}," +
            "task_price=${task.task_price}," +
            "task_sender=\'${task.task_sender}\'," +
            "task_date=\'${task.Task_StrDate}\'," +
            "task_type=${task.task_type}" +
            " where task_id=${task.task_id}")
    public void Update(@Param("task") Task task);
    @Insert("INSERT INTO task (task_id,task_name, task_message,task_state," +
            "task_price,task_sender,task_date,task_type) " +
            "VALUES ('${task.task_id}', \'${task.task_name}\',\'${task.task_message}\',${task.task_state}," +
            "${task.task_price},\'${task.task_sender}\',\'${task.Task_StrDate}\',${task.task_type})")
    public void Insert(@Param("task")  Task task);

    @Delete("DELETE FROM task WHERE task_id = ${task_id}")
    public void Delete(@Param("task_id") int task_id);

    @Update("Update task set task_reciver=\'${task_reciver}\' where task_id=${task_id}")
    public void Assigned(@Param("task_id") int task_id,@Param("task_reciver") String task_reciver);
}
