import com.netcracker.laba1.Person;
import org.junit.Test;
import org.junit.Before;
import static org.junit.Assert.assertEquals;

import java.time.LocalDate;

public class PersonTest {

    Person person;

    @Before
    public void setUp() {
        person = new Person();
    }

    @Test
    public void testGetAge() {
        person.getAge(LocalDate.of(2002, 1, 4));
        assertEquals(19, person.getAge(LocalDate.of(2002, 1, 4)));
    }
}
