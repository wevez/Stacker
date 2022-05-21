package wtf.tena.stacker.data.world;

public abstract class AbstractWord {

    // the name of word
    private final String name;
    // the description of word
    private final String description;

    public AbstractWord(String name, String description) {
        this.name = name;
        this.description = description;
    }

    public final String getDescription() {
        return this.description;
    }
    public final String getName() { return this.name; }
}
