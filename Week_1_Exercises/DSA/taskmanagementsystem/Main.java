package taskmanagementsystem;

public class Main {
    public static void main(String[] args) {
        TaskManagement taskManagement = new TaskManagement();

        Task task1 = new Task(1, "Complete assignment", "Pending");
        Task task2 = new Task(2, "Prepare for meeting", "In Progress");
        Task task3 = new Task(3, "Submit report", "Completed");

        taskManagement.addTask(task1);
        taskManagement.addTask(task2);
        taskManagement.addTask(task3);

        System.out.println("All Tasks:");
        taskManagement.traverseTasks();

        System.out.println("\nSearching for Task with ID 2:");
        Task searchResult = taskManagement.searchTask(2);
        System.out.println(searchResult != null ? searchResult : "Task not found");

        System.out.println("\nDeleting Task with ID 1:");
        taskManagement.deleteTask(1);
        taskManagement.traverseTasks();
    }
}
