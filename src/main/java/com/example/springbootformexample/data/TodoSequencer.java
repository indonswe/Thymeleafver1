package com.example.springbootformexample.data;

public class TodoSequencer {
    private static int todoId = 0;

    public static int nextTodoId() {
        TodoSequencer.todoId = ++todoId;
        return todoId;
    }

    public static void reset() {
        TodoSequencer.todoId = 0;
    }
}
