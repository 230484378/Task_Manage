package com.example.springboot06.Entry;

public class Task {
    String task_id;//任务id
    String task_name;//任务名
    String task_message;//任务描述
    int task_state;//任务状态
    String task_demand;//任务需求
    double task_price;//任务价格
    String task_sender;//任务人
    String task_receiver;//接收人

    public String getTask_id() {
        return task_id;
    }

    public void setTask_id(String task_id) {
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

    public String getTask_demand() {
        return task_demand;
    }

    public void setTask_demand(String task_demand) {
        this.task_demand = task_demand;
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

    public String getTask_receiver() {
        return task_receiver;
    }

    public void setTask_receiver(String task_receiver) {
        this.task_receiver = task_receiver;
    }

    @Override
    public String toString() {
        return "Task{" +
                "task_id='" + task_id + '\'' +
                ", task_name='" + task_name + '\'' +
                ", task_message='" + task_message + '\'' +
                ", task_state=" + task_state +
                ", task_demand='" + task_demand + '\'' +
                ", task_price=" + task_price +
                ", task_sender='" + task_sender + '\'' +
                ", task_receiver='" + task_receiver + '\'' +
                '}';
    }
}
