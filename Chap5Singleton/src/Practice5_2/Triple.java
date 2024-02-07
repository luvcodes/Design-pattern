package Practice5_2;

/**
 * @author ryanw
 */
public class Triple {
    private static Triple[] triples = new Triple[]{
            new Triple(0),
            new Triple(1),
            new Triple(2)
    };

    private int id;

    private Triple(int id) {
        this.id = id;
    }

    public static Triple getInstance(int id) {
        if (id < 0 || id >= triples.length) {
            throw new IllegalArgumentException("Invalid id");
        }
        return triples[id];
    }

    public int getId() {
        return id;
    }
}
