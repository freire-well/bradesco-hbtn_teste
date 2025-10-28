import org.junit.jupiter.api.*;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;

import static org.junit.jupiter.api.Assertions.*;

public class PersonTest {
    private static Person person;
    @BeforeAll
    static void setup(){
        person = new Person();
    }

    @DisplayName("check_user_valid")
    @ParameterizedTest()
    @ValueSource(strings = {"PaulMcCartney2", "NeilArms2" })
    void check_user_valid(String input){
        assertTrue(person.checkUser(input));
    }


    @ParameterizedTest()
    @ValueSource(strings = {"Paul#McCartney", "Neil@Arms" })
    @DisplayName("check_user_not_valid")
    void check_user_not_valid(String input){
        assertFalse(person.checkUser(input));
    }

    @ParameterizedTest()
    @ValueSource(strings = {"123456789", "#$%1234" })
    @DisplayName("does_not_have_letters")
    void does_not_have_letters(String input){
        assertFalse(person.checkPassword(input));
    }

    @ParameterizedTest()
    @ValueSource(strings = {"Abcabcdefgh@", "#hbtn@%tc" })
    @DisplayName("does_not_have_numbers")
    void does_not_have_numbers(String input){ 
        assertFalse(person.checkPassword(input));
    }

    @ParameterizedTest()
    @ValueSource(strings = {"Abc@123", "12$@hbt" })
    @DisplayName("does_not_have_eight_chars")
    void does_not_have_eight_chars(String input){ 
        assertFalse(person.checkPassword(input));

    }

    @ParameterizedTest()
    @ValueSource(strings = {"abC123456$", "Hbtn@1234", "Betty@1#2", "Hbtn@123" })
    @DisplayName("check_password_valid")
    void check_password_valid(String input){ 
        assertTrue(person.checkPassword(input));

    }




}
