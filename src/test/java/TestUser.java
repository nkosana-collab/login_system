import com.prince.User;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;

import org.junit.jupiter.api.*;

public class TestUser {

    /**
     * Given that I have a valid username and userpassowrd.
     * When I create an object with the details.
     * Then the system should store the user details.
     */
    @Test
    public void UserStoreValidNameAndPassword() {
        // Given and When
        User Nathi = new User("nkosinathi", "Nathi@7you");

        // Then
        assertNotNull(Nathi);
        assertEquals("nkosinathi", Nathi.getName());
        assertEquals("Nathi@7you", Nathi.getPassword());
    }
}
