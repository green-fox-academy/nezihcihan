import java.util.List;

public interface Persistance {
    void save(Todo task);
    void saveAll(List<Todo> task);
    void load(int n);
    void load(String s);
    void loadAll();
}
