public class Calculateur {

    /**
     * Méthode qui additionne un entier a à un entier b
     * @param a : premier entier
     * @param b : deuxième entier
     * @return la somme de a et b
     */
    public static int additionner(int a, int b){
        return a+b;
    }

    /**
     * Méthode qui soustrait un entier a à un entier b
     * @param a : entier qu'on souhaite soustraire
     * @param b : entier à soustraire
     * @return la différence de a par b
     */
    public static int soustraire(int a, int b){
        return a-b;
    }

    /**
     * Méthode qui multiplie un entier a par un entier b
     * @param a : premier entier
     * @param b : deuxième entier
     * @return le produit de a et b
     */
    public static int multiplier(int a, int b){
        return a*b;
    }

    /**
     * Méthode qui divise un entier a par un entier b (division euclidienne)
     * @param a : dividende
     * @param b : diviseur
     * @return le quotient de a par b
     */
    public static int diviser(int a, int b){
        return a/b;
    }
}
