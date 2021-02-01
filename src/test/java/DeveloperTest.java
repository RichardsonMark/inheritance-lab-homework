import org.junit.Before;
import org.junit.Test;
import techStaff.Developer;

import static org.junit.Assert.assertEquals;

public class DeveloperTest {

    Developer developer;

    @Before
    public void before(){
        developer = new Developer("Jim Halpert", "JS m4 d3 up B", 25000.00);
    }

    @Test
    public void hasName(){
        assertEquals("Jim Halpert", developer.getName());
    }

    @Test
    public void hasNiNumber(){
        assertEquals("JS m4 d3 up B", developer.getNiNumber());
    }

    @Test
    public void hasSalary(){
        assertEquals(25000.00, developer.getSalary(), 0.0);
    }

    @Test
    public void canRaiseSalary(){
        developer.raiseSalary(500.00);
        assertEquals( 25500.00, developer.getSalary(), 0.0);
    }

    @Test
    public void canPayBonus(){
        assertEquals(250.00, developer.payBonus(), 0.0);
    }
}
