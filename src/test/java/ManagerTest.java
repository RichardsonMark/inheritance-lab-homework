import management.Manager;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class ManagerTest {

    Manager manager;

    @Before
    public void before(){
        manager = new Manager("Michael Scott", "JT m4 d3 up C", 30000.00, "Software Sales");
    }

    @Test
    public void hasName(){
        assertEquals("Michael Scott", manager.getName());
    }

    @Test
    public void hasNiNumber(){
        assertEquals("JT m4 d3 up C", manager.getNiNumber());
    }

    @Test
    public void hasSalary(){
        assertEquals(30000.00, manager.getSalary(), 0.0);
    }

    @Test
    public void hasDeptName(){
        assertEquals("Software Sales", manager.getDeptName());
    }

    @Test
    public void canRaiseSalary(){
        manager.raiseSalary(500.00);
        assertEquals( 30500.00, manager.getSalary(), 0.0);
    }

    @Test
    public void canPayBonus(){
        assertEquals(300.00, manager.payBonus(), 0.0);
    }
}
