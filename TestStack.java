import java.io.*;

// Interface for stack operations
interface Stackoperation {
    public void push(int item);
    public void pop();
}

// Implementation of stack operations
class Astack implements Stackoperation {
    int stack[] = new int[5]; // Fixed-size stack
    int top = -1;             // Tracks the top of the stack

    // Push operation
    public void push(int item) {
        if (top >= 4) {
            System.out.println("Overflow");
        } else {
            top = top + 1;
            stack[top] = item;
            System.out.println("Element pushed: " + stack[top]);
        }
    }

    // Pop operation
    public void pop() {
        if (top < 0) {
            System.out.println("Underflow");
        } else {
            System.out.println("Element popped: " + stack[top]);
            top = top - 1;
        }
    }

    // Display elements in the stack
    public void display() {
        if (top < 0) {
            System.out.println("No Element in stack");
        } else {
            System.out.println("Elements in the stack:");
            for (int i = 0; i <= top; i++) {
                System.out.println("Element: " + stack[i]);
            }
        }
    }
}

// Main class to test stack operations
class Teststack {
    public static void main(String args[]) throws IOException {
        int ch, c;
        int item;
        Astack s = new Astack();
        DataInputStream in = new DataInputStream(System.in);

        do {
            try {
                System.out.println("ARRAY STACK");
                System.out.println("1. Push");
                System.out.println("2. Pop");
                System.out.println("3. Display");
                System.out.println("4. Exit");
                System.out.print("Enter your choice: ");
                ch = Integer.parseInt(in.readLine());

                switch (ch) {
                    case 1: // Push operation
                        System.out.print("Enter the value to push: ");
                        item = Integer.parseInt(in.readLine());
                        s.push(item);
                        break;
                    case 2: // Pop operation
                        s.pop();
                        break;
                    case 3: // Display stack
                        s.display();
                        break;
                    case 4: // Exit
                        System.out.println("Exiting...");
                        System.exit(0);
                    default:
                        System.out.println("Invalid choice! Please try again.");
                }
            } catch (IOException e) {
                System.out.println("IO Error: " + e.getMessage());
            }

            System.out.print("Enter 0 to quit or 1 to continue: ");
            c = Integer.parseInt(in.readLine());
        } while (c == 1);
    }
}
