package singleton;

//eagle initialization -- initializam o singura data, foarte devreme. are dezavantaje
//lazy initialization -- amana initializarea cat se poate de mult. dezavantaje: daca rulam pe mai multe fire de executie, e posibil sa apelam constructorul pe ambele fire -> solutie: se pune synchronized

//atributele statice sunt initializate atunci cand clasa este referita

public class Repartitor {

    private static Repartitor repartitor = null;

    private Repartitor() {

    }

    public static synchronized Repartitor getInstance() {
        if(repartitor == null) {
            return repartitor = new Repartitor();
        }
        return repartitor;
    }
}
