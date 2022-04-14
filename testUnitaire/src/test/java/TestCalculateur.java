import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

public class TestCalculateur {

    @DisplayName("Test méthode additionner")
    @Test
    void testAdditionner(){
        Assertions.assertEquals(2, Calculateur.additionner(1,1));
    }

    @DisplayName("Test méthode soustraire")
    @Test
    void testSoustraire(){
        Assertions.assertEquals(2, Calculateur.soustraire(3,1));
    }

    @DisplayName("Test méthode multiplier")
    @Test
    void testMultiplier(){
        Assertions.assertEquals(2, Calculateur.multiplier(1,2));
    }

    @DisplayName("Test méthode diviser")
    @Test
    void testDiviser(){
        Assertions.assertEquals(2, Calculateur.diviser(4,2));
    }
}
