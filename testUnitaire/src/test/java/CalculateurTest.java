import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CalculateurTest {

    @Test
    @DisplayName("Test de la methode additionner")
    void additionner() {
        Assertions.assertEquals(2, Calculateur.additionner(1,1));
    }

    @Test
    @DisplayName("Test de la methode soustraire")
    void soustraire() {
        Assertions.assertEquals(2, Calculateur.soustraire(3,1));
    }

    @Test
    @DisplayName("Test de la methode multiplier")
    void multiplier() {
        Assertions.assertEquals(2, Calculateur.multiplier(1,2));
    }

    @Test
    @DisplayName("Test de la methode diviser")
    void diviser() {
        Assertions.assertEquals(2, Calculateur.diviser(4,2));
    }
}