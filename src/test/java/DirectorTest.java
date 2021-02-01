import management.Director;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class DirectorTest {

    Director director;

    @Before
    public void before(){
        director = new Director("David Wallace", "JN m4 d3 up D", 60000.00, "Software Sales", 20000.00);
    }

    @Test
    public void hasName(){
        assertEquals("David Wallace", director.getName());
    }

    @Test
    public void hasNiNumber(){
        assertEquals("JN m4 d3 up D", director.getNiNumber());
    }

    @Test
    public void hasSalary(){
        assertEquals(60000.00, director.getSalary(), 0.0);
    }

    @Test
    public void hasDeptName(){
        assertEquals("Software Sales", director.getDeptName());
    }

    @Test
    public void canRaiseSalary(){
        director.raiseSalary(5000.00);
        assertEquals( 65000.00, director.getSalary(), 0.0);
    }

    @Test
    public void canPayBonus(){
        assertEquals(600.00, director.payBonus(), 0.0);
    }

}
