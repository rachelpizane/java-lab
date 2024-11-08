package com.rachelpzm.POO.aula02.revisao;

import java.util.ArrayList;
import java.util.Arrays;

public class Task {
    private ArrayList<String> statusList = new ArrayList<>(Arrays.asList("Progress", "Completed", "Canceled"));


    private String description;
    private int priority;
    private String data;
    private String status;

    public Task(String description, int priority, String data){
        this.description = description;
        this.priority = priority;
        this.data = data;
        this.status = "Progress";
    }

    public void changeStatus(String newStatus){
        if(statusList.contains(newStatus)){
            this.status = newStatus;
            System.out.println("Status changed successfully!!");

        } else {
            System.out.println("Invalid status. Please try again.");

        }
    }

    public void info(){
        String info = "Description: %s%n" + "Priority Level: %d%n" + "Data: %s%n" + "Status: %s%n";

        System.out.printf(info, this.description, this.priority, this.data, this.status);
    }
}
