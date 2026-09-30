import java.util.PriorityQueue;
import java.util.Comparator;
import java.util.Scanner;

class Task {
    String description;
    int priority;

    public Task(String description, int priority) {
        this.description = description;
        this.priority = priority;
    }

    @Override
    public String toString() {
        return "[Priority " + priority + "] " + description;
    }
}

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        PriorityQueue<Task> taskQueue = new PriorityQueue<>(Comparator.comparingInt((Task t) -> t.priority).reversed());

        System.out.print("Enter number of tasks: ");
        int n = sc.nextInt();
        sc.nextLine();

        for (int i = 1; i <= n; i++) {
            System.out.print("Enter description for Task " + i + ": ");
            String desc = sc.nextLine();

            System.out.print("Enter priority (1–10) for Task " + i + ": ");
            int prio = sc.nextInt();
            sc.nextLine();

            taskQueue.add(new Task(desc, prio));
        }

        System.out.println();
        System.out.println("Next task: " + taskQueue.peek());

        System.out.println();
        System.out.println("Processing tasks in order of priority:");
        while (!taskQueue.isEmpty()) {
            System.out.println(taskQueue.poll());
        }

        System.out.println();
        System.out.println("All tasks have been processed.");

        sc.close();
    }
}
