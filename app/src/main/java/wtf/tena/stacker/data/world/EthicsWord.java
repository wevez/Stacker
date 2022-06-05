package wtf.tena.stacker.data.world;

public class EthicsWord extends AbstractWord {

    private final EnumEthnics type;

    public EthicsWord(String name, String description, EnumEthnics type) {
        super(name, description);
        this.type = type;
    }

    public final EnumEthnics getType() {
        return this.type;
    }

    public static enum EnumEthnics {

    }
}
