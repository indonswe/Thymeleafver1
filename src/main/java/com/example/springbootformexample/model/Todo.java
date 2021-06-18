package com.example.springbootformexample.model;

public class Todo {

    //fields
    private final int todoId;
    private String description;
    private boolean done;
    private com.example.springbootformexample.model.PersonTodo assignee;

    //Constructor
    public Todo(int todoId,String description){
        this.todoId = todoId;
        this.description = description;
        //this.done = false;
        //this.assignee = null;
    }

    //Getters and setters
    public void setDescription(String description){
        this.description = description;
    }
    public void setDone(boolean done){
        this.done = done;   // maybe this should only be set true? Or should we allow toggling something done to undone?
    }
    public void setAssignee(com.example.springbootformexample.model.PersonTodo assignee){
        this.assignee = assignee;
    }

    public String getDescription(){
        return this.description;
    }
    public boolean getDone(){
        return this.done;
    }
    public com.example.springbootformexample.model.PersonTodo getAssignee(){
        return this.assignee;
    }
    public int getTodoId() {
        return this.todoId;
    }
}
