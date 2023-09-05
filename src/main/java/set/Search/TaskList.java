package main.java.set.Search;

import java.util.HashSet;
import java.util.Set;

public class TaskList {
    private Set<Task> taskSet;

    public TaskList() {
        this.taskSet = new HashSet<>();
    }

    public void addTask(String description) {
        taskSet.add(new Task(description));
    }

    public void removeTask(String description) {
        for (Task task: taskSet){
            if (task.getDescription().equalsIgnoreCase(description)){
                taskSet.remove(task);
                return;
            }
        }
    }

    public void markAsDone(String description){
        for (Task task: taskSet){
            if (task.getDescription().equalsIgnoreCase(description)
                && !task.isDone()){
                task.setDone(true);
            }
        }
    }

    public void markAsPending(String description){
        for (Task task: taskSet){
            if (task.getDescription().equalsIgnoreCase(description)
                    && !task.isDone()){
                task.setDone(false);
            }
        }
    }

    public Set<Task> getDoneTasks(){
        Set<Task> doneTasks = new HashSet<>();

        for (Task task: taskSet){
            if (task.isDone()){
                doneTasks.add(task);
            }
        }

        return doneTasks;
    }

    public Set<Task> getPendingTasks(){
        Set<Task> pendingTasks = new HashSet<>();

        for (Task task: taskSet){
            if (!task.isDone()){
                pendingTasks.add(task);
            }
        }
        return pendingTasks;
    }

    public void showTasks(){
        System.out.println(taskSet);
    }

    public int taskAmount() {
        return taskSet.size();
    }

    public void clearTaskList() {
        taskSet.removeAll(taskSet);
    }

    public static void main(String[] args) {
        TaskList taskList = new TaskList();

        taskList.addTask("study java");
        taskList.addTask("study angular");
        taskList.addTask("walk the dog");
        taskList.addTask("study git");
        taskList.addTask("make lunch");
        taskList.showTasks();
        System.out.println("there are: " + taskList.taskAmount() + " tasks on list");

//        taskList.removeTask("study git");
//        taskList.showTasks();

        taskList.markAsDone("study git");
        taskList.markAsDone("study angular");
        taskList.showTasks();

        System.out.println("done tasks:\n" + taskList.getDoneTasks());
        System.out.println("pending tasks:\n" + taskList.getPendingTasks());


        taskList.clearTaskList();
        taskList.showTasks();
    }
}
