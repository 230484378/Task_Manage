package com.example.springboot06.Controller;

import com.example.springboot06.Entry.Task;
import com.example.springboot06.Mappers.Task_Mapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.List;

@Controller
@CrossOrigin
public class TaskController {
    @Autowired
    Task_Mapper task_mapper;

    @ResponseBody
    @RequestMapping("/tasks")
    public List<Task> GetTasks(Integer type){
        List<Task> tasks=new ArrayList<>();

        if(null==type){
            tasks=task_mapper.FindAll();
        }
        else {
            tasks=task_mapper.FindoneType(type);
        }
        return tasks;
    }

    @RequestMapping(value = "/modify")
    @ResponseBody
    public void Modify_task(Integer task_id,String task_name,String task_message,Integer task_state,
                            Double task_price,String task_sender,String task_date,Integer task_type) throws ParseException {
        Task task=new Task();
        task.setTask_id(task_id);
        task.setTask_name(task_name);
        task.setTask_message(task_message);
        task.setTask_state(task_state);
        task.setTask_price(task_price);
        task.setTask_sender(task_sender);
        task.setTask_type(task_type);

        String str = task_date;
        SimpleDateFormat format = new SimpleDateFormat("yyyy-MM-dd");
        java.util.Date d = null;
        try {
            d = format.parse(str);
        } catch (Exception e) {
            e.printStackTrace();
        }
        java.sql.Date date = new java.sql.Date(d.getTime());
        task.setTask_date(date);



        task_mapper.Update(task);
        System.out.println("modify");

    }
    @RequestMapping(value = "/insert")
    @ResponseBody
    public void Insert_task(Integer task_id,String task_name,String task_message,Integer task_state,
                            Double task_price,String task_sender,String task_date,Integer task_type){
        Task task=new Task();
        task.setTask_id(task_id);
        task.setTask_name(task_name);
        task.setTask_message(task_message);
        task.setTask_state(task_state);
        task.setTask_price(task_price);
        task.setTask_sender(task_sender);
        task.setTask_type(task_type);

        String str = task_date;
        SimpleDateFormat format = new SimpleDateFormat("yyyy-MM-dd");
        java.util.Date d = null;
        try {
            d = format.parse(str);
        } catch (Exception e) {
            e.printStackTrace();
        }
        java.sql.Date date = new java.sql.Date(d.getTime());
        task.setTask_date(date);
        if (task_mapper.MaxId()==null)
            task.setTask_id(0);
        else task.setTask_id(task_mapper.MaxId()+1);
        task_mapper.Insert(task);
    }
    @RequestMapping(value = "/delete")
    @ResponseBody
    public void Delete_task(Integer task_id){
        task_mapper.Delete(task_id);
    }

    @RequestMapping(value = "/assigned")
    @ResponseBody
    public void Assigned(Integer task_id,String task_reciver){
        task_mapper.Assigned(task_id,task_reciver);
    }
}
