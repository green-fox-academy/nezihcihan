import java.util.ArrayList;

public class Todo {
    int completeAt;
    int createdAt;

    ArrayList<ID> idList;

    public Todo() {
        final ID id = new ID();
        idList = new ArrayList<ID>();
        idList.add(id);
    }

    final class ID {
        @Override
        public boolean equals(Object o) {
            return this == o;
        }
    }

    public void complitionTime() {

    }
}