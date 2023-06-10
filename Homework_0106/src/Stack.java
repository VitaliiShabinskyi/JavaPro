import java.util.ArrayList;
import java.util.List;

public class Stack<T> {
    private List<T> stack;

    public Stack() {
        stack = new ArrayList<>();
    }

    public void push(T element) {
        stack.add(element);
    }

    public T pop() {
        if (isEmpty()) {
            System.out.println("Stack is Empty");
        }
        return stack.remove(stack.size() - 1);
    }

    public boolean isEmpty() {
        return stack.isEmpty();
    }
}
