package com.basicjava.constructorexample;

public class Task {

    private String  taskName;

    public Task() {
        this("Do dishes");
    }

    public Task(String taskName) {
        this.taskName = taskName;
        System.out.println("Name of the task: "+ taskName);
    }

}
