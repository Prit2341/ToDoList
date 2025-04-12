import java.util.LinkedHashMap;
import java.util.Map;

public class TaskManager {
    private final Map<Integer, String> tasks = new LinkedHashMap<>();
    private int taskCounter = 1;

    public void addTask(String taskDescription) {
        tasks.put(taskCounter, taskDescription);
        System.out.println("✅ Task added: " + taskDescription);
        taskCounter++;
    }

    public void showTasks() {
        System.out.println("\n📋 Your To-Do List:");
        if (tasks.isEmpty()) {
            System.out.println("🎉 All tasks are done!");
        } else {
            tasks.forEach((key, value) ->
                    System.out.println(key + ". " + value));
        }
    }

    public void removeTask(int taskNumber) {
        if (tasks.containsKey(taskNumber)) {
            String removedTask = tasks.remove(taskNumber);
            System.out.println("🗑️ Removed task: " + removedTask);
        } else {
            System.out.println("⚠️ Task number " + taskNumber + " not found.");
        }
    }
}
