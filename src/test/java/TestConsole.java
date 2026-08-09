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
    

    /**
     * The Console should not register invalid new User details
     * Scenario:
     * Given that new user has invalid userInformation.
     * When they try to register--
     * Then the console should reject their registration details.
     */
    @Test
    public void ConsoleDoesNotRegisterNewUsersWithInvalidDetails() {
        // Given:
        String name = "sim";
        String password = "loki7yyy";

        // When:
        Console platform = new Console();
        String result = platform.register(name, password);

        String passwordStructure = "PASSWORD DENIED!\nPassword Structure:\n- Atleast 1 uppercase letter\n- Atleast 1 lowercase letter\n- More than 8 characters long\n- Atleast 1 number\n- Atleast 1 special character";

        // Then:
        assertNotNull(platform);
        assertNotNull(result);
        assertEquals(passwordStructure, result);
    }


    /**
     * The Console must not register already exsting users.
     * Scenarion:
     * Given that a user has already registered successfully.
     * When they attempt to register again--
     * Then their registration should fail.
     */
    @Test
    public void ConsoleDeniesRegistrationOfExistingUsers() {
        
        // Given:
        String name = "prince";
        String password = "choicE4@2";
        Console platform = new Console();
        String firstAttempt = platform.register(name, password);

        assertEquals("REGISTERED SUCCESSFULLY", firstAttempt);

        // When:
        String secondAttempt = platform.register(name, password);

        // Then:
        assertEquals("USERNAME ALREADY EXISTS", secondAttempt);
    }

    /**
     * The Console should login valid userInformation
     * Scenario:
     * Given that a user has registered successfully.
     * When they attempt to login with valid information--
     * Then they should be logged in successfully.
     */
    @Test
    public void ValidLoginInSucceeds() {
        // Given:
        String name = "thulani";
        String password = "Pastor@8";

        Console platform = new Console();
        platform.register(name, password);

        // When:
        String result = platform.login(name, password);

        // Then:
        assertNotNull(result);
        assertEquals("LOGGED IN SUCCESSFULLY!", result);
    }

    /**
     * The Console should deny invalid password login
     * Scenario:
     * Given that a new user has successfully registered.
     * When they attempt to login with incorrect passowrd--
     * Then they should be denied access.
     */
    @Test
    public void ConsoleDeniesIncorrectPasswordLogin(){
        // Given:
        String name = "sizwe";
        String password = "Zwe@mbal1";
        Console platform = new Console();
        platform.register(name, password);

        // When:
        String result = platform.login(name, "Zwe@mhal1");

        // Then:
        assertNotNull(result);
        assertEquals("INCORRECT PASSWORD!", result);
    }
}
