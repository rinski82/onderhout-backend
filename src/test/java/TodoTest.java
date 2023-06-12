import com.example.todoappbackend.model.Todo;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class TodoTest {

    @Test
    public void testNieuweTaak() {
        Todo todo = new Todo();
        todo.setTask("Nieuwe Taak");
        Assertions.assertEquals("Nieuwe Taak", todo.getTask());
    }

}
