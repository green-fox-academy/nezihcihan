import java.util.ArrayList;
import java.util.IdentityHashMap;
import java.util.Map;

public class Todo {
    private static final Map<Todo, Long> registry = new IdentityHashMap<>();
    private static long nextId = 0;

    public static long idFor(Todo o) {
        Long l = registry.get(o);
        if (l == null)
            registry.put(o, l = nextId++);
        return l;
    }
    public static void remove(Todo o) {
        registry.remove(o);
    }
    public Todo() {

    }

    public static void main(String[] args) {
        Todo t = new Todo();
        Todo t1 = new Todo();
        Todo t3 = new Todo();
        Todo t4 = new Todo();
        System.out.println(t4.);
    }
}