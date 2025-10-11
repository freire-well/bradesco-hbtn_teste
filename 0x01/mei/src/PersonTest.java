import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.Date;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class PersonTest {
    Person p;
   @BeforeEach
   void setup(){
        p = new Person("Paul", "McCartney", new Date(2000, 8, 8), true, true,  true);

    }


    @Test
    void show_full_name(){
       assertEquals("Paul McCartney", p.fullName());
    }

    @Test
    void test_calculateYearlySalary(){
       p.setSalary(1200);
       assertEquals(14400 ,p.calculateYearlySalary());
    }

    @Test
    void person_is_MEI(){
       p.setSalary(8000);
       p.setPensioner(false);
       p.setAnotherCompanyOwner(false);
       p.setPublicServer(false);
       assertTrue(p.isMEI());
    }

    @Test
    void person_is_not_MEI(){
       p.setSalary(15000);
       p.setPensioner(true);
       p.setAnotherCompanyOwner(true);
       p.setPublicServer(true);

       assertFalse(p.isMEI());
    }
}
