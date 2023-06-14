import com.example.todoappbackend.model.User;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class UserTest {

    @Test
    public void testNieuweUser() {
        User user = new User();
        user.setUsername("Nieuwe User");
        Assertions.assertEquals("Nieuwe User", user.getUsername());
    }

}
