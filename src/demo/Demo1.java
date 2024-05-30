package demo;

import java.util.ArrayDeque;
import java.util.Queue;
import java.util.Scanner;

public class Demo1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input = null;
        Queue<String> tasks = new ArrayDeque<>();
        while (!"print".equalsIgnoreCase(input = scanner.nextLine())){
            if ("done".equalsIgnoreCase(input)){
                if (tasks.isEmpty()) System.out.println("No tasks");
                else System.out.println("DONE: " + tasks.poll());
            }else {
                tasks.offer(input);
            }
        }


        System.out.println("Невыполненные задачи:");
        for (String task : tasks) {
            System.out.println(task);
        }
    }
}
