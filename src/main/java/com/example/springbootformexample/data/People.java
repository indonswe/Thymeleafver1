package com.example.springbootformexample.data;



import com.example.springbootformexample.model.PersonTodo;

import java.util.Arrays;

public class People {
    private static PersonTodo[] peopleArray = new PersonTodo[0]; // Array with all Person objects
    private static PersonTodo[] peopleArrayEmpty = new PersonTodo[0]; //For clearing peopleArray



    public static int size() {
        return peopleArray.length;
    } // To know how big the arrays with persons are

    public static PersonTodo[] findAll() {
        return peopleArray; //Access all Persons
    }

    public static PersonTodo findById(int personId) {
        int answer = 0;
        for (int i = 0; i < peopleArray.length; i++) {
            if (peopleArray[i].getPersonId() == (personId)) {
                answer = i; // Saves the wanted Persons place in the peopleArray so we return the right one
                break;
            }
        }
        if (answer == 0) System.out.println("No person with that ID in database");
        return peopleArray[answer]; //Returns a specific wanted Person
    }

    public static PersonTodo add(String firstName, String lastName) {
        PersonTodo newPersonTodo = new PersonTodo(); //Create a Person
        newPersonTodo.setFirstName(firstName);
        newPersonTodo.setLastName(lastName);
        PersonTodo[] newArray = Arrays.copyOf(peopleArray, peopleArray.length + 1); //Make bigger array
        newArray[newArray.length - 1] = newPersonTodo; //Put the new Person in the bigger array
        People.peopleArray = newArray; //Makes the Person array same as the bigger array
        return newPersonTodo; //Returns new Person
    }

    public static void clear() {
        if (peopleArray == null) {
            //System.out.println("Name list is not initialized, now initialized.");
        } else {
            //System.out.println("Name list had been emptied!");
        }
        com.example.springbootformexample.data.PersonSequencer myPersonSequencer = new com.example.springbootformexample.data.PersonSequencer();
        myPersonSequencer.reset(); // personId reset to value 0
        peopleArray = peopleArrayEmpty; //Empty Person array
    }

    public static boolean remove(int personId) {
        boolean isDeleted = false;
        if (peopleArray.length == 0) {
        } else if (personExist(personId)) {
            PersonTodo[] newArray = new PersonTodo[peopleArray.length - 1];
            for (int i = 0, j = 0; i < peopleArray.length; i++, j++) {
                if (peopleArray[i].getPersonId() == (personId)) {
                    --j; // Person is removed
                    isDeleted = true; //Remove action finished
                } else {
                    newArray[j] = peopleArray[i];// To save those persons that should not be removed
                }
            }
            peopleArray = newArray;// Not removed persons sent to persons array
        } else {
            //System.out.println("Could not find name to remove");
        }
        return isDeleted; //Tells if person was removed
    }

    public static boolean personExist(int personId) {
        boolean IsExisting = false;
        for (int i = 0; i < peopleArray.length; i++) {
            if (peopleArray[i].getPersonId() == (personId)) {
                IsExisting = true; //Wanted person exist
                break;
            }
        }
        return IsExisting; // Tells if wanted person exist
    }
}
