import java.util.ArrayList;
import java.util.HashMap;

public class Task {
    String task;
    HashMap<Integer, String> tasks = new HashMap<Integer, String>();


    void addTask(String task) {
        int nextKey = tasks.size() + 1;
        tasks.put(nextKey, task);

    }

    void showTask() {
        tasks.forEach((key, value) ->
                System.out.println("Task: " + key + " - " + value));
    }


    void removeTask(int n) {
        String taskvalue = tasks.get(n);
        System.out.println("You removed this task: " + taskvalue);
        tasks.remove(n);
    }


}
