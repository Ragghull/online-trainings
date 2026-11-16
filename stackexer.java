
import java.util.ArrayDeque;
import java.util.Scanner;

public class stackexer {

    public static void main(String[] args) {

        Scanner rag = new Scanner(System.in);

        ArrayDeque<String> stack = new ArrayDeque<>();

        int choice;

        do {

            
            System.out.println("1. Enroll learner");
            System.out.println("2. Undo last enrollment");
            System.out.println("3. Show last enrollment");
            System.out.println("4. Exit");

            System.out.print("Enter your choice: ");
            choice = rag.nextInt();
            rag.nextLine();

            switch (choice) {

                case 1:

                    System.out.print("Enter learner name: ");
                    String name = rag.nextLine();

                    stack.push(name);

                    System.out.println(name + " enrolled successfully");
                    System.out.println("Stack: " + stack);

                    break;

                case 2:

                    if (stack.isEmpty()) {

                        System.out.println("Nothing to undo");

                    } else {

                        String removed = stack.pop();

                        System.out.println("Undone: " + removed);
                    }

                    break;

                case 3:

                    if (stack.isEmpty()) {

                        System.out.println("Nothing to undo");

                    } else {

                        System.out.println(
                                "Last enrollment: " + stack.peek());
                    }

                    break;

                case 4:

                    System.out.println("Exiting enrollment system");
                    break;

                default:

                    System.out.println("Invalid menu choice");
            }

        } while (choice != 4);

        rag.close();
    }
}
