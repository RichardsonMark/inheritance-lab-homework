import management.Manager;
import org.junit.Before;
import org.junit.Test;
import techStaff.DatabaseAdmin;

import static org.junit.Assert.assertEquals;

public class DatabaseAdminTest {

    DatabaseAdmin databaseAdmin;

    @Before
    public void before(){
        databaseAdmin = new DatabaseAdmin("Dwight Schrute", "JM m4 d3 up A", 25000.00);
    }

    @Test
    public void hasName(){
        assertEquals("Dwight Schrute", databaseAdmin.getName());
    }

    @Test
    public void hasNiNumber(){
        assertEquals("JM m4 d3 up A", databaseAdmin.getNiNumber());
    }

    @Test
    public void hasSalary(){
        assertEquals(25000.00, databaseAdmin.getSalary(), 0.1);
    }

    @Test
    public void canRaiseSalary(){
        databaseAdmin.raiseSalary(500.00);
        assertEquals( 25500.00, databaseAdmin.getSalary(), 0.0);
    }

    @Test
    public void canPayBonus(){
        assertEquals(250.00, databaseAdmin.payBonus(), 0.0);
    }

}
