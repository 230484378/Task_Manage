package com.example.springboot06.Entry;

import com.fasterxml.jackson.annotation.JsonFormat;

import java.sql.Date;
import java.text.SimpleDateFormat;

public class Task {
    Integer task_id;//任务id
    String task_name;//任务名
    String task_message;//任务描述
    int task_state;//任务状态  0代表未审核 1代表审核
    double task_price;//任务价格 2位小数
    String task_sender;//任务人
    @JsonFormat(pattern = "yyyy-MM-dd")
    Date task_date;//任务日期
    String task_StrDate;//任务日期的String格式
    int task_type;//任务类型 0代表需求任务 1代表生产任务
    String task_recive;

    public String getTask_recive() {
        return task_recive;
    }

    public void setTask_recive(String task_recive) {
        this.task_recive = task_recive;
    }

    @Override
    public String toString() {
        return "Task{" +
                "task_id=" + task_id +
                ", task_name='" + task_name + '\'' +
                ", task_message='" + task_message + '\'' +
                ", task_state=" + task_state +
                ", task_price=" + task_price +
                ", task_sender='" + task_sender + '\'' +
                ", task_date=" + task_date +
                ", task_StrDate='" + task_StrDate + '\'' +
                ", task_type=" + task_type +
                '}';
    }

    public Integer getTask_id() {
        return task_id;
    }

    public void setTask_id(Integer task_id) {
        this.task_id = task_id;
    }

    public String getTask_name() {
        return task_name;
    }

    public void setTask_name(String task_name) {
        this.task_name = task_name;
    }

    public String getTask_message() {
        return task_message;
    }

    public void setTask_message(String task_message) {
        this.task_message = task_message;
    }

    public int getTask_state() {
        return task_state;
    }

    public void setTask_state(int task_state) {
        this.task_state = task_state;
    }

    public double getTask_price() {
        return task_price;
    }

    public void setTask_price(double task_price) {
        this.task_price = task_price;
    }

    public String getTask_sender() {
        return task_sender;
    }

    public void setTask_sender(String task_sender) {
        this.task_sender = task_sender;
    }

    public Date getTask_date() {
        return task_date;
    }

    public void setTask_date(Date task_date) {
        this.task_date = task_date;
        Trance_DateStr();
    }

    public String getTask_StrDate() {
        return task_StrDate;
    }

    public void setTask_StrDate(String task_StrDate) {
        this.task_StrDate = task_StrDate;
    }

    public int getTask_type() {
        return task_type;
    }

    public void setTask_type(int task_type) {
        this.task_type = task_type;
    }



    public void Trance_DateStr(){
        SimpleDateFormat format = new SimpleDateFormat("yyyy-MM-dd");
         task_StrDate=format.format(task_date);
    }
}
