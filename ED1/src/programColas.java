import java.util.LinkedList;
import java.util.Queue;

public class programColas {
    public static void main(String[] args) {
        Queue<Integer> cola = new LinkedList();
        for (int i = 0; i < 10; i++) {
            cola.offer(i);
        }
        System.out.println(cola.peek());
    }
}