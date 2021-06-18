package com.example.springbootformexample.model;


import com.example.springbootformexample.data.People;
import com.example.springbootformexample.data.PersonSequencer;

public class PersonTodo {

    PersonSequencer myPersonSequencerObject = new PersonSequencer();

    //Fields
    private final int personId;
    private String firstName;
    private String lastName;

    //Constructor


    public PersonTodo(String firstName, String lastName) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.personId=myPersonSequencerObject.nextPersonId();
        People.add(this);
    }

    public PersonTodo(){
        this.personId = myPersonSequencerObject.nextPersonId();
    }

    //Getters and Setters
    public void setFirstName(String firstName){
        this.firstName = firstName;
    }
    public void setLastName(String lastName){
        this.lastName = lastName;
    }
    public String getFirstName(){
        return this.firstName;
    }
    public String getLastName(){
        return this.lastName;
    }
    public int getPersonId() {
        return this.personId;
    }

    @Override
    public String toString() {
        return "PersonTodo{" +
                "myPersonSequencerObject=" + myPersonSequencerObject +
                ", personId=" + personId +
                ", firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                '}';
    }
}
