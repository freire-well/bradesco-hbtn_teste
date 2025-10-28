import org.junit.jupiter.api.*;
import static org.junit.jupiter.api.Assertions.*;

public class PersonTest {
    private static Person person;
    @BeforeAll
    static void setUp(){
        person = new Person();
    }

    @Test
    @DisplayName("check_user_valid")
    void check_user_valid(){
        person = new Person("PaulMcCartney2");
        assertTrue(person.checkUser());
        person = new Person("NeilArms2");
        assertTrue(person.checkUser());
    }


    @Test
    @DisplayName("check_user_not_valid")
    void check_user_not_valid(){
        person = new Person("Paul#McCartney");
        assertFalse(person.checkUser());
        person = new Person("Neil@Arms");
        assertFalse(person.checkUser());
    }

    @Test
    @DisplayName("does_not_have_letters")
    void does_not_have_letters(){
        person.setPassword("123456789");
        assertFalse(person.checkPassword());
        person.setPassword("#$%1234");
        assertFalse(person.checkPassword());
    }

    @Test
    @DisplayName("does_not_have_numbers")
    void does_not_have_numbers(){
        person.setPassword("Abcabcdefgh@");
        assertFalse(person.checkPassword());
        person.setPassword("#hbtn@%tc");
        assertFalse(person.checkPassword());
    }

    @Test
    @DisplayName("does_not_have_eight_chars")
    void does_not_have_eight_chars(){
        person.setPassword("Abc@123");
        assertFalse(person.checkPassword());
        person.setPassword("12$@hbt");
        assertFalse(person.checkPassword());

    }

    @Test
    @DisplayName("check_password_valid")
    void check_password_valid(){
        person.setPassword("abC123456$");
        assertTrue(person.checkPassword());
        person.setPassword("Hbtn@1234");
        assertTrue(person.checkPassword());
        person.setPassword("Betty@1#2");
        assertTrue(person.checkPassword());
        person.setPassword("Hbtn@123");
        assertTrue(person.checkPassword());

    }




}
