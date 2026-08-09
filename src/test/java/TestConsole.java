import com.prince.Console;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;

import org.junit.jupiter.api.*;

public class TestConsole {

    /**
     * The Console should Resgister new users with valid userInformation.
     * Scenario:
     * Given that a new user has a valid userName and userPassword.
     * When they register with the details--
     * Then they should get confirmation of successful registration.
     */
    @Test
    public void ConsoleSuccefullyRegisterValidNewUser() {
        // Given:
        String name = "siyabonga";
        String password = "Look@meX7";

        // When:
        Console platform = new Console();
        String result = platform.register(name, password);

        // Then:
        assertNotNull(platform);
        assertEquals(result, "REGISTERED SUCCESSFULLY");
    }
}
