package wtf.tena.stacker.setting;

public abstract class AbstractSetting {

    private static final Visibility YES;

    static {
        YES = () -> true;
    }

    private final String name;
    private final Visibility visibility;

    /*
    Do not let make instance from other classes
     */
    protected AbstractSetting(String name) {
        this.name = name;
        this.visibility = YES;
    }

    protected AbstractSetting(String name, Visibility visibility) {
        this.name = name;
        this.visibility = visibility;
    }

    public final String getName() {
        return this.name;
    }

}
