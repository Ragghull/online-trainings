
import java.util.ArrayDeque;
import java.util.Arrays;
import java.util.Queue;

public class queue {

    static String[] seats = new String[3];

    static Queue<String> waitlist = new ArrayDeque<>();

    
    static void display() {

        System.out.println("Seats: " + Arrays.toString(seats));
        System.out.println("Waiting: " + waitlist);

    }

    
    static void join(String name) {

        boolean allocated = false;

        for (int i = 0; i < seats.length; i++) {

            if (seats[i] == null) {

                seats[i] = name;

                System.out.println(name + " got Seat " + (i + 1));

                allocated = true;

                break;
            }
        }

        if (!allocated) {

            waitlist.offer(name);

            System.out.println(name + " added to waitlist");
        }

        display();
    }

    
    static void drop(String name) {

        boolean found = false;

        for (int i = 0; i < seats.length; i++) {

            if (seats[i] != null &&
                    seats[i].equals(name)) {

                seats[i] = null;

                found = true;

                System.out.println(name + " dropped out");

               
                if (!waitlist.isEmpty()) {

                    String next = waitlist.poll();

                    seats[i] = next;

                    System.out.println(next
                            + " received the vacant seat");

                } else {

                    System.out.println("Waitlist is empty");
                }

                break;
            }
        }

        if (!found) {

            System.out.println(name + " not found in batch");
        }

        display();
    }

    public static void main(String[] args) {

       
        join("Asha");
        join("Ravi");
        join("Meena");
        join("Kiran");
        join("Pooja");

       
        drop("Ravi");
    }
}
