public class Main {
    public static void main(String[] args) {
        TaskManager taskManager = new TaskManager();

        taskManager.addTask("Complete Essay");
        taskManager.addTask("Complete Photoshop");
        taskManager.addTask("Complete Meal");

        taskManager.showTasks();

        taskManager.removeTask(2); // Remove task 2
        taskManager.showTasks();   // Show remaining tasks
    }
}
