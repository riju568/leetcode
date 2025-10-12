import java.util.*;

class MyStack {
    private Queue<Integer> mainQ = new LinkedList<>();  // Main queue holding stack elements
    private Queue<Integer> helperQ = new LinkedList<>(); // Helper queue for reordering

    // Push element x onto stack
    public void push(int x) {
        helperQ.add(x); // Add new element to helper queue
        // Move all elements from main queue to helper queue (so newest is on top)
        while (!mainQ.isEmpty()) helperQ.add(mainQ.remove());
        // Swap references so mainQ always has the latest order
        Queue<Integer> temp = mainQ;
        mainQ = helperQ;
        helperQ = temp;
    }

    // Remove and return the top element
    public int pop() {
        return mainQ.remove();
    }

    // Get the top element without removing it
    public int top() {
        return mainQ.peek();
    }

    // Check if the stack is empty
    public boolean empty() {
        return mainQ.isEmpty();
    }
}
