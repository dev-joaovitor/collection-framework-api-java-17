package main.java.list.BasicOperations;

import java.lang.annotation.Target;
import java.util.ArrayList;
import java.util.List;

public class TaskList {
    private List<Task> taskList;

    public TaskList() {
        this.taskList = new ArrayList<>();
    }

    public void addTask(String description) {
        taskList.add(new Task(description));
    }

    public void removeTask(String description) {
        List<Task> taskToRemove = new ArrayList<>();

        for (Task t: taskList){
            if (t.getDescription().equalsIgnoreCase(description)) {
                taskToRemove.add(t);
            }
        }
        taskList.removeAll(taskToRemove);
    }

    public int getTaskListSize() {
        return taskList.size();
    }

    public void getTasksDescription() {
        System.out.println(taskList);
    }

    public static void main(String[] args) {
        TaskList taskList = new TaskList();

        System.out.println("The size of the task list is: " + taskList.getTaskListSize());

        taskList.addTask("Task 1");
        taskList.addTask("Task 1");
        taskList.addTask("Task 2");

        System.out.println("The size of the task list is: " + taskList.getTaskListSize());

        taskList.removeTask("Task 1");
        System.out.println("The size of the task list is: " + taskList.getTaskListSize());

        taskList.getTasksDescription();
    }
}
