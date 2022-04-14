import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;

class CalculateurTest {
    @Test
    @DisplayName("Test de la methode additionner")
    void additionner() {
        Assertions.assertEquals(2, Calculateur.additionner(1,1));
    }

    @ParameterizedTest
    @DisplayName("Test parametre de la methode additionner")
    @ValueSource(ints = {1 , 2, 3 ,4 ,10 ,20, 100})
    void additionnerParametrer(int nb) {
        Assertions.assertEquals(2 + nb, Calculateur.additionner(nb,2));
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