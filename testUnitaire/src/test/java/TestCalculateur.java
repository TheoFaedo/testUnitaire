import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class TestCalculateur {
    @Test
    public void testAdditionner(){
        Assertions.assertEquals(2, Calculateur.additionner(1,1));
    }

    @Test
    public void testSoustraire(){
        Assertions.assertEquals(2, Calculateur.soustraire(3,1));
    }

    @Test
    public void testMultiplier(){
        Assertions.assertEquals(2, Calculateur.multiplier(1,2));
    }

    @Test
    public void testDiviser(){
        Assertions.assertEquals(2, Calculateur.diviser(4,2));
    }
}
