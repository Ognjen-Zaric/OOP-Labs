package Lab3;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;


public class DataStructures {
    private List<TaskItem> tasks = new ArrayList<>();

    public DataStructures() {
        tasks = Arrays.asList(
                new TaskItem(1,"Push lab code to the github", Status.TO_DO),
                new TaskItem(2,"Prepare for the quiz", Status.IN_PROGRESS),
                new TaskItem(3,"Go over tasks from lab2", Status.COMPLETED));
    }

    public List<TaskItem> getAllTasks() {
        return tasks;
    }

    public List<TaskItem> getByStatus(Status status) {
        return tasks.stream()
                .filter(task -> task.getTaskStatus() == status)
                .collect(Collectors.toList());
    }

    public List<TaskItem> getTasksByIdGreaterThanEqual(int id) {
        return tasks.stream()
                .filter(task -> task.getTaskId() >= id)
                .collect(Collectors.toList());
    }

    public void printTaskDescriptions() {
        tasks.forEach(task -> System.out.println(task.getTaskDescription()));
    }

    public static void main(String[] args) {
        DataStructures ds = new DataStructures();
        System.out.println("All tasks:");
        ds.getAllTasks().forEach(task -> System.out.println(task.getTaskId() + " " + task.getTaskDescription() + " " + task.getTaskStatus()));
        System.out.println("Tasks by status:");
        ds.getByStatus(Status.TO_DO).forEach(task -> System.out.println(task.getTaskId() + " " + task.getTaskDescription() + " " + task.getTaskStatus()));
        System.out.println("Tasks by id greater than or equal to 2:");
        ds.getTasksByIdGreaterThanEqual(2).forEach(task -> System.out.println(task.getTaskId() + " " + task.getTaskDescription() + " " + task.getTaskStatus()));
    }
}

class TaskItem {
    private int taskId;
    private String taskDescription;
    private Status taskStatus;

    public TaskItem(int taskId, String taskDescription, Status taskStatus) {
        this.taskId = taskId;
        this.taskDescription = taskDescription;
        this.taskStatus = taskStatus;
    }

    public int getTaskId() {
        return taskId;
    }

    public String getTaskDescription() {
        return taskDescription;
    }

    public Status getTaskStatus() {
        return taskStatus;
    }

    public void setTaskStatus(Status taskStatus) {
        this.taskStatus = taskStatus;
    }
}

enum Status {
    TO_DO,
    IN_PROGRESS,
    COMPLETED
}
